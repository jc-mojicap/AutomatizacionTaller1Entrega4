import '../common/atributo-item'
import { AtributoItemModel,AtributoItemInterface } from '../common/atributo-item';
import { AtributoItemStringModel } from '../common/atributo-item-string';
import { AtributoItemNumberModel } from '../common/atributo-item-number';
import { AtributoItemBooleanModel } from '../common/atributo-item-boolean';
import { AtributoItemDateModel } from '../common/atributo-item-date';
import { DireccionModel, DireccionModelDelegate } from '../direccion/direccion';
import { CursoModel, CursoModelDelegate } from '../curso/curso';


export interface CursosModelDelegate {
    addCursos: (cursos:CursosModel) => void;
    removeCursos: (cursos:Cursos)=> void;
}

export class CursosModel {
 
    public fields: AtributoItemModel[]

    constructor(){
        this.fields = [];
  		this.fields.push(new AtributoItemStringModel("Nombre",false,true,true,true,"String"))
  		this.fields.push(new AtributoItemNumberModel("Codigo",false,true,true,false,"Number"))
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

