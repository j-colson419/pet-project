import { Component } from '@angular/core';

@Component({
  selector: 'app-pet-profile-panel',
  templateUrl: './pet-profile-panel.component.html',
  styleUrls: ['./pet-profile-panel.component.css']
})
export class PetProfilePanelComponent {
  
  public profileImage = 'url(.././assets/kitten.png)';
  public petName : string = 'pet name';
  public lastPostDate : Date = new Date();
  constructor() { }

}
