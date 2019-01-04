import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  headers = new HttpHeaders({ 'Access-Control-Allow-Origin': '*' });
  constructor(private httpClient: HttpClient) {}

  validate(value) {

    if (!value.name) {
      value.name = null;
    }

    if (!value.age) {
      value.age = null;
    }
    return this.httpClient.get(`http://localhost:1234/validate?object=${JSON.stringify(value)}`, {
      headers: this.headers
    });
  }
}
