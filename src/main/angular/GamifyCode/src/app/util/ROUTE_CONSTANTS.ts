import {UserManagementComponent} from "../user-management/user-management.component";
import {DashboardComponent} from "../dashboard/dashboard.component";
import {UserDetailComponent} from "../user-detail/user-detail.component";

export const ROUTE_CONSTANTS = {
  ROUTES : [
    {
      path: "",
      redirectTo: "/dashboard",
      pathMatch: "full"
    },
    {
      path: "users",
      component: UserManagementComponent
    },
    {
      path: "users/:id",
      component: UserDetailComponent
    },
    {
      path: "dashboard",
      component:  DashboardComponent
    }],
}
