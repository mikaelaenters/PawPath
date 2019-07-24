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
  user: User;
  username = "";
  password = "";
 

  constructor(private userservice: UserService, private router: Router) { 
  }
  loginUser() {
    this.userservice.loginUser(this.username, this.password).subscribe( () => {
      this.user = this.userservice.getCurrentUser();
      console.log(this.user);
      if (this.user !== null) {
        if (this.user.userRole === 'customer') {
          this.router.navigate(['/dashboard']);
        }
      } else {
        this.router.navigate(['/login']);
      }
    });
  }

  ngOnInit() {

  }

}
