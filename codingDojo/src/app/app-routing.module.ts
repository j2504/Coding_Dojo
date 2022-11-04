import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ViewstudentsComponent } from './viewstudents/viewstudents.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {path:'login',component:LoginComponent},
  {path:'welcome',component:WelcomeComponent},
  {path:'view-students',component:ViewstudentsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
