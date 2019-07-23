import { Component, OnInit, NgModule } from '@angular/core';

import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/userservice';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User = new User();

  username = "";

  constructor(private userservice: UserService) { }

  loginUser() { 
    this.userservice.loginUser(this.username).subscribe((user) => {
      this.user = user;
      console.log(user);
    });
  }

  ngOnInit() {

    console.log(this.user);
  }

}
