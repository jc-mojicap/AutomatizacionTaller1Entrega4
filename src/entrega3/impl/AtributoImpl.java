/**
 */
package entrega3.impl;

import entrega3.Atributo;
import entrega3.Entrega3Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entrega3.impl.AtributoImpl#isIsEditable <em>Is Editable</em>}</li>
 *   <li>{@link entrega3.impl.AtributoImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link entrega3.impl.AtributoImpl#isIsVisibleInList <em>Is Visible In List</em>}</li>
 *   <li>{@link entrega3.impl.AtributoImpl#isIsTitle <em>Is Title</em>}</li>
 *   <li>{@link entrega3.impl.AtributoImpl#getName <em>Name</em>}</li>
 *   <li>{@link entrega3.impl.AtributoImpl#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
	/**
	 * The default value of the '{@link #isIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean isEditable = IS_EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVisibleInList() <em>Is Visible In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisibleInList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VISIBLE_IN_LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVisibleInList() <em>Is Visible In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisibleInList()
	 * @generated
	 * @ordered
	 */
	protected boolean isVisibleInList = IS_VISIBLE_IN_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTitle() <em>Is Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTitle() <em>Is Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean isTitle = IS_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected Object tipoDato;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Entrega3Package.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEditable() {
		return isEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEditable(boolean newIsEditable) {
		boolean oldIsEditable = isEditable;
		isEditable = newIsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.ATRIBUTO__IS_EDITABLE, oldIsEditable, isEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.ATRIBUTO__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVisibleInList() {
		return isVisibleInList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVisibleInList(boolean newIsVisibleInList) {
		boolean oldIsVisibleInList = isVisibleInList;
		isVisibleInList = newIsVisibleInList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.ATRIBUTO__IS_VISIBLE_IN_LIST, oldIsVisibleInList, isVisibleInList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTitle() {
		return isTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTitle(boolean newIsTitle) {
		boolean oldIsTitle = isTitle;
		isTitle = newIsTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.ATRIBUTO__IS_TITLE, oldIsTitle, isTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.ATRIBUTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDato(Object newTipoDato) {
		Object oldTipoDato = tipoDato;
		tipoDato = newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.ATRIBUTO__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Entrega3Package.ATRIBUTO__IS_EDITABLE:
				return isIsEditable();
			case Entrega3Package.ATRIBUTO__IS_MANDATORY:
				return isIsMandatory();
			case Entrega3Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
				return isIsVisibleInList();
			case Entrega3Package.ATRIBUTO__IS_TITLE:
				return isIsTitle();
			case Entrega3Package.ATRIBUTO__NAME:
				return getName();
			case Entrega3Package.ATRIBUTO__TIPO_DATO:
				return getTipoDato();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Entrega3Package.ATRIBUTO__IS_EDITABLE:
				setIsEditable((Boolean)newValue);
				return;
			case Entrega3Package.ATRIBUTO__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case Entrega3Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
				setIsVisibleInList((Boolean)newValue);
				return;
			case Entrega3Package.ATRIBUTO__IS_TITLE:
				setIsTitle((Boolean)newValue);
				return;
			case Entrega3Package.ATRIBUTO__NAME:
				setName((String)newValue);
				return;
			case Entrega3Package.ATRIBUTO__TIPO_DATO:
				setTipoDato(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Entrega3Package.ATRIBUTO__IS_EDITABLE:
				setIsEditable(IS_EDITABLE_EDEFAULT);
				return;
			case Entrega3Package.ATRIBUTO__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case Entrega3Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
				setIsVisibleInList(IS_VISIBLE_IN_LIST_EDEFAULT);
				return;
			case Entrega3Package.ATRIBUTO__IS_TITLE:
				setIsTitle(IS_TITLE_EDEFAULT);
				return;
			case Entrega3Package.ATRIBUTO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Entrega3Package.ATRIBUTO__TIPO_DATO:
				setTipoDato((Object)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Entrega3Package.ATRIBUTO__IS_EDITABLE:
				return isEditable != IS_EDITABLE_EDEFAULT;
			case Entrega3Package.ATRIBUTO__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case Entrega3Package.ATRIBUTO__IS_VISIBLE_IN_LIST:
				return isVisibleInList != IS_VISIBLE_IN_LIST_EDEFAULT;
			case Entrega3Package.ATRIBUTO__IS_TITLE:
				return isTitle != IS_TITLE_EDEFAULT;
			case Entrega3Package.ATRIBUTO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Entrega3Package.ATRIBUTO__TIPO_DATO:
				return tipoDato != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isEditable: ");
		result.append(isEditable);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(", isVisibleInList: ");
		result.append(isVisibleInList);
		result.append(", isTitle: ");
		result.append(isTitle);
		result.append(", name: ");
		result.append(name);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
