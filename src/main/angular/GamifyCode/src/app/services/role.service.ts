import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {MessageService} from "./message.service";
import {Observable} from "rxjs/index";
import {RoleDTO} from "../dto/RoleDTO";
import {URL_CONSTANTS} from "../util/URL_CONSTANTS";

@Injectable({
  providedIn: 'root'
})
export class RoleService {

  constructor(private httpClient: HttpClient, private messageService : MessageService) { }

  getAllRoles() : Observable<RoleDTO[]>{
   this.log("Fetching All Roles")
    return this.httpClient.get<RoleDTO[]>(URL_CONSTANTS.ROLES.GET_ALL_ROLES.URL);

  }

  private log(logMessage: string):void{
    this.messageService.add(logMessage);
  }
}
