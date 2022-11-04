import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../student.model';

@Component({
  selector: 'app-viewstudents',
  templateUrl: './viewstudents.component.html',
  styleUrls: ['./viewstudents.component.css']
})
export class ViewstudentsComponent implements OnInit {

  student:Observable<Student>;
  students:Student[]=[];

  constructor() { }

  ngOnInit(): void {
  }

  home(){

  }
}
