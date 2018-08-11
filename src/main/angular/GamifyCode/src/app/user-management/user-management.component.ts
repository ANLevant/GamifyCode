import { Component, OnInit } from '@angular/core';
import { UserDTO } from "../dto/UserDTO";
import { UserService } from "../services/user.service";

@Component({
  selector: 'app-user-management',
  templateUrl: './user-management.component.html',
  styleUrls: ['./user-management.component.css']
})
export class UserManagementComponent implements OnInit {

  users: UserDTO[];
  selectedUser: UserDTO;

  constructor(private userService : UserService) {
  }

  ngOnInit() {
    this.GET_USER_LIST_BY_ROLE_TYPE(0);
  }

  getUserListByRoleType(roleType : number) : void {
    this.userService.GET_USER_LIST_BY_ROLE_TYPE(roleType).subscribe(users=>this.users = users);
  }

}
