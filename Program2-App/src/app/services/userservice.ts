import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { User } from 'src/app/models/user';


@Injectable({
    providedIn: 'root'
})
export class UserService {

    private readonly url: string = 'http://localhost:8080/PawPath/user';

    constructor(private http: HttpClient) {}

    public loginUser (username: string) {

        return this.http.get<User>(this.url + '/' + username);
    }
}