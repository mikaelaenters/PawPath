import { Component, ɵCompiler_compileModuleAndAllComponentsSync__POST_R3__ } from '@angular/core';
export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H'},
  {position: 2, name: 'Helium', weight: 4.0026, symbol: 'He'},
  {position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li'},
  {position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be'},
  {position: 5, name: 'Boron', weight: 10.811, symbol: 'B'},
  {position: 6, name: 'Carbon', weight: 12.0107, symbol: 'C'},
  {position: 7, name: 'Nitrogen', weight: 14.0067, symbol: 'N'},
  {position: 8, name: 'Oxygen', weight: 15.9994, symbol: 'O'},
  {position: 9, name: 'Fluorine', weight: 18.9984, symbol: 'F'},
  {position: 10, name: 'Neon', weight: 20.1797, symbol: 'Ne'},
];

@Component({
  selector: 'app-walks',
  templateUrl: './walks.component.html',
  styleUrls: ['./walks.component.css']
})
export class WalksComponent {
  displayedColumns: string[] = ['Date', 'Time', 'Location', 'Dog', 'Accept'];
  dataSource = ELEMENT_DATA;
  onRowClicked(row) {
    console.log('Row clicked: ', row);
}

getSelected(){
  let checkbox = document.getElementsByClassName("checkboxes")
  for(let i = 0; i < ELEMENT_DATA.length; i++){
    if(checkbox[i]){
      console.log(ELEMENT_DATA[i]);
    }
  }
}

}
