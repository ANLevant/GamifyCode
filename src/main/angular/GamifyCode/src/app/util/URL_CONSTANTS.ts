export const URL_CONSTANTS=
{
  GET_USER_LIST_BY_ROLE_TYPE: {URL: "http://localhost:8080/users/role/:roleId", METHOD: "GET", PARAMETERS_NAMES:[":roleId"]},
  GET_USER_BY_ID: {URL: "http://localhost:8080/users/user/:userId", METHOD: "GET", PARAMETERS_NAMES:[":userId"]},
  LOG_USER: {URL: "http://localhost:8080/users/:username/login", METHOD: "PUT", PARAMETERS_NAMES:[":username"]},
  CREATE_USER: {URL: "http://localhost:8080/users", METHOD: "POST"}
}
