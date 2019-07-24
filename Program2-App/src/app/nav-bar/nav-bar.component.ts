import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/userservice';
import { Router } from '@angular/router';
import { User } from '../models/user';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

currentUser: User = this.userService.getCurrentUser();

  constructor(private userService: UserService, private router: Router) { }

  ngOnInit() {
    // this.currentUser = this.userService.getCurrentUser();

  }



}
