import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import {MatMenuModule} from '@angular/material/menu';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatStepperModule} from '@angular/material/stepper';
import {MatInputModule} from '@angular/material/input';
import {MatTableModule} from '@angular/material/table';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatSidenavModule} from '@angular/material/sidenav';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerFormComponent } from './customer-form/customer-form.component';
import { HomeComponent } from './home/home.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { PetsComponent } from './dashboard/pets/pets.component';
import { WalksComponent } from './dashboard/walks/walks.component';
import { SearchForWalkersComponent } from './search-for-walkers/search-for-walkers.component';






@NgModule({
  declarations: [
    AppComponent,
    CustomerFormComponent,
    HomeComponent,
    NavBarComponent,
    LoginComponent,
    DashboardComponent,
    PetsComponent,
    WalksComponent,
    SearchForWalkersComponent
  ],
  imports: [
    MatSidenavModule,
    MatCheckboxModule,
    MatTableModule,
    FormsModule,
    MatInputModule,
    MatStepperModule,
    MatExpansionModule,
    MatMenuModule,
    MatButtonModule,
    MatCardModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
