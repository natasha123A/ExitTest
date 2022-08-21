import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './user/signup/signup.component'
import { LoginComponent } from './user/login/login.component'
import { SessionComponent } from './user/session/session.component';
import { AuthGuard } from './shared/auth.guard';
import { SearchComponent } from './user/session/search/search.component';
import { GetdescriptionComponent } from './user/session/getdescription/getdescription.component';


const routes: Routes = [
  { path: 'registration', component: SignupComponent },
  { path: 'login', component: LoginComponent },
  { path: '', redirectTo: '/registration', pathMatch: 'full' },
  {
    path: 'session',canActivate:[AuthGuard],
    children: [
      {path:'',component:SessionComponent},
      {path:'search',component:SearchComponent},
      {path:'getdescription',component:GetdescriptionComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
