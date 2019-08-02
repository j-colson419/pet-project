import { Component } from '@angular/core';

@Component({
  selector: 'app-new-post',
  templateUrl: './new-post.component.html',
  styleUrls: ['./new-post.component.css']
})
export class NewPostComponent {

  private files :Object[];

  constructor() { }

  onFileChanged(event){
    console.log('file changed!');
    console.log(event.target.files);
    //this.files = event.target.files;
  }

  post(){
    console.log("this should send the new post info to the server.");
  }

}
