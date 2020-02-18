import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

const VALIDATION_URL = "http://localhost:9090/bootapp-hibernate-jpa-secure/login";

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(public http : HttpClient) { }

  //  check userid/pass and authenticate 
  /*authenticate(userid : string, password : string): boolean{
    // hard-coded validation
    if(userid === "First" && password === "abc"){
      //  need to maintain session
      // sessionStorage object is auto available
      sessionStorage.setItem("user", userid);
      return true;
    }else{
      return false;
    }
  }*/

  authenticate(userid : string, password : string){
    // create a security token
    let authenticationToken = "Basic " + window.btoa(userid + ":" + password);
    console.log(authenticationToken);

    let headers = new HttpHeaders({
      Authorization : authenticationToken
    });

    // send the request
    return this.http.get(VALIDATION_URL, {headers}).pipe(
      // success function
      map(successData=>{
        sessionStorage.setItem("user", userid);
        // save the token
        sessionStorage.setItem("token", authenticationToken);
        return successData;
      }),
      // failure function
      map(failureData=>{
        // console message 
        return failureData;
      })
    );
  }

  // method to get the token
  getAuthenticationToken(){
    if(this.isUserLoggedIn())
      return sessionStorage.getItem("token");
    return null; 
  }

  // to check if user if logged in or not
  isUserLoggedIn(): boolean{
    // check if sessionStorage contains key 'user'
    let user = sessionStorage.getItem('user');
    if(user == null)
      return false;
    return true;  
  }

  // logout
  logout(){
    // remove the key/value pair of 'user'
    sessionStorage.removeItem('user');
    // sessionStorage.clear();
  }

  // get user Details
  getUserDetails():string{
    let user = sessionStorage.getItem('user');
    return user;
  }
}
