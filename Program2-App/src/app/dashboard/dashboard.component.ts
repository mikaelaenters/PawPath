import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/userservice';
import { Router } from '@angular/router';
import { ProfileService } from '../services/profileservice';
import { Profile } from '../models/profile';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  showEdit = false;
  currentUser: User;
  userProfile: Profile;
  fullname = "";

constructor(private userService: UserService, private profileService: ProfileService, private router: Router) { 
  
  if(!this.userService.getCurrentUser()) { this.router.navigate(['/login']); }
  
  this.currentUser = this.userService.getCurrentUser();
  this.fullname = this.currentUser.fullname;

  this.profileService.getUserProfile(this.userService.getCurrentUser().userId).subscribe((data) => {
    this.userProfile = data;
  });
}


ngOnInit() {

  // this.currentUser = this.userService.getCurrentUser();
  // this.fullname = this.currentUser.fullname;
}


toggleShowEdit() {
  this.showEdit = !this.showEdit;
}

}
