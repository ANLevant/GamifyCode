import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LeftSlideableMenuComponent } from './left-slideable-menu.component';

describe('LeftSlideableMenuComponent', () => {
  let component: LeftSlideableMenuComponent;
  let fixture: ComponentFixture<LeftSlideableMenuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LeftSlideableMenuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LeftSlideableMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
