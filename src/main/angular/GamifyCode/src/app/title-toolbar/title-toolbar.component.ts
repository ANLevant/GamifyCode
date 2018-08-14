import { Component, OnInit } from '@angular/core';
import {AppComponent} from "../app.component";
import {SideNavService} from "../services/side-nav.service";

@Component({
  selector: 'app-title-toolbar',
  templateUrl: './title-toolbar.component.html',
  styleUrls: ['./title-toolbar.component.scss']
})
export class TitleToolbarComponent implements OnInit {

  title = 'Gamify Code';

  constructor(private sidenavService : SideNavService) { }

  ngOnInit() {
  }

  toggle(){
    this.sidenavService.toggle();
  }

}
