import { Component, OnInit } from '@angular/core';
import { Profile } from 'src/app/models/profile';
import { ProfileService } from 'src/app/services/profileservice';
import { User } from '../models/user';



@Component({
  selector: 'app-search-for-walkers',
  templateUrl: './search-for-walkers.component.html',
  styleUrls: ['./search-for-walkers.component.css']
})
export class SearchForWalkersComponent implements OnInit {

contractors: User[];

  constructor(private profileService: ProfileService) { }

  ngOnInit() {
    this.profileService.getAllContractors().subscribe((data) => {
      this.contractors = data;
    });
  }

}
