export const URL_CONSTANTS=
{
  USERS:{
    GET_USER_LIST_BY_ROLE_TYPE: {URL: "http://localhost:8081/users/role/:roleId", METHOD: "GET", PARAMETERS_NAMES:[":roleId"]},
    GET_USER_BY_ID: {URL: "http://localhost:8081/users/:userId", METHOD: "GET", PARAMETERS_NAMES:[":userId"]},
    LOG_USER: {URL: "http://localhost:8081/users/:username/login", METHOD: "PUT", PARAMETERS_NAMES:[":username"]},
    CREATE_USER: {URL: "http://localhost:8081/users", METHOD: "POST"},
    GET_ALL_USERS_LIST: {URL: "http://localhost:8081/users", METHOD: "GET"}
  },
  ROLES:{
    GET_ALL_ROLES:{URL:"http://localhost:8081/roles", METHOD:"GET"}
  }
}
