import {UserManagementComponent} from "../user-management/user-management.component";
import {DashboardComponent} from "../dashboard/dashboard.component";
import {UserDetailComponent} from "../user-detail/user-detail.component";

export const CONSTANTS = {
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
  URL_RESOURCES:
    {
      GET_USER_LIST_BY_ROLE_TYPE: {URL: "localhost:8080/users/role/${roleId}", METHOD: "GET"},
      GET_USER_BY_ID: {URL: "localhost:8080/users/user/${userId}", METHOD: "GET"},
      LOG_USER: {URL: "localhost:8080/users/${username}/login", METHOD: "PUT"},
      CREATE_USER: {URL: "localhost:8080/users", METHOD: "POST"}
    }
}
