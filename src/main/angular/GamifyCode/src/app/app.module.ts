import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";

import { AppComponent } from './app.component';
import { MessagesComponent } from './messages/messages.component';
import { AppRoutingModule } from './/app-routing.module';
import { AdministrativeLayoutModule } from "./administrative-layout/administrative-layout.module";
import {MatIcon, MatIconModule, MatMenuModule, MatSidenavModule, MatToolbarModule} from "@angular/material";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { TitleToolbarComponent } from './title-toolbar/title-toolbar.component';
import {SideNavService} from "./services/side-nav.service";

@NgModule({
  declarations: [
    AppComponent,
    MessagesComponent,
    TitleToolbarComponent,
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
    MatIconModule,
    MatMenuModule
  ],
  exports: [
    MatSidenavModule,
    MatToolbarModule,
    MatIconModule,
    MatMenuModule
  ],
  providers: [SideNavService],
  bootstrap: [AppComponent]
})
export class AppModule { }
