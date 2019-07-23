import { Component, OnInit } from '@angular/core';
export interface WalkerProfile {
  name: string;
  bio: string;
}



@Component({
  selector: 'app-search-for-walkers',
  templateUrl: './search-for-walkers.component.html',
  styleUrls: ['./search-for-walkers.component.css']
})
export class SearchForWalkersComponent implements OnInit {

   WALKER_PROFILES: WalkerProfile[] = [
    {name: 'Mikaela Enters', bio: 'I love dogs so much'},
    {name: 'Marin Enters', bio: 'I do not love dogs as much'},
    {name: 'Austin Kelcher', bio: 'Video games are better than dogs'}
    ];

  constructor() { }

  ngOnInit() {
  }

}
