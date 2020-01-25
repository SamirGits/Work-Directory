export class Media {
  static push(Medias: Media) {
    throw new Error("Method not implemented.");
  }
    title:string;
    description:string;
    tags:string;
    filename:string;
  
    constructor(title:string,description:string,tags:string,filename:string) {
      this.title=title;
      this.description=description;
      this.tags=tags;
      this.filename;
     }
    }