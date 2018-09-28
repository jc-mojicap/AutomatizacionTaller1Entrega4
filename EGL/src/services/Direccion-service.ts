import { Injectable } from '@angular/core';
  
import { DireccionModel } from '../model/direcciones/direcciones';

@Injectable()
export class DireccionService {

  direcciones : DireccionModel[];
  constructor() {
    this.direcciones = []; 
  }

  add(direcciones:DireccionModel){
    this.direcciones.push(direcciones);
  }

  remove(direcciones:DireccionModel){
    for(var i = 0; i < this.direccioness.length; i++) {
        if(this.direcciones[i] == direcciones){
            this.direcciones.splice(i, 1);
        }
    }
  }
}