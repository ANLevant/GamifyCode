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

  @ViewChild('sidenav') public sidenav: MatSidenav;
  menu : MenuDTO[];
  loggedUser : UserDTO[];

  constructor(private sidenavService: SideNavService, private menuService : MenuService, private messageService : MessageService) {
  }

  ngOnInit(): void {
    this.sidenavService.setSidenav(this.sidenav);
    this.menuService.refresh(1).subscribe(menu=>{
      this.menu = menu;
    });

  }

  private log(logMessage: string):void{
    this.messageService.add(logMessage);
  }
}
