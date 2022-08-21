import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetdescriptionComponent } from './getdescription.component';

describe('GetdescriptionComponent', () => {
  let component: GetdescriptionComponent;
  let fixture: ComponentFixture<GetdescriptionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetdescriptionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetdescriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
