import { Component, OnInit, NgModule } from '@angular/core';
import { User } from '../models/user';
import { UserService } from '../services/userservice';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
 
  newUser: User;

  // public username: string;
  // public password: string;
  // public fullname: string;
  // public userRole: string;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newUser = new User();
  }

  onSubmit() {
    console.log(this.newUser);

    // console.log(this.username);
    // console.log(this.password);
    // console.log(this.fullname);
    // console.log(this.userRole);
    this.userService.registerUser(this.newUser).subscribe((response) => {
      
      if (response === "success") {

      }

    });
    
  }
}
