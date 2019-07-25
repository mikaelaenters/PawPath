import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { User } from 'src/app/models/user';
import { map } from 'rxjs/operators';
import { Observable, BehaviorSubject } from 'rxjs';
import { UserController } from 'src/app/models/usercontroller';

@Injectable({
providedIn: 'root'
})
export class UserService {
        private readonly url: string = 'http://localhost:8080/PawPath/user';
        private currentUserAsASubject: BehaviorSubject<UserController>;
        currentUser: Observable<UserController>;
    constructor(private http: HttpClient) {
        this.currentUserAsASubject = new BehaviorSubject<UserController>(null);
        this.currentUser = this.currentUserAsASubject.asObservable();
    }

    public loginUser (username: string, password: string) {
        return this.http.get<User>(this.url + '/' + username + '/' + password, {observe: 'response'}).pipe(
            map(response => {
            let responseObject = response.body as User;
            let newUser = new UserController(
                                    responseObject.userId,
                                    responseObject.username,
                                    responseObject.password,
                                    responseObject.userRole,
                                    responseObject.fullname);
                                    this.currentUserAsASubject.next(newUser);
                            })
            )
    }

    public registerUser (newUser: User) {
        return this.http.post(this.url, newUser);
    }
    
    public getCurrentUser(): UserController {
        return this.currentUserAsASubject.value;
    }
}
