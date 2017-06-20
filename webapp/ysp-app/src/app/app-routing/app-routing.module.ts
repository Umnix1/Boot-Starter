import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { MusicPuzzleComponent } from '../pages/music-puzzle/music-puzzle.component';


const routes: Routes = [
	{ path: '', redirectTo: '/music-puzzle', pathMatch: 'full' },
	{ path: 'music-puzzle', component: MusicPuzzleComponent },
	// { path: '**', component: Four04Component },
];


@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
export class AppRoutingModule { }
