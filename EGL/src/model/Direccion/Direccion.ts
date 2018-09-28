import '../common/atributo-item'
import { AtributoItemModel,AtributoItemInterface } from '../common/atributo-item';
import { AtributoItemStringModel } from '../common/atributo-item-string';
import { AtributoItemNumberModel } from '../common/atributo-item-number';
import { AtributoItemBooleanModel } from '../common/atributo-item-boolean';
import { AtributoItemDateModel } from '../common/atributo-item-date';
import { DireccionModel, DireccionModelDelegate } from '../direccion/direccion';
import { CursoModel, CursoModelDelegate } from '../curso/curso';


export interface DireccionModelDelegate {
    addDireccion: (direccion:DireccionModel) => void;
    removeDireccion: (direccion:Direccion)=> void;
}

export class DireccionModel {
 
    public fields: AtributoItemModel[]

    constructor(){
        this.fields = [];
  		this.fields.push(new AtributoItemStringModel("Direccion",false,true,true,true,"String"))
  		this.fields.push(new AtributoItemStringModel("Ciudad",false,true,true,false,"String"))
  		this.fields.push(new AtributoItemStringModel("Pais",true,true,false,false,"String"))
  		this.fields.push(new AtributoItemNumberModel("Zipcode",true,false,false,false,"Number"))
    }

    public getTitleField():AtributoItemModel{
        for(let f of this.fields){
            if(f.isTitle){
                return f;
            }
        }
        return null;
    }   
}

