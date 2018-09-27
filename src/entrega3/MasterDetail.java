/**
 */
package entrega3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entrega3.MasterDetail#getEsclavo <em>Esclavo</em>}</li>
 *   <li>{@link entrega3.MasterDetail#isIsStrong <em>Is Strong</em>}</li>
 *   <li>{@link entrega3.MasterDetail#getMaestro <em>Maestro</em>}</li>
 * </ul>
 *
 * @see entrega3.Entrega3Package#getMasterDetail()
 * @model
 * @generated
 */
public interface MasterDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Esclavo</b></em>' reference list.
	 * The list contents are of type {@link entrega3.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Esclavo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esclavo</em>' reference list.
	 * @see entrega3.Entrega3Package#getMasterDetail_Esclavo()
	 * @model required="true"
	 * @generated
	 */
	EList<Entidad> getEsclavo();

	/**
	 * Returns the value of the '<em><b>Is Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strong</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strong</em>' attribute.
	 * @see #setIsStrong(boolean)
	 * @see entrega3.Entrega3Package#getMasterDetail_IsStrong()
	 * @model
	 * @generated
	 */
	boolean isIsStrong();

	/**
	 * Sets the value of the '{@link entrega3.MasterDetail#isIsStrong <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strong</em>' attribute.
	 * @see #isIsStrong()
	 * @generated
	 */
	void setIsStrong(boolean value);

	/**
	 * Returns the value of the '<em><b>Maestro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maestro</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maestro</em>' reference.
	 * @see #setMaestro(Entidad)
	 * @see entrega3.Entrega3Package#getMasterDetail_Maestro()
	 * @model required="true"
	 * @generated
	 */
	Entidad getMaestro();

	/**
	 * Sets the value of the '{@link entrega3.MasterDetail#getMaestro <em>Maestro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maestro</em>' reference.
	 * @see #getMaestro()
	 * @generated
	 */
	void setMaestro(Entidad value);

} // MasterDetail
