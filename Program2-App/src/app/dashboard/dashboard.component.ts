import { Component } from '@angular/core';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  showEdit = false;
  dogs = [
  {
    name: 'Rowdy', 
    breed: 'German Shepard', 
    size: '75lbs', 
    gender: 'M'
  },
  {
    name: 'Penny', 
    breed: 'Poodle', 
    size: '55lbs', 
    gender: 'F'
  }
];


constructor() { }




toggleShowEdit() {
  this.showEdit = !this.showEdit;
}

}
