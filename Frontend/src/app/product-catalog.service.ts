import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {UserModel} from './user/user.model';
import {map} from 'rxjs';
import { ProductModel } from './user/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductCatalogService {

  constructor(private http:HttpClient) { }
  private url = "http://20.219.159.177:8443";
  
  registerUser(userData:UserModel){
    return this.http.post<UserModel>(this.url+"/createuser",userData).pipe(map((res:any)=>{
      return res;
    }));
  }

  authenticateUser(userData:UserModel){
    return this.http.post(this.url+"/authenticate",userData,{responseType: 'text'}).pipe(map((res:any)=>{
      return res;
    }))
  }

  getProductBrands(){
    return this.http.post<any>(this.url+"/session",null).pipe(map((res:any)=>{
      return res;
    }))
  }

  searchProduct(productDetail:ProductModel){
    return this.http.post<any>(this.url+"/session/search",productDetail).pipe(map((res:any)=>{
      return res;
    }))
  }

  getProduct(pid:string){
    return this.http.post<ProductModel>(this.url+"/session/getDetails",pid).pipe(map((res:any)=>{
      return res;
    }))
  }

  checkServiceability(pid:string,pin:number){
    return this.http.post<any>(this.url+"/session/isDeliverable?pid="+pid+"&pcode="+pin,null).pipe(map((res:any)=>{
      return res;
    }));
  }
}
