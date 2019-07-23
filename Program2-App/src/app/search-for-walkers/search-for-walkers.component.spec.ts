import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchForWalkersComponent } from './search-for-walkers.component';

describe('SearchForWalkersComponent', () => {
  let component: SearchForWalkersComponent;
  let fixture: ComponentFixture<SearchForWalkersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchForWalkersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchForWalkersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
