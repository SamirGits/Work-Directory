import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './Logins/login/login.component';
import { HeaderComponent } from './Header/header/header.component';
import { UserHeaderComponent } from './Header/user-header/user-header.component';
import { FollowComponent } from './MyMedia/follow/follow.component';
import { GalleryComponentComponent } from './MyMedia/gallery-component/gallery-component.component';
import { MediaDetailComponent } from './MyMedia/media-detail/media-detail.component';
import { MultipleMediaComponent } from './MyMedia/multiple-media/multiple-media.component';
import { UploadMediaComponent } from './MyMedia/upload-media/upload-media.component';
import { AuthGuardService } from './service/auth-guard-service.service';


const routes: Routes = [
  //route objects
  { path:"", redirectTo : "login", pathMatch: "full"},
  {path:"header",component:HeaderComponent},
  {path:"user-header",component:UserHeaderComponent},
  { path:"login", component:LoginComponent},


    //connect the guard service
     { path:"follow", component: FollowComponent, canActivate : [AuthGuardService]},
    { path:"gallery-component", component: GalleryComponentComponent, canActivate : [AuthGuardService]},
    { path:"media-detail", component: MediaDetailComponent, canActivate : [AuthGuardService]},
    { path:"multiple-media", component: MultipleMediaComponent, canActivate : [AuthGuardService]},
    { path:"upload-media", component: UploadMediaComponent, canActivate : [AuthGuardService]},
/*
     // <url>/:<name by which data is accessed>
    { path:"search/:searchText", component: SearchResultComponent},

    // add a fallback mapping
    { path:"**", component: ErrorComponent}
    */
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
