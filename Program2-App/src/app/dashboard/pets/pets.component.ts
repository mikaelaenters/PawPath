import { Component, OnInit, NgModule } from '@angular/core';
import { DogService } from 'src/app/services/dogservice';
import { Dog } from 'src/app/models/dog';
import { UserService } from 'src/app/services/userservice';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-pets',
  templateUrl: './pets.component.html',
  styleUrls: ['./pets.component.css']
})
export class PetsComponent implements OnInit {
  showAdd = false;
  dogs: Dog[] = [];
  newDog: Dog;

  toggleShowAdd() {
    this.showAdd = !this.showAdd;
  }
  constructor(private dogService: DogService, private userService: UserService) { }

  ngOnInit() {
    this.newDog = new Dog();
    this.dogService.getUserDogs(this.userService.getCurrentUser().userId).subscribe((data) => {
      this.dogs = data;
    });
  }

  addDog() {
    this.newDog.dogId = -1;
    this.newDog.owner = this.userService.getLoggedInUser();
    console.log(this.newDog);
    this.dogService.addADog(this.newDog).subscribe((data) => {
    });
  }
}
