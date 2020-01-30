import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Header/header/header.component';
import { UserHeaderComponent } from './Header/user-header/user-header.component';
import { LoginComponent } from './Logins/login/login.component';
import { RegistrationComponent } from './Logins/registration/registration.component';
import { GalleryComponentComponent } from './MyMedia/gallery-component/gallery-component.component';
import { UploadMediaComponent } from './MyMedia/upload-media/upload-media.component';
import { MultipleMediaComponent } from './MyMedia/multiple-media/multiple-media.component';
import { MediaDetailComponent } from './MyMedia/media-detail/media-detail.component';
import { FollowComponent } from './MyMedia/follow/follow.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    UserHeaderComponent,
    LoginComponent,
    RegistrationComponent,
    GalleryComponentComponent,
    UploadMediaComponent,
    MultipleMediaComponent,
    MediaDetailComponent,
    FollowComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
