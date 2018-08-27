import { Component, OnInit } from '@angular/core';
import {AppComponent} from "../app.component";
import {SideNavService} from "../services/side-nav.service";
import {MenuDTO} from "../dto/MenuDTO";
import {UserDTO} from "../dto/UserDTO";
import {MenuService} from "../services/menu.service";
import {MessageService} from "../services/message.service";

@Component({
  selector: 'app-title-toolbar',
  templateUrl: './title-toolbar.component.html',
  styleUrls: ['./title-toolbar.component.scss']
})
export class TitleToolbarComponent implements OnInit {

  menu : MenuDTO[];
  loggedUser : UserDTO[];
  title = 'Gamify Code';

  constructor(private menuService : MenuService, private messageService : MessageService) { }

  ngOnInit() {
    this.menuService.refresh(1).subscribe(menu=>{
      this.menu = menu;
    });
  }

  private log(logMessage: string):void{
    this.messageService.add(logMessage);
  }

}
