import { Injectable } from '@angular/core';
  
import { EstudianteModel } from '../model/estudiantes/estudiantes';

@Injectable()
export class EstudianteService {

  estudiantes : EstudianteModel[];
  constructor() {
    this.estudiantes = []; 
  }

  add(estudiantes:EstudianteModel){
    this.estudiantes.push(estudiantes);
  }

  remove(estudiantes:EstudianteModel){
    for(var i = 0; i < this.estudiantes.length; i++) {
        if(this.estudiantes[i] == estudiantes){
            this.estudiantes.splice(i, 1);
        }
    }
  }
}