import '../common/atributo-item'
import { AtributoItemModel,AtributoItemInterface } from '../common/atributo-item';
import { AtributoItemStringModel } from '../common/atributo-item-string';
import { AtributoItemNumberModel } from '../common/atributo-item-number';
import { AtributoItemBooleanModel } from '../common/atributo-item-boolean';
import { AtributoItemDateModel } from '../common/atributo-item-date';
import { DireccionModel, DireccionModelDelegate } from '../direccion/direccion';
import { CursoModel, CursoModelDelegate } from '../curso/curso';


export interface EstudianteModelDelegate {
    addEstudiante: (estudiante:EstudianteModel) => void;
    removeEstudiante: (estudiante:Estudiante)=> void;
}
  [org.eclipse.emf.ecore.impl.DynamicEObjectImpl@bc49bc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@41eeb6 (name: Entidad) (instanceClassName: null) (abstract: false, interface: false)), org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6bb1f7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@41eeb6 (name: Entidad) (instanceClassName: null) (abstract: false, interface: false)), org.eclipse.emf.ecore.impl.DynamicEObjectImpl@bc49bc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@41eeb6 (name: Entidad) (instanceClassName: null) (abstract: false, interface: false))]
  

export class EstudianteModel {
 
    public fields: AtributoItemModel[]

    constructor(){
        this.fields = [];
  		this.fields.push(new AtributoItemStringModel("Nombre",false,true,true,true,"0"))
  		this.fields.push(new AtributoItemNumberModel("Codigo",false,true,true,false,"0"))
  		this.fields.push(new AtributoItemNumberModel("Semestre",true,true,false,false,"0"))
  		this.fields.push(new AtributoItemBooleanModel("Activo",true,false,false,false,"2"))
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