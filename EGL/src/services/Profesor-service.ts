import { Injectable } from '@angular/core';
  
import { ProfesorModel } from '../model/profesores/profesores';

@Injectable()
export class ProfesorService {

  profesores : ProfesorModel[];
  constructor() {
    this.profesores = []; 
  }

  add(profesores:ProfesorModel){
    this.profesores.push(profesores);
  }

  remove(profesores:ProfesorModel){
    for(var i = 0; i < this.profesores.length; i++) {
        if(this.profesores[i] == profesores){
            this.profesores.splice(i, 1);
        }
    }
  }
}