import { Injectable } from '@angular/core';
  
import { CursosModel } from '../model/cursos/cursos';

@Injectable()
export class CursosService {

  cursos : CursosModel[];
  constructor() {
    this.cursos = []; 
  }

  add(cursos:CursosModel){
    this.cursos.push(cursos);
  }

  remove(cursos:CursosModel){
    for(var i = 0; i < this.cursos.length; i++) {
        if(this.cursos[i] == cursos){
            this.cursos.splice(i, 1);
        }
    }
  }
}