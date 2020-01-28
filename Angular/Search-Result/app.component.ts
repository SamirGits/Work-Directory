import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'route-bass-app';
  constructor(private router: Router){

  }
  searchCall(srch:HTMLInputElement){
    if(srch.value !="")
    {
      this.router.navigate(['search/' +srch.value]);
    }    
}
}