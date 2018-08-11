import { Component, OnInit, Input } from '@angular/core';
import { UserDTO } from "../dto/UserDTO";
import { ActivatedRoute } from "@angular/router";
import { Location } from "@angular/common";
import {  UserService } from "../services/user.service";

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css']
})
export class UserDetailComponent implements OnInit {

  @Input() user : UserDTO;

  constructor(
    private  route: ActivatedRoute,
    private userService: UserService,
    private location: Location
  ) { }

  ngOnInit() {
    this.getHero();
  }

  getHero(): void{
    const id = +this.route.snapshot.paramMap.get('id');
    this.userService.getUserById(id).subscribe(user => this.user = user);
  }

  goBack(): void{
    this.location.back();
  }

}
