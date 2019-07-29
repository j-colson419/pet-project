import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PetProfileComponent } from './pet-profile/pet-profile.component';
import { PetNavComponent } from './pet-nav/pet-nav.component';

@NgModule({
  declarations: [
    AppComponent,
    PetProfileComponent,
    PetNavComponent
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
