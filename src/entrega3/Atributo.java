/**
 */
package entrega3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entrega3.Atributo#isIsEditable <em>Is Editable</em>}</li>
 *   <li>{@link entrega3.Atributo#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link entrega3.Atributo#isIsVisibleInList <em>Is Visible In List</em>}</li>
 *   <li>{@link entrega3.Atributo#isIsTitle <em>Is Title</em>}</li>
 *   <li>{@link entrega3.Atributo#getName <em>Name</em>}</li>
 *   <li>{@link entrega3.Atributo#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 *
 * @see entrega3.Entrega3Package#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Editable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Editable</em>' attribute.
	 * @see #setIsEditable(boolean)
	 * @see entrega3.Entrega3Package#getAtributo_IsEditable()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsEditable();

	/**
	 * Sets the value of the '{@link entrega3.Atributo#isIsEditable <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Editable</em>' attribute.
	 * @see #isIsEditable()
	 * @generated
	 */
	void setIsEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see entrega3.Entrega3Package#getAtributo_IsMandatory()
	 * @model
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link entrega3.Atributo#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Visible In List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Visible In List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible In List</em>' attribute.
	 * @see #setIsVisibleInList(boolean)
	 * @see entrega3.Entrega3Package#getAtributo_IsVisibleInList()
	 * @model
	 * @generated
	 */
	boolean isIsVisibleInList();

	/**
	 * Sets the value of the '{@link entrega3.Atributo#isIsVisibleInList <em>Is Visible In List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Visible In List</em>' attribute.
	 * @see #isIsVisibleInList()
	 * @generated
	 */
	void setIsVisibleInList(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Title</em>' attribute.
	 * @see #setIsTitle(boolean)
	 * @see entrega3.Entrega3Package#getAtributo_IsTitle()
	 * @model
	 * @generated
	 */
	boolean isIsTitle();

	/**
	 * Sets the value of the '{@link entrega3.Atributo#isIsTitle <em>Is Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Title</em>' attribute.
	 * @see #isIsTitle()
	 * @generated
	 */
	void setIsTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entrega3.Entrega3Package#getAtributo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entrega3.Atributo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see #setTipoDato(Object)
	 * @see entrega3.Entrega3Package#getAtributo_TipoDato()
	 * @model default="" dataType="entrega3.Datos"
	 * @generated
	 */
	Object getTipoDato();

	/**
	 * Sets the value of the '{@link entrega3.Atributo#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(Object value);

} // Atributo
