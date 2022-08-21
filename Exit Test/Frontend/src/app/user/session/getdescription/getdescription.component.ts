import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductCatalogService } from 'src/app/product-catalog.service';
import { ProductModel } from '../../product.model';

@Component({
  selector: 'app-getdescription',
  templateUrl: './getdescription.component.html',
  styleUrls: ['./getdescription.component.sass']
})
export class GetdescriptionComponent implements OnInit {
  message="";
  pb="";
  pcs="";
  pns="";
  pid="";
  data:any;
  constructor(private router:Router, private activatedRoute:ActivatedRoute,private productService:ProductCatalogService) { }

  checkServiceabilityForm=new FormGroup({
    pinCode: new FormControl('')
  });

  ngOnInit(): void {

    this.activatedRoute.queryParams.subscribe(params => {
       this.pb = (params["pb"].length) ? params["pb"] : "";
       this.pcs = (params["pcs"].length) ? params["pcs"] : "";
       this.pns = (params["pns"].length) ? params["pns"] : "";
       this.pid = (params["pc"]);
    })

    this.productService.getProduct(this.pid).subscribe((res)=>{
      this.data = res;
      console.log(this.data);
    });

  }

  clearFunc(){
    this.message="";
  }

  checkServiceability(){
    this.productService.checkServiceability(this.pid,this.checkServiceabilityForm.value.pinCode).subscribe((res)=>{
      if(res===false){
        this.message="Service Not Available at this PinCode";
      }
      else{
        this.message="Service Available";
      }
    })
  }

  logoutFunc(){
    localStorage.removeItem("token");
    this.router.navigate(['login']);
  }

  back() {

    this.router.navigate(['/session','search'], { queryParams: { pc: this.pcs, pn: this.pns, pb: this.pb } });
  
  }

}
