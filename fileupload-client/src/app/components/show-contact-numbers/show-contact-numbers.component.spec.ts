import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowContactNumbersComponent } from './show-contact-numbers.component';

describe('ShowContactNumbersComponent', () => {
  let component: ShowContactNumbersComponent;
  let fixture: ComponentFixture<ShowContactNumbersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowContactNumbersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowContactNumbersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
