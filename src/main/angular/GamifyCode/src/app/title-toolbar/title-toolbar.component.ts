import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-title-toolbar',
  templateUrl: './title-toolbar.component.html',
  styleUrls: ['./title-toolbar.component.scss']
})
export class TitleToolbarComponent implements OnInit {

  title = 'Gamify Code';

  constructor() { }

  ngOnInit() {
  }

}
