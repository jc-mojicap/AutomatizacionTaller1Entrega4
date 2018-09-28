import '../common/atributo-item'
import { AtributoItemModel,AtributoItemInterface } from '../common/atributo-item';
import { AtributoItemStringModel } from '../common/atributo-item-string';
import { AtributoItemNumberModel } from '../common/atributo-item-number';
import { AtributoItemBooleanModel } from '../common/atributo-item-boolean';
import { AtributoItemDateModel } from '../common/atributo-item-date';
import { DireccionModel, DireccionModelDelegate } from '../direccion/direccion';
import { CursoModel, CursoModelDelegate } from '../curso/curso';


export interface ProfesorModelDelegate {
    addProfesor: (profesor:ProfesorModel) => void;
    removeProfesor: (profesor:Profesor)=> void;
}

export class ProfesorModel  implements DireccionModelDelegate{
 
    public fields: AtributoItemModel[]
	//Direccion
	public direcciones:DireccionModel[]
	public direccionesOpen:Boolean = false;

    constructor(){
        this.fields = [];
  		this.fields.push(new AtributoItemStringModel("Nombre",false,true,true,true,"String"))
  		this.fields.push(new AtributoItemNumberModel("Codigo",false,true,true,false,"Number"))
  		this.fields.push(new AtributoItemStringModel("Facultad",true,true,false,false,"String"))
  		this.fields.push(new AtributoItemDateModel("Inicio",true,false,false,false,"Date"))
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


	public addDireccion(direccion:DireccionModel){
        this.direcciones.push(direccion) 
	}
 
    public removeDireccion(direccion:DireccionModel){
         for(var i = 0; i < this.Direcciones.length; i++) {
             if(this.direcciones[i] == direccion){
                 this.direcciones.splice(i, 1);
             }
         }
     }
