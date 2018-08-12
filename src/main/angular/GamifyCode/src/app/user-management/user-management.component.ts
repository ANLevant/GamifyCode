import { Component, OnInit } from '@angular/core';
import { UserDTO } from "../dto/UserDTO";
import { UserService } from "../services/user.service";
import { MessageService } from "../services/message.service";
import {Location} from "@angular/common";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-user-management',
  templateUrl: './user-management.component.html',
  styleUrls: ['./user-management.component.scss']
})
export class UserManagementComponent implements OnInit {

  users: UserDTO[];
  roleType: number;

  constructor(
    private userService : UserService,
    private messageService : MessageService) {
  }

  ngOnInit() {
    const parameters = new URLSearchParams(window.location.search);

    if(parameters.get("roleId")){
      this.roleType = +parameters.get("roleId");
      this.getUserListByRoleType(this.roleType);
    }
    else{
      this.roleType = 0;
      this.getAllUsersList();
    }
  }

  getUserListByRoleType(roleType : number) : void {
    this.userService.getUserListByRoleType(roleType).subscribe(users=>{
      this.users = users;
    });
  }

  getAllUsersList() : void {
    this.userService.getAllUsersList().subscribe(users=>{
      this.users = users;
    });
  }

}
