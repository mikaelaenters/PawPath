import { User } from '../models/user';
import { UserService } from './userservice';
import { HttpClient } from '@angular/common/http';
import { Dog } from '../models/dog';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class DogService {

    private readonly url: string = 'http://localhost:8080/PawPath/pawpath/dog';

    currentUser: User;

    constructor(private http: HttpClient, private userService: UserService) {}

    public getUserDogs(id: number) {

        return this.http.get<Dog[]>(this.url + '/' + id);
    }

    public addADog(newDog: Dog) {
        console.log("inside post");
        return this.http.post(this.url, newDog);

    }
}
