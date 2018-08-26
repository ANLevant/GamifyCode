import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";

import { AppComponent } from './app.component';
import { MessagesComponent } from './messages/messages.component';
import { AppRoutingModule } from './/app-routing.module';
import { AdministrativeLayoutModule } from "./administrative-layout/administrative-layout.module";
import { LeftSlideableMenuComponent } from './left-slideable-menu/left-slideable-menu.component';
import {MatPaginatorModule, MatSidenavModule, MatSortModule, MatTableModule, MatToolbarModule} from "@angular/material";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { TitleToolbarComponent } from './title-toolbar/title-toolbar.component';

@NgModule({
  declarations: [
    AppComponent,
    MessagesComponent,
    LeftSlideableMenuComponent,
    TitleToolbarComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AdministrativeLayoutModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    MatSidenavModule,
    MatToolbarModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule
  ],
  exports: [
    MatSidenavModule,
    MatToolbarModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
