import { User } from '../models/user';
import { UserService } from './userservice';
import { HttpClient } from '@angular/common/http';

import { Injectable } from '@angular/core';
import { Profile } from '../models/profile';

@Injectable({
    providedIn: 'root'
})
export class ProfileService {

    private readonly url: string = 'http://localhost:8080/PawPath/pawpath/profile';

    currentUser: User;

    constructor(private http: HttpClient, private userService: UserService) {}

    public getUserProfile(id: number) {

        return this.http.get<Profile>(this.url + '/' + id);
    }

    public getAllContractors() {
        return this.http.get<User[]>(this.url);
    }

}
