import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MusicPuzzleComponent } from './music-puzzle.component';

describe('MusicPuzzleComponent', () => {
  let component: MusicPuzzleComponent;
  let fixture: ComponentFixture<MusicPuzzleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MusicPuzzleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MusicPuzzleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
