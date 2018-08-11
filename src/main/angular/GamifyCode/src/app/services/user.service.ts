import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { UserDTO } from "../dto/UserDTO";
import { Observable, of } from "rxjs/index";
import { MessageService } from "./message.service";
import {CONSTANTS} from "../util/Constants";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpclient: HttpClient, private messageService : MessageService) {
  }

  getUserListByRoleType(roleId: number) : Observable<UserDTO[]>{
    this.log("UserService: Fetching Users By Role");
    return this.httpclient.get<UserDTO[]>(CONSTANTS.URL_RESOURCES.GET_USER_LIST_BY_ROLE_TYPE.URL);
  }

  getUserById(userId: number) : Observable<UserDTO>{
    this.log("UserService: Fetching User By Id");
    return this.httpclient.get<UserDTO>(CONSTANTS.URL_RESOURCES.GET_USER_BY_ID.URL);
  }

  private log(logMessage: string):void{
    this.messageService.add(logMessage);
  }
}
