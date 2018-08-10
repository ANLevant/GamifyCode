import { NgModule } from '@angular/core';
import { RouterModule, Routes } from "@angular/router";
import {CONSTANTS} from "./util/Constants";

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(CONSTANTS.routes) ]
})
export class AppRoutingModule { }
