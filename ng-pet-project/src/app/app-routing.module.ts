import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PetProfileComponent } from './pet-profile/pet-profile.component';


const routes: Routes = [
  {
    path: 'pet-profile',
    component: PetProfileComponent
  },
  {
    path: '',
    component: PetProfileComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
