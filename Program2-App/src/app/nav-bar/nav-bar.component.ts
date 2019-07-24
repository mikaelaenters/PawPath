import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/userservice';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { User } from '../models/user';
import { UserController } from "src/app/models/usercontroller";

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

currentUser: UserController;
currentUserSubscription: Subscription;

  constructor(private userService: UserService, private router: Router) {
    this.currentUserSubscription = this.userService.currentUser.subscribe(user => {
      this.currentUser = user;
    });
   }

  ngOnInit() {
    // this.currentUser = this.userService.getCurrentUser();

  }



}
