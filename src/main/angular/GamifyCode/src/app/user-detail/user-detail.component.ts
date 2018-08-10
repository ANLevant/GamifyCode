import { Component, OnInit, Input } from '@angular/core';
import { UserDTO } from "../dto/UserDTO";

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css']
})
export class UserDetailComponent implements OnInit {

  @Input() user : UserDTO;

  constructor() { }

  ngOnInit() {
  }

}
