import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable, of } from "rxjs/index";
import { MessageService } from "./message.service";
import { URL_CONSTANTS } from "../util/URL_CONSTANTS";
import {MenuDTO} from "../dto/MenuDTO";
import {UserDTO} from "../dto/UserDTO";

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  menuDTO : MenuDTO[];

  constructor(private httpclient: HttpClient, private messageService : MessageService) { }

  refresh(roleId: number) : Observable<MenuDTO[]>{
    this.httpclient.get<MenuDTO[]>(URL_CONSTANTS.MENU.GET_MENU.URL.replace(URL_CONSTANTS.MENU.GET_MENU.PARAMETERS_NAMES[0], ""+roleId)).subscribe(menu=>{
      this.menuDTO = menu;
    });
    return this.httpclient.get<MenuDTO[]>(URL_CONSTANTS.MENU.GET_MENU.URL.replace(URL_CONSTANTS.MENU.GET_MENU.PARAMETERS_NAMES[0], ""+roleId));
  }

  getMenu() : MenuDTO[]{
    return this.menuDTO;
  }

  private log(logMessage: string):void{
    this.messageService.add(logMessage);
  }
}
