import {UserManagementComponent} from "../user-management/user-management.component";
import {DashboardComponent} from "../dashboard/dashboard.component";
import {UserDetailComponent} from "../user-detail/user-detail.component";
import {AdministrativeLayoutComponent} from "../administrative-layout/administrative-layout.component";

export const ROUTE_CONSTANTS = {
  MAIN_ROUTES : [
    {
      path: "",
      redirectTo: "/administrative",
      pathMatch: "full"
    },
    {
      path: "administrative",
      component: AdministrativeLayoutComponent,
    },
    {
      path: "administrative/dashboard",
      redirectTo: "/administrative",
      pathMatch: "full"
    },
    {
      path: "administrative/users",
      redirectTo: "/administrative",
      pathMatch: "full"
    },
    {
      path: "administrative/users/:id",
      redirectTo: "/administrative",
      pathMatch: "full"
    }
  ],
  ADMINISTRATIVE_ROUTES: [
    {
      path: "administrative",
      component:  AdministrativeLayoutComponent,
      children:[
        {
          path: "dashboard",
          component: DashboardComponent
        },
        {
          path: "users",
          component: UserManagementComponent
        },
        {
          path: "users/:id",
          component: UserDetailComponent
        },
      ]
    }
  ]
}
