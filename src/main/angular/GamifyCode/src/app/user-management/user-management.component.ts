import { UserDTO } from "../dto/UserDTO";
import { UserService } from "../services/user.service";
import { MessageService } from "../services/message.service";
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, MatSort } from '@angular/material';

@Component({
  selector: 'app-user-management',
  templateUrl: './user-management.component.html',
  styleUrls: ['./user-management.component.scss']
})
export class UserManagementComponent implements OnInit {

  users: UserDTO[];
  roleType: number;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = ['id', 'name'];

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
