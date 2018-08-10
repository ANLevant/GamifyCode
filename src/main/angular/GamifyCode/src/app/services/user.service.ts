import { Injectable } from '@angular/core';
import { UserDTO } from "../dto/UserDTO";
import { Observable, of } from "rxjs/index";
import { MessageService } from "./message.service";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private messageService : MessageService) {
  }

  getUserListByRoleType(roleType: number) : Observable<UserDTO[]>{
    this.messageService.add("UserService: Fetching Users");
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
}
