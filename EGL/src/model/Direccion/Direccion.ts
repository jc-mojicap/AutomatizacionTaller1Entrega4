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
  [org.eclipse.emf.ecore.impl.DynamicEObjectImpl@bc49bc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@41eeb6 (name: Entidad) (instanceClassName: null) (abstract: false, interface: false)), org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6bb1f7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@41eeb6 (name: Entidad) (instanceClassName: null) (abstract: false, interface: false)), org.eclipse.emf.ecore.impl.DynamicEObjectImpl@bc49bc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@41eeb6 (name: Entidad) (instanceClassName: null) (abstract: false, interface: false))]
  

export class DireccionModel {
 
    public fields: AtributoItemModel[]

    constructor(){
        this.fields = [];
  		this.fields.push(new AtributoItemStringModel("Direccion",false,true,true,true,"0"))
  		this.fields.push(new AtributoItemStringModel("Ciudad",false,true,true,false,"0"))
  		this.fields.push(new AtributoItemStringModel("Pais",true,true,false,false,"0"))
  		this.fields.push(new AtributoItemNumberModel("Zipcode",true,false,false,false,"0"))
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