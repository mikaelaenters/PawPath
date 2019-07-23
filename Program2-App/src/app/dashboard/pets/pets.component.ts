import { Component } from '@angular/core';

@Component({
  selector: 'app-pets',
  templateUrl: './pets.component.html',
  styleUrls: ['./pets.component.css']
})
export class PetsComponent {
  showAdd = false;
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
  
  toggleShowAdd() {
    this.showAdd = !this.showAdd;
  }
  constructor() { }

}
