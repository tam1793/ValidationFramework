import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

  validate(value) {
    if (!value.age) {
      value.age = null;
    }
    return this.httpClient.get(`localhost:1234/validate?object=${JSON.stringify(value)}`)
  }


}
