import { HttpBackend } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { filter } from 'rxjs';
import { ProductCatalogService } from 'src/app/product-catalog.service';
import { ProductModel } from '../../product.model';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.sass']
})
export class SearchComponent implements OnInit {
  display = false;
  productModelObj: ProductModel = new ProductModel();
  data: ProductModel[] = [];
  minRange = 1;
  maxRange = 500000;
  pcs=""; // query Parameter variables for productCode
  pb=""; //  query Parameter variables for productBrand
  pns=""; //  query Parameter variables for product Name
  constructor(private router: Router, private activatedRoute: ActivatedRoute, private productService: ProductCatalogService) { }

  priceFilterForm = new FormGroup({
    productPriceRange: new FormControl('')
  });

  ngOnInit(): void {

    this.activatedRoute.queryParams.subscribe(params => {
      this.productModelObj.productBrand = this.pb = (params["pb"].length) ? params["pb"] : "";
      this.productModelObj.productCode = this.pcs = (params["pcs"].length) ? params["pcs"] : "";
      this.productModelObj.productName = this.pns = (params["pns"].length) ? params["pns"] : "";
      this.productModelObj.productPricemaxRange = 500000;
      this.productModelObj.productPriceminRange = 1;

    });

    this.productService.searchProduct(this.productModelObj).subscribe((res) => {
      this.data = res;
    });

  }

  back() {

    this.productModelObj.productPricemaxRange = 500000;
    this.productModelObj.productPriceminRange = 1;
    this.productService.searchProduct(this.productModelObj).subscribe((res) => {
      this.data = res;
    });
    this.router.navigate(['/session','search'], { queryParams: { pc: this.productModelObj.productCode, pn: this.productModelObj.productName, pb: this.productModelObj.productBrand } });
  
  }

  priceFunc() {
    this.display = true;
  }

  logoutFunc() {
    localStorage.removeItem("token");
    this.router.navigate(['login']);
  }

  home(){
    this.router.navigate(['/session']);
  }

  filterDetails() {
    this.productModelObj.productPricemaxRange = parseInt(this.priceFilterForm.value.productPriceRange.slice(this.priceFilterForm.value.productPriceRange.indexOf('|') + 1));
    this.productModelObj.productPriceminRange = parseInt(this.priceFilterForm.value.productPriceRange.slice(0, this.priceFilterForm.value.productPriceRange.indexOf('|')));

    this.productService.searchProduct(this.productModelObj).subscribe((res) => {
      this.data = res;
    });

  }




}

