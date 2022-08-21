import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {RouterModule, Routes} from '@angular/router'
import {UserModule} from './user/user.module'
import {SignupComponent} from './user/signup/signup.component'
import {LoginComponent} from './user/login/login.component'
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule,HttpHeaderResponse,HttpHeaders } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    UserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
