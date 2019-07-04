import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchContactNumberComponent } from './search-contact-number.component';

describe('SearchContactNumberComponent', () => {
  let component: SearchContactNumberComponent;
  let fixture: ComponentFixture<SearchContactNumberComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchContactNumberComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchContactNumberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
