import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { UserDTO } from "../dto/UserDTO";
import { Observable, of } from "rxjs/index";
import { MessageService } from "./message.service";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpclient: HttpClient, private messageService : MessageService) {
  }

  getUserListByRoleType(roleType: number) : Observable<UserDTO[]>{
    this.log("UserService: Fetching Users By Role");
    return of( [{
      id: 1,
      roleId: 1,
      username: 'admin',
      name: 'demAdmin',
      email: 'admin@email.com',
      password: 'secret'
    },
      {
        id: 2,
        roleId: 1,
        username: 'ANLevant',
        name: 'LaSombra',
        email: 'daboss@hidden.com',
        password: 'SupaSecret'
      }]);
  }

  getUserById(userId: number) : Observable<UserDTO>{
    this.log("UserService: Fetching User By Id");
    return of( {
      id: 1,
      roleId: 1,
      username: 'admin',
      name: 'demAdmin',
      email: 'admin@email.com',
      password: 'secret'
    });
  }

  private log(logMessage: string):void{
    this.messageService.add(logMessage);
  }
}
