import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductCatalogService } from 'src/app/product-catalog.service';
import {ProductModel} from '../product.model'
@Component({
  selector: 'app-session',
  templateUrl: './session.component.html',
  styleUrls: ['./session.component.sass']
})
export class SessionComponent implements OnInit {

  name="";
  errorMessage="";
  data: string[]=[];
  productModelObj : ProductModel = new ProductModel();

  constructor(private router:Router, private activatedRoute:ActivatedRoute,private productService:ProductCatalogService) { }

  ngOnInit(): void {
    this.productService.getProductBrands().subscribe((res)=>{
      this.data=res;
    })
  }


  changeFunc(){
    this.errorMessage="";
}
  searchForm = new FormGroup({
    productCode:new FormControl(''),
    productBrand: new FormControl(''),
    productName:new FormControl('')
  });

  
  logoutFunc(){
    localStorage.removeItem("token");
    this.router.navigate(['login']);
  }

  productDetails(){
    this.productModelObj.productBrand=this.searchForm.value.productBrand;
    this.productModelObj.productCode=this.searchForm.value.productCode;
    this.productModelObj.productName=this.searchForm.value.productName; 
    
    if(!this.productModelObj.productBrand&&!this.productModelObj.productCode&&!this.productModelObj.productName){
      this.router.navigate(['/session','search'],{queryParams:{pcs:"",pns:"",pb:""}});
    }
    else{
      this.router.navigate(['/session','search'],{queryParams:{pcs:this.productModelObj.productCode,pns:this.productModelObj.productName,pb:this.productModelObj.productBrand}});
    }
  }
}
