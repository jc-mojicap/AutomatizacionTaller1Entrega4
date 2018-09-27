/**
 */
package entrega3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entrega3.Application#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link entrega3.Application#getName <em>Name</em>}</li>
 *   <li>{@link entrega3.Application#getNavBarColorHex <em>Nav Bar Color Hex</em>}</li>
 *   <li>{@link entrega3.Application#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link entrega3.Application#getFloatingButtonColor <em>Floating Button Color</em>}</li>
 *   <li>{@link entrega3.Application#getDetalles <em>Detalles</em>}</li>
 * </ul>
 *
 * @see entrega3.Entrega3Package#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
	 * The list contents are of type {@link entrega3.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' containment reference list.
	 * @see entrega3.Entrega3Package#getApplication_Entidades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidades();

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
	 * @see entrega3.Entrega3Package#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entrega3.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nav Bar Color Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nav Bar Color Hex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nav Bar Color Hex</em>' attribute.
	 * @see #setNavBarColorHex(String)
	 * @see entrega3.Entrega3Package#getApplication_NavBarColorHex()
	 * @model
	 * @generated
	 */
	String getNavBarColorHex();

	/**
	 * Sets the value of the '{@link entrega3.Application#getNavBarColorHex <em>Nav Bar Color Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nav Bar Color Hex</em>' attribute.
	 * @see #getNavBarColorHex()
	 * @generated
	 */
	void setNavBarColorHex(String value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(String)
	 * @see entrega3.Entrega3Package#getApplication_TextColor()
	 * @model
	 * @generated
	 */
	String getTextColor();

	/**
	 * Sets the value of the '{@link entrega3.Application#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(String value);

	/**
	 * Returns the value of the '<em><b>Floating Button Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Button Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Button Color</em>' attribute.
	 * @see #setFloatingButtonColor(String)
	 * @see entrega3.Entrega3Package#getApplication_FloatingButtonColor()
	 * @model
	 * @generated
	 */
	String getFloatingButtonColor();

	/**
	 * Sets the value of the '{@link entrega3.Application#getFloatingButtonColor <em>Floating Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Button Color</em>' attribute.
	 * @see #getFloatingButtonColor()
	 * @generated
	 */
	void setFloatingButtonColor(String value);

	/**
	 * Returns the value of the '<em><b>Detalles</b></em>' containment reference list.
	 * The list contents are of type {@link entrega3.MasterDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detalles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detalles</em>' containment reference list.
	 * @see entrega3.Entrega3Package#getApplication_Detalles()
	 * @model containment="true"
	 * @generated
	 */
	EList<MasterDetail> getDetalles();

} // Application
