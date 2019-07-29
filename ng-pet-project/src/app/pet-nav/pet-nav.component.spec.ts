import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetNavComponent } from './pet-nav.component';

describe('PetNavComponent', () => {
  let component: PetNavComponent;
  let fixture: ComponentFixture<PetNavComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetNavComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetNavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
