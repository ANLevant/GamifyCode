import { Component, OnInit } from '@angular/core';
import { UserDTO} from "../dto/UserDTO";
import { UserService } from "../services/user.service";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  users: UserDTO[];

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers(): void{
    this.userService.getUserListByRoleType(1).subscribe(users => this.users = users)
  }

}
