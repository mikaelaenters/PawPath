import { Component, OnInit, NgModule } from '@angular/core';

import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/userservice';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User = new User();

  username = "";
  password = "";

  constructor(private userservice: UserService, private router: Router) { }

  loginUser() {
    this.userservice.loginUser(this.username, this.password).subscribe((user) => {
      this.user = user;
      if (this.user !== null){
        this.userservice.setCurrentUser(user);
        if (this.user.userRole === 'customer') {
          this.router.navigate(['/dashboard']);
        }
      } else {
        this.router.navigate(['/login']);
      }
    });
  }

  ngOnInit() {

    console.log(this.user);
  }

}
