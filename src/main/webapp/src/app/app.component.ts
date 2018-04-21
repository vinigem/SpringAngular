import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {

  message: string;

  constructor(private httpClient:HttpClient) {
    this.httpClient.get('api/welcome', { responseType: 'text' })
    .subscribe((data: string) => {
      this.message = data;
    });
  }
}
