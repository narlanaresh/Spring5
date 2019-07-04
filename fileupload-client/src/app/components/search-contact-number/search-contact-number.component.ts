import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import {ShowContactNumbersComponent} from '../show-contact-numbers/show-contact-numbers.component';

@Component({
  selector: 'app-search-contact-number',
  templateUrl: './search-contact-number.component.html',
  styleUrls: ['./search-contact-number.component.css']
})
export class SearchContactNumberComponent implements OnInit {
  @Output() searchContact: EventEmitter<string> = new EventEmitter();
  searchPhoneNumber: string;
  constructor(/*private showContactNumbersComponent: ShowContactNumbersComponent*/) { }

  ngOnInit() {
  }

  searchPhoneNumberFn(): void {
    console.log('Searching' + this.searchPhoneNumber);
    this.searchContact.emit(this.searchPhoneNumber);
    //this.showContactNumbersComponent.searchContact(this.searchPhoneNumber);
  }

}
