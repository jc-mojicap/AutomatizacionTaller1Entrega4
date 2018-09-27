/**
 */
package entrega3.impl;

import entrega3.Application;
import entrega3.Entidad;
import entrega3.Entrega3Package;
import entrega3.MasterDetail;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entrega3.impl.ApplicationImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link entrega3.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link entrega3.impl.ApplicationImpl#getNavBarColorHex <em>Nav Bar Color Hex</em>}</li>
 *   <li>{@link entrega3.impl.ApplicationImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link entrega3.impl.ApplicationImpl#getFloatingButtonColor <em>Floating Button Color</em>}</li>
 *   <li>{@link entrega3.impl.ApplicationImpl#getDetalles <em>Detalles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidades;

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
	 * The default value of the '{@link #getNavBarColorHex() <em>Nav Bar Color Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavBarColorHex()
	 * @generated
	 * @ordered
	 */
	protected static final String NAV_BAR_COLOR_HEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavBarColorHex() <em>Nav Bar Color Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavBarColorHex()
	 * @generated
	 * @ordered
	 */
	protected String navBarColorHex = NAV_BAR_COLOR_HEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected String textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatingButtonColor() <em>Floating Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingButtonColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_BUTTON_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatingButtonColor() <em>Floating Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingButtonColor()
	 * @generated
	 * @ordered
	 */
	protected String floatingButtonColor = FLOATING_BUTTON_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetalles() <em>Detalles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetalles()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterDetail> detalles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Entrega3Package.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectContainmentEList<Entidad>(Entidad.class, this, Entrega3Package.APPLICATION__ENTIDADES);
		}
		return entidades;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavBarColorHex() {
		return navBarColorHex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavBarColorHex(String newNavBarColorHex) {
		String oldNavBarColorHex = navBarColorHex;
		navBarColorHex = newNavBarColorHex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.APPLICATION__NAV_BAR_COLOR_HEX, oldNavBarColorHex, navBarColorHex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(String newTextColor) {
		String oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.APPLICATION__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloatingButtonColor() {
		return floatingButtonColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingButtonColor(String newFloatingButtonColor) {
		String oldFloatingButtonColor = floatingButtonColor;
		floatingButtonColor = newFloatingButtonColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.APPLICATION__FLOATING_BUTTON_COLOR, oldFloatingButtonColor, floatingButtonColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterDetail> getDetalles() {
		if (detalles == null) {
			detalles = new EObjectContainmentEList<MasterDetail>(MasterDetail.class, this, Entrega3Package.APPLICATION__DETALLES);
		}
		return detalles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Entrega3Package.APPLICATION__ENTIDADES:
				return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
			case Entrega3Package.APPLICATION__DETALLES:
				return ((InternalEList<?>)getDetalles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Entrega3Package.APPLICATION__ENTIDADES:
				return getEntidades();
			case Entrega3Package.APPLICATION__NAME:
				return getName();
			case Entrega3Package.APPLICATION__NAV_BAR_COLOR_HEX:
				return getNavBarColorHex();
			case Entrega3Package.APPLICATION__TEXT_COLOR:
				return getTextColor();
			case Entrega3Package.APPLICATION__FLOATING_BUTTON_COLOR:
				return getFloatingButtonColor();
			case Entrega3Package.APPLICATION__DETALLES:
				return getDetalles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Entrega3Package.APPLICATION__ENTIDADES:
				getEntidades().clear();
				getEntidades().addAll((Collection<? extends Entidad>)newValue);
				return;
			case Entrega3Package.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case Entrega3Package.APPLICATION__NAV_BAR_COLOR_HEX:
				setNavBarColorHex((String)newValue);
				return;
			case Entrega3Package.APPLICATION__TEXT_COLOR:
				setTextColor((String)newValue);
				return;
			case Entrega3Package.APPLICATION__FLOATING_BUTTON_COLOR:
				setFloatingButtonColor((String)newValue);
				return;
			case Entrega3Package.APPLICATION__DETALLES:
				getDetalles().clear();
				getDetalles().addAll((Collection<? extends MasterDetail>)newValue);
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
			case Entrega3Package.APPLICATION__ENTIDADES:
				getEntidades().clear();
				return;
			case Entrega3Package.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Entrega3Package.APPLICATION__NAV_BAR_COLOR_HEX:
				setNavBarColorHex(NAV_BAR_COLOR_HEX_EDEFAULT);
				return;
			case Entrega3Package.APPLICATION__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case Entrega3Package.APPLICATION__FLOATING_BUTTON_COLOR:
				setFloatingButtonColor(FLOATING_BUTTON_COLOR_EDEFAULT);
				return;
			case Entrega3Package.APPLICATION__DETALLES:
				getDetalles().clear();
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
			case Entrega3Package.APPLICATION__ENTIDADES:
				return entidades != null && !entidades.isEmpty();
			case Entrega3Package.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Entrega3Package.APPLICATION__NAV_BAR_COLOR_HEX:
				return NAV_BAR_COLOR_HEX_EDEFAULT == null ? navBarColorHex != null : !NAV_BAR_COLOR_HEX_EDEFAULT.equals(navBarColorHex);
			case Entrega3Package.APPLICATION__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
			case Entrega3Package.APPLICATION__FLOATING_BUTTON_COLOR:
				return FLOATING_BUTTON_COLOR_EDEFAULT == null ? floatingButtonColor != null : !FLOATING_BUTTON_COLOR_EDEFAULT.equals(floatingButtonColor);
			case Entrega3Package.APPLICATION__DETALLES:
				return detalles != null && !detalles.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", navBarColorHex: ");
		result.append(navBarColorHex);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", floatingButtonColor: ");
		result.append(floatingButtonColor);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
