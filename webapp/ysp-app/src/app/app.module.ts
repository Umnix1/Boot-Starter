import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from "@angular/material";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing/app-routing.module';
import { PagesModule } from "app/pages/pages.module";
import { ServicesModule } from "app/services/services.module";
import { SharedModule } from "app/shared/shared.module";

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpModule,
    PagesModule, 
    ServicesModule,
    SharedModule,
    MaterialModule,
  ],
  exports: [
    AppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpModule,
    PagesModule, 
    ServicesModule,
    SharedModule,
    MaterialModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
