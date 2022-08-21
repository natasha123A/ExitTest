import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup } from '@angular/forms';
import {ProductCatalogService} from '../../product-catalog.service'
import {Router} from '@angular/router'
import {UserModel} from '../user.model'
import { HttpErrorResponse } from '@angular/common/http';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.sass']
})
export class SignupComponent implements OnInit {

  constructor(private router:Router,private productService: ProductCatalogService) { }

  ngOnInit(): void {
  }

  message ="";
  errorMessage="";
  signupForm = new FormGroup({
    firstName:new FormControl(''),
    lastName:new FormControl(''),
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
    this.userModelObj.email=this.signupForm.value.mail;
    this.userModelObj.firstName=this.signupForm.value.firstName;
    this.userModelObj.lastName=this.signupForm.value.lastName;
    this.userModelObj.password=this.signupForm.value.passwd;
    this.productService.registerUser(this.userModelObj).subscribe( (res) => {
      this.router.navigate(['login']);
   },(error:HttpErrorResponse) => {
    this.errorMessage="Email already exists in Data Base Use another email";
});
  }

}
