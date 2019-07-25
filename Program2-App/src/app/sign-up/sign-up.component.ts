import { Component, OnInit, NgModule } from '@angular/core';
import { User } from '../models/user';
import { UserService } from '../services/userservice';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
 
  newUser: User;
  message: string;
  responseObject: string;
  // public username: string;
  // public password: string;
  // public fullname: string;
  // public userRole: string;

  constructor(private userService: UserService, private router: Router) { }

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
         //new code start
         this.responseObject = response.valueOf.arguments;
      console.log(this.responseObject);
     if (response === "success") {
      this.router.navigate(['/login']);
    }else{
      this.router.navigate(['/sign-up']);
      this.message = "The form was not submitted successfully";
    }
    //new code ends
  });
    
  }
}
