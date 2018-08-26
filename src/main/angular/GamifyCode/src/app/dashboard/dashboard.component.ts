import {Component, OnInit, ViewChild} from '@angular/core';
import { RoleDTO } from "../dto/RoleDTO";
import { RoleService } from "../services/role.service";
import {MatGridList} from '@angular/material';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})

export class DashboardComponent implements OnInit {

  roles: RoleDTO[];


  constructor(private roleService: RoleService) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers(): void{
    this.roleService.getAllRoles().subscribe(roles => this.roles = roles)
  }

}
