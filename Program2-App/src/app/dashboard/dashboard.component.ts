import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/userservice';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  showEdit = false;
  currentUser: User;
  fullname = "";

constructor(private userService: UserService) { }


ngOnInit() {

  this.currentUser = this.userService.getCurrentUser();
  this.fullname = this.currentUser.fullname;
}


toggleShowEdit() {
  this.showEdit = !this.showEdit;
}

}
