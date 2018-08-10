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
    this.getUserListByRoleType(0);
  }

  getUserListByRoleType(roleType : number) : void {
    this.userService.getUserListByRoleType(roleType).subscribe(users=>this.users = users);
  }

  onSelect(user: UserDTO){
    this.selectedUser = user;
  }

}
