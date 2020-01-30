import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-multiple-media',
  templateUrl: './multiple-media.component.html',
  styleUrls: ['./multiple-media.component.css']
})
export class MultipleMediaComponent implements OnInit {

  constructor(public route: Router) { }

  ngOnInit() {
  }

}
