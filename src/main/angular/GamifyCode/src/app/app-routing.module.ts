import { NgModule } from '@angular/core';
import { RouterModule, Routes } from "@angular/router";
import { ROUTE_CONSTANTS } from "./util/ROUTE_CONSTANTS";

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(ROUTE_CONSTANTS.ROUTES) ]
})
export class AppRoutingModule { }
