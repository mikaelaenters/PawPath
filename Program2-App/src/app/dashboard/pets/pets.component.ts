import { Component, OnInit } from '@angular/core';
import { DogService } from 'src/app/services/dogservice';
import { Dog } from 'src/app/models/dog';
import { UserService } from 'src/app/services/userservice';

@Component({
  selector: 'app-pets',
  templateUrl: './pets.component.html',
  styleUrls: ['./pets.component.css']
})
export class PetsComponent implements OnInit {
  showAdd = false;
  dogs: Dog[] = [];
  toggleShowAdd() {
    this.showAdd = !this.showAdd;
  }
  constructor(private dogService: DogService, private userService: UserService) { }

  ngOnInit() {
    this.dogService.getUserDogs(this.userService.getCurrentUser().userId).subscribe((data) => {
      this.dogs = data;
    });
  }
}
