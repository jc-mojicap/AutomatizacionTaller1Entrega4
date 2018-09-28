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
  [org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7df65e61 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3cc6932d (name: Entidad) (instanceClassName: null) (abstract: false, interface: false)), org.eclipse.emf.ecore.impl.DynamicEObjectImpl@758a6aa1 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3cc6932d (name: Entidad) (instanceClassName: null) (abstract: false, interface: false)), org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7df65e61 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3cc6932d (name: Entidad) (instanceClassName: null) (abstract: false, interface: false))]
  
  
  

export class ProfesorModel {
 
    public fields: AtributoItemModel[]

    constructor(){
        this.fields = [];
  		this.fields.push(new AtributoItemStringModel("Nombre",false,true,true,true,"0"))
  		this.fields.push(new AtributoItemNumberModel("Codigo",false,true,true,false,"0"))
  		this.fields.push(new AtributoItemStringModel("Facultad",true,true,false,false,"0"))
  		this.fields.push(new AtributoItemDateModel("Inicio",true,false,false,false,"3"))
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