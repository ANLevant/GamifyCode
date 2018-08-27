import {Component, ViewChild} from '@angular/core';
import {MatSidenav} from "@angular/material";
import {SideNavService} from "./services/side-nav.service";
import {MenuService} from "./services/menu.service";
import {MenuDTO} from "./dto/MenuDTO";
import {HttpClient} from "@angular/common/http";
import {MessageService} from "./services/message.service";
import {UserDTO} from "./dto/UserDTO";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  constructor(private messageService : MessageService) {
  }

  ngOnInit(): void {
  }

  private log(logMessage: string):void{
    this.messageService.add(logMessage);
  }
}
