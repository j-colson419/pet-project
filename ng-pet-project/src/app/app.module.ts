import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PetProfileComponent } from './pet-profile/pet-profile.component';
import { PetNavComponent } from './pet-nav/pet-nav.component';
import { PetProfilePanelComponent } from './pet-profile-panel/pet-profile-panel.component';
import { PetFeedComponent } from './pet-feed/pet-feed.component';
import { NewPostComponent } from './new-post/new-post.component';
import { PetPostComponent } from './pet-post/pet-post.component';

@NgModule({
  declarations: [
    AppComponent,
    PetProfileComponent,
    PetNavComponent,
    PetProfilePanelComponent,
    PetFeedComponent,
    NewPostComponent,
    PetPostComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
