import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import {Contact} from '../../models/contact';


@Component({
  selector: 'app-upload-file-component',
  templateUrl: './upload-file-component.component.html',
  styleUrls: ['./upload-file-component.component.css']
})


export class UploadFileComponentComponent implements OnInit {
  uploadedFile: string;
  URL: string;
  contacts: Contact[];
  searchcontacts: Contact[];
  searchPhoneNumberTxt: string;
  constructor(private formBuilder: FormBuilder, private httpClient: HttpClient) { }

  SERVER_URL = 'http://localhost:8080/fileuploadrest/rest/upload';
  uploadForm: FormGroup;
  title = 'fileupload-client';

  ngOnInit() {
    this.URL = 'http://localhost:8080/fileuploadrest/rest/upload';
    this.uploadForm = this.formBuilder.group({
      profile: ['']
    });
  }

  data1: Contact[];
  onFileSelect(event) {
    if (event.target.files.length > 0) {
      this.uploadedFile = event.target.files[0];
      /*this.uploadForm.get('file').setValue(file);*/
    }
  }

  onSubmit() {
    const formData = new FormData();
    formData.append('file', this.uploadedFile );
    this.httpClient.post<any>(this.SERVER_URL, formData).subscribe(
      (res) => {
          this.contacts=res;
          this.searchcontacts = res;
        console.log(this.contacts);
        }
      ,
      (err) => console.log(err)
    );
  }

  searchData(){
    //searchNumber = this.searchPhoneNumberTxt;
    console.log(this.searchPhoneNumberTxt);
    this.searchcontacts = this.contacts.filter(c => c.phoneNumber == this.searchPhoneNumberTxt);

    console.log(this.contacts.filter(c => c.phoneNumber == this.searchPhoneNumberTxt));
  }

}
