import {Component, ViewChild} from '@angular/core';
import {MatSidenav} from "@angular/material";
import {SideNavService} from "./services/side-nav.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  @ViewChild('sidenav') public sidenav: MatSidenav;

  constructor(private sidenavService: SideNavService) {
  }

  ngOnInit(): void {
    this.sidenavService.setSidenav(this.sidenav);
  }
}
