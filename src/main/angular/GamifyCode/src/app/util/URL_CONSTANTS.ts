export const URL_CONSTANTS=
{
  GET_USER_LIST_BY_ROLE_TYPE: {URL: "localhost:8080/users/role/${roleId}", METHOD: "GET"},
  GET_USER_BY_ID: {URL: "localhost:8080/users/user/${userId}", METHOD: "GET"},
  LOG_USER: {URL: "localhost:8080/users/${username}/login", METHOD: "PUT"},
  CREATE_USER: {URL: "localhost:8080/users", METHOD: "POST"}
}
