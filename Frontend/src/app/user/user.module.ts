import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { ReactiveFormsModule } from '@angular/forms';
import { SessionComponent } from './session/session.component';
import { SearchComponent } from './session/search/search.component';
import { GetdescriptionComponent } from './session/getdescription/getdescription.component';


@NgModule({
  declarations: [
    LoginComponent,
    SignupComponent,
    SessionComponent,
    SearchComponent,
    GetdescriptionComponent,
  ],
  imports: [
    CommonModule,
    UserRoutingModule,
    ReactiveFormsModule
  ]
})
export class UserModule { }
