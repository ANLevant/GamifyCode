import { NgModule } from '@angular/core';
import { RouterModule, Routes } from "@angular/router";
import {CONSTANTS} from "./util/Constants";

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(CONSTANTS.ROUTES) ]
})
export class AppRoutingModule { }
