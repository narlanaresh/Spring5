import { Component, OnInit } from '@angular/core';
import { Contact } from '../../models/contact';
import {Observable} from 'rxjs';
import {selector} from 'rxjs-compat/operator/publish';
@Component({
  selector: 'app-show-contact-numbers',
  templateUrl: './show-contact-numbers.component.html',
  styleUrls: ['./show-contact-numbers.component.css']
})
export class ShowContactNumbersComponent implements OnInit {
  contacts: Contact[];
  constructor() { }

  ngOnInit() {
    this.contacts = [{id: 1, contactno: '12312312'}, {id: 2, contactno: '1111'}];
    /*this.contacts.push({id: 2, contactno: '111111'});*/
  }




}
