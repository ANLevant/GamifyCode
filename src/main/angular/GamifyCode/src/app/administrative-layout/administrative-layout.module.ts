import { NgModule } from '@angular/core';
import { UserManagementComponent } from "../user-management/user-management.component";
import { UserDetailComponent } from "../user-detail/user-detail.component";
import { DashboardComponent } from "../dashboard/dashboard.component";
import { AdministrativeLayoutComponent } from "./administrative-layout.component";
import { AdministrativeLayoutRoutingModule } from "./administrative-layout-routing.module";
import {UserService} from "../services/user.service";
import {RoleService} from "../services/role.service";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    UserManagementComponent,
    UserDetailComponent,
    DashboardComponent,
    AdministrativeLayoutComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AdministrativeLayoutRoutingModule,
  ],
  providers: [UserService, RoleService]
})
export class AdministrativeLayoutModule { }
