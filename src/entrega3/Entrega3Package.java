/**
 */
package entrega3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see entrega3.Entrega3Factory
 * @model kind="package"
 * @generated
 */
public interface Entrega3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entrega3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uniandes.edu.co/entrega3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entrega3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Entrega3Package eINSTANCE = entrega3.impl.Entrega3PackageImpl.init();

	/**
	 * The meta object id for the '{@link entrega3.impl.MasterDetailImpl <em>Master Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entrega3.impl.MasterDetailImpl
	 * @see entrega3.impl.Entrega3PackageImpl#getMasterDetail()
	 * @generated
	 */
	int MASTER_DETAIL = 0;

	/**
	 * The feature id for the '<em><b>Esclavo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL__ESCLAVO = 0;

	/**
	 * The feature id for the '<em><b>Is Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL__IS_STRONG = 1;

	/**
	 * The feature id for the '<em><b>Maestro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL__MAESTRO = 2;

	/**
	 * The number of structural features of the '<em>Master Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Master Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entrega3.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entrega3.impl.EntidadImpl
	 * @see entrega3.impl.Entrega3PackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entrega3.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entrega3.impl.AtributoImpl
	 * @see entrega3.impl.Entrega3PackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 2;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_EDITABLE = 0;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_MANDATORY = 1;

	/**
	 * The feature id for the '<em><b>Is Visible In List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_VISIBLE_IN_LIST = 2;

	/**
	 * The feature id for the '<em><b>Is Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__IS_TITLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NAME = 4;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO_DATO = 5;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entrega3.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entrega3.impl.ApplicationImpl
	 * @see entrega3.impl.Entrega3PackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ENTIDADES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Nav Bar Color Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAV_BAR_COLOR_HEX = 2;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TEXT_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Floating Button Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__FLOATING_BUTTON_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Detalles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DETALLES = 5;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Datos</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see entrega3.impl.Entrega3PackageImpl#getDatos()
	 * @generated
	 */
	int DATOS = 4;


	/**
	 * Returns the meta object for class '{@link entrega3.MasterDetail <em>Master Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Detail</em>'.
	 * @see entrega3.MasterDetail
	 * @generated
	 */
	EClass getMasterDetail();

	/**
	 * Returns the meta object for the reference list '{@link entrega3.MasterDetail#getEsclavo <em>Esclavo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esclavo</em>'.
	 * @see entrega3.MasterDetail#getEsclavo()
	 * @see #getMasterDetail()
	 * @generated
	 */
	EReference getMasterDetail_Esclavo();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.MasterDetail#isIsStrong <em>Is Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strong</em>'.
	 * @see entrega3.MasterDetail#isIsStrong()
	 * @see #getMasterDetail()
	 * @generated
	 */
	EAttribute getMasterDetail_IsStrong();

	/**
	 * Returns the meta object for the reference '{@link entrega3.MasterDetail#getMaestro <em>Maestro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maestro</em>'.
	 * @see entrega3.MasterDetail#getMaestro()
	 * @see #getMasterDetail()
	 * @generated
	 */
	EReference getMasterDetail_Maestro();

	/**
	 * Returns the meta object for class '{@link entrega3.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see entrega3.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the containment reference list '{@link entrega3.Entidad#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see entrega3.Entidad#getAtributos()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Entidad#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see entrega3.Entidad#getDescription()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Description();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Entidad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entrega3.Entidad#getName()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Name();

	/**
	 * Returns the meta object for class '{@link entrega3.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see entrega3.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Atributo#isIsEditable <em>Is Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Editable</em>'.
	 * @see entrega3.Atributo#isIsEditable()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsEditable();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Atributo#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see entrega3.Atributo#isIsMandatory()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsMandatory();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Atributo#isIsVisibleInList <em>Is Visible In List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Visible In List</em>'.
	 * @see entrega3.Atributo#isIsVisibleInList()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsVisibleInList();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Atributo#isIsTitle <em>Is Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Title</em>'.
	 * @see entrega3.Atributo#isIsTitle()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_IsTitle();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Atributo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entrega3.Atributo#getName()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Name();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Atributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see entrega3.Atributo#getTipoDato()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_TipoDato();

	/**
	 * Returns the meta object for class '{@link entrega3.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see entrega3.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link entrega3.Application#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades</em>'.
	 * @see entrega3.Application#getEntidades()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Entidades();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entrega3.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Application#getNavBarColorHex <em>Nav Bar Color Hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nav Bar Color Hex</em>'.
	 * @see entrega3.Application#getNavBarColorHex()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_NavBarColorHex();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Application#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see entrega3.Application#getTextColor()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link entrega3.Application#getFloatingButtonColor <em>Floating Button Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating Button Color</em>'.
	 * @see entrega3.Application#getFloatingButtonColor()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_FloatingButtonColor();

	/**
	 * Returns the meta object for the containment reference list '{@link entrega3.Application#getDetalles <em>Detalles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detalles</em>'.
	 * @see entrega3.Application#getDetalles()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Detalles();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datos</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getDatos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Entrega3Factory getEntrega3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link entrega3.impl.MasterDetailImpl <em>Master Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entrega3.impl.MasterDetailImpl
		 * @see entrega3.impl.Entrega3PackageImpl#getMasterDetail()
		 * @generated
		 */
		EClass MASTER_DETAIL = eINSTANCE.getMasterDetail();

		/**
		 * The meta object literal for the '<em><b>Esclavo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_DETAIL__ESCLAVO = eINSTANCE.getMasterDetail_Esclavo();

		/**
		 * The meta object literal for the '<em><b>Is Strong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_DETAIL__IS_STRONG = eINSTANCE.getMasterDetail_IsStrong();

		/**
		 * The meta object literal for the '<em><b>Maestro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_DETAIL__MAESTRO = eINSTANCE.getMasterDetail_Maestro();

		/**
		 * The meta object literal for the '{@link entrega3.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entrega3.impl.EntidadImpl
		 * @see entrega3.impl.Entrega3PackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ATRIBUTOS = eINSTANCE.getEntidad_Atributos();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__DESCRIPTION = eINSTANCE.getEntidad_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NAME = eINSTANCE.getEntidad_Name();

		/**
		 * The meta object literal for the '{@link entrega3.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entrega3.impl.AtributoImpl
		 * @see entrega3.impl.Entrega3PackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Is Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_EDITABLE = eINSTANCE.getAtributo_IsEditable();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_MANDATORY = eINSTANCE.getAtributo_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Visible In List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_VISIBLE_IN_LIST = eINSTANCE.getAtributo_IsVisibleInList();

		/**
		 * The meta object literal for the '<em><b>Is Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__IS_TITLE = eINSTANCE.getAtributo_IsTitle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NAME = eINSTANCE.getAtributo_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO_DATO = eINSTANCE.getAtributo_TipoDato();

		/**
		 * The meta object literal for the '{@link entrega3.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entrega3.impl.ApplicationImpl
		 * @see entrega3.impl.Entrega3PackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ENTIDADES = eINSTANCE.getApplication_Entidades();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Nav Bar Color Hex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAV_BAR_COLOR_HEX = eINSTANCE.getApplication_NavBarColorHex();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__TEXT_COLOR = eINSTANCE.getApplication_TextColor();

		/**
		 * The meta object literal for the '<em><b>Floating Button Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__FLOATING_BUTTON_COLOR = eINSTANCE.getApplication_FloatingButtonColor();

		/**
		 * The meta object literal for the '<em><b>Detalles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DETALLES = eINSTANCE.getApplication_Detalles();

		/**
		 * The meta object literal for the '<em>Datos</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see entrega3.impl.Entrega3PackageImpl#getDatos()
		 * @generated
		 */
		EDataType DATOS = eINSTANCE.getDatos();

	}

} //Entrega3Package
