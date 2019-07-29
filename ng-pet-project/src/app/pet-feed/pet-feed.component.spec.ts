import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetFeedComponent } from './pet-feed.component';

describe('PetFeedComponent', () => {
  let component: PetFeedComponent;
  let fixture: ComponentFixture<PetFeedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetFeedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetFeedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
