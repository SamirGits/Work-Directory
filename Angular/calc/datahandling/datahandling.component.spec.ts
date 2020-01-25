import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DatahandlingComponent } from './datahandling.component';

describe('DatahandlingComponent', () => {
  let component: DatahandlingComponent;
  let fixture: ComponentFixture<DatahandlingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DatahandlingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DatahandlingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
