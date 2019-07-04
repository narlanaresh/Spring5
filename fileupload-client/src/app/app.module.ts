import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FileSelectDirective } from 'ng2-file-upload';
import { AppComponent } from './app.component';
import { HttpClientModule, /* other http imports */ } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UploadFileComponentComponent } from './components/upload-file-component/upload-file-component.component';
import { SearchContactNumberComponent } from './components/search-contact-number/search-contact-number.component';
import { ShowContactNumbersComponent } from './components/show-contact-numbers/show-contact-numbers.component';
@NgModule({
  declarations: [
    AppComponent,
    FileSelectDirective,
    UploadFileComponentComponent,
    SearchContactNumberComponent,
    ShowContactNumbersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
