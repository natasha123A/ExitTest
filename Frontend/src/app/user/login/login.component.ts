
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { ProductCatalogService } from 'src/app/product-catalog.service';
import { UserModel } from '../user.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.sass']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router,private productService: ProductCatalogService) { }

  ngOnInit(): void {
  }

  message ="";
  errorMessage="";
  loginForm = new FormGroup({
    mail:new FormControl(''),
    passwd: new FormControl('')
  });

  userModelObj : UserModel = new UserModel();

  changeFunc(){
    this.errorMessage="";
}

homeFunc(){
  this.router.navigate(['']);
}

  userDetails(){
    this.userModelObj.email=this.loginForm.value.mail;
    this.userModelObj.password=this.loginForm.value.passwd;
     this.productService.authenticateUser(this.userModelObj).subscribe( (res) => {
       this.message=res;
       // if token is allready there no new token will be stored
       
         localStorage.setItem("token",this.message.slice(this.message.indexOf('|')+1));
         this.router.navigate(['session']);
   },(error:HttpErrorResponse) => {
    this.errorMessage="Invalid Credentials";
});
  }
}
