import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { SearchResultComponent } from './search-result/search-result.component';


const routes: Routes = [
  //search result
  
  { path:"", redirectTo : "home", pathMatch: "full"},
  { path:"home", component:HomeComponent },
  { path:"contactus", component:ContactComponent },
  { path:"aboutus", component:AboutComponent},
  { path:"search/:searchText", component:SearchResultComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
