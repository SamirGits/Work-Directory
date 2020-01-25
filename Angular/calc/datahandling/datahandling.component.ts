import { Component, OnInit } from '@angular/core';
import { stringify } from 'querystring';

@Component({
  selector: 'app-datahandling',
  templateUrl: './datahandling.component.html',
  styleUrls: ['./datahandling.component.css']
})
export class DatahandlingComponent {
  name:string;
  age:number;
  email:string;
  job:string;

  constructor() {
    this.name="First";
    this.age=20;
    this.email="First@email.com";
    this.job="Developer";
   }
   changeVal():void{
    this.name="Second";
    this.age=15;
    this.email="Second@email.com";
     
   }
}
   

   
