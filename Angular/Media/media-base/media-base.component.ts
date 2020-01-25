import { Component, OnInit } from '@angular/core';
import { Media } from '../Mediamodel/mediamodel';

@Component({

  selector: 'app-media-base',
  templateUrl: './media-base.component.html',
  styleUrls: ['./media-base.component.css']
})
export class MediaBase   {
  Media : Array<Media>;
  MediaBase: any;

  constructor() {
    this.Media = [
      new Media("Title1","Description1","Tags1","Filename1"),
      new Media("Title 2","Description2","Tags2","Filename2"),
      new Media("Title3","Description3","Tags3","Filename3"),
      new Media("Title4","Description4","Tags4","Filename4"),
      
    ];
    
  }
  saveProduct(txttName:HTMLInputElement, txtDescription:HTMLInputElement, txttags:HTMLInputElement , txtfilename:HTMLInputElement):void{
    // create a new Product Object from coming values 
    let Medias = new Media(txttName.value, txtDescription.value, txttags.value , txtfilename.value);
    // add that object to array
    Media.push(Medias);

    // reset the form
    txttName.value = "";
    txtDescription.value ="";
    txttags.value ="";
    txtfilename.value="";
}
   }


