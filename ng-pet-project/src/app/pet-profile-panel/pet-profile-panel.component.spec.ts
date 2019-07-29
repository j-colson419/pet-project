import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetProfilePanelComponent } from './pet-profile-panel.component';

describe('PetProfilePanelComponent', () => {
  let component: PetProfilePanelComponent;
  let fixture: ComponentFixture<PetProfilePanelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetProfilePanelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetProfilePanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
