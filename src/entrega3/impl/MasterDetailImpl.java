/**
 */
package entrega3.impl;

import entrega3.Entidad;
import entrega3.Entrega3Package;
import entrega3.MasterDetail;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entrega3.impl.MasterDetailImpl#getEsclavo <em>Esclavo</em>}</li>
 *   <li>{@link entrega3.impl.MasterDetailImpl#isIsStrong <em>Is Strong</em>}</li>
 *   <li>{@link entrega3.impl.MasterDetailImpl#getMaestro <em>Maestro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MasterDetailImpl extends MinimalEObjectImpl.Container implements MasterDetail {
	/**
	 * The cached value of the '{@link #getEsclavo() <em>Esclavo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsclavo()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> esclavo;

	/**
	 * The default value of the '{@link #isIsStrong() <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrong()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRONG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStrong() <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrong()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrong = IS_STRONG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaestro() <em>Maestro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaestro()
	 * @generated
	 * @ordered
	 */
	protected Entidad maestro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Entrega3Package.Literals.MASTER_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEsclavo() {
		if (esclavo == null) {
			esclavo = new EObjectResolvingEList<Entidad>(Entidad.class, this, Entrega3Package.MASTER_DETAIL__ESCLAVO);
		}
		return esclavo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStrong() {
		return isStrong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrong(boolean newIsStrong) {
		boolean oldIsStrong = isStrong;
		isStrong = newIsStrong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.MASTER_DETAIL__IS_STRONG, oldIsStrong, isStrong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getMaestro() {
		if (maestro != null && maestro.eIsProxy()) {
			InternalEObject oldMaestro = (InternalEObject)maestro;
			maestro = (Entidad)eResolveProxy(oldMaestro);
			if (maestro != oldMaestro) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Entrega3Package.MASTER_DETAIL__MAESTRO, oldMaestro, maestro));
			}
		}
		return maestro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetMaestro() {
		return maestro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaestro(Entidad newMaestro) {
		Entidad oldMaestro = maestro;
		maestro = newMaestro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Entrega3Package.MASTER_DETAIL__MAESTRO, oldMaestro, maestro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Entrega3Package.MASTER_DETAIL__ESCLAVO:
				return getEsclavo();
			case Entrega3Package.MASTER_DETAIL__IS_STRONG:
				return isIsStrong();
			case Entrega3Package.MASTER_DETAIL__MAESTRO:
				if (resolve) return getMaestro();
				return basicGetMaestro();
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
			case Entrega3Package.MASTER_DETAIL__ESCLAVO:
				getEsclavo().clear();
				getEsclavo().addAll((Collection<? extends Entidad>)newValue);
				return;
			case Entrega3Package.MASTER_DETAIL__IS_STRONG:
				setIsStrong((Boolean)newValue);
				return;
			case Entrega3Package.MASTER_DETAIL__MAESTRO:
				setMaestro((Entidad)newValue);
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
			case Entrega3Package.MASTER_DETAIL__ESCLAVO:
				getEsclavo().clear();
				return;
			case Entrega3Package.MASTER_DETAIL__IS_STRONG:
				setIsStrong(IS_STRONG_EDEFAULT);
				return;
			case Entrega3Package.MASTER_DETAIL__MAESTRO:
				setMaestro((Entidad)null);
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
			case Entrega3Package.MASTER_DETAIL__ESCLAVO:
				return esclavo != null && !esclavo.isEmpty();
			case Entrega3Package.MASTER_DETAIL__IS_STRONG:
				return isStrong != IS_STRONG_EDEFAULT;
			case Entrega3Package.MASTER_DETAIL__MAESTRO:
				return maestro != null;
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
		result.append(" (isStrong: ");
		result.append(isStrong);
		result.append(')');
		return result.toString();
	}

} //MasterDetailImpl
