/**
 */
package ItinerarioDSL.impl;

import ItinerarioDSL.Itinerario;
import ItinerarioDSL.ItinerarioDSLPackage;
import ItinerarioDSL.Pasajero;
import ItinerarioDSL.Vuelo;

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
 * An implementation of the model object '<em><b>Itinerario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioDSL.impl.ItinerarioImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ItinerarioDSL.impl.ItinerarioImpl#getPasajero <em>Pasajero</em>}</li>
 *   <li>{@link ItinerarioDSL.impl.ItinerarioImpl#getVuelos <em>Vuelos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItinerarioImpl extends MinimalEObjectImpl.Container implements Itinerario {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPasajero() <em>Pasajero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasajero()
	 * @generated
	 * @ordered
	 */
	protected Pasajero pasajero;

	/**
	 * The cached value of the '{@link #getVuelos() <em>Vuelos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVuelos()
	 * @generated
	 * @ordered
	 */
	protected EList<Vuelo> vuelos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItinerarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItinerarioDSLPackage.Literals.ITINERARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDSLPackage.ITINERARIO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pasajero getPasajero() {
		if (pasajero != null && pasajero.eIsProxy()) {
			InternalEObject oldPasajero = (InternalEObject)pasajero;
			pasajero = (Pasajero)eResolveProxy(oldPasajero);
			if (pasajero != oldPasajero) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ItinerarioDSLPackage.ITINERARIO__PASAJERO, oldPasajero, pasajero));
			}
		}
		return pasajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pasajero basicGetPasajero() {
		return pasajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasajero(Pasajero newPasajero) {
		Pasajero oldPasajero = pasajero;
		pasajero = newPasajero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDSLPackage.ITINERARIO__PASAJERO, oldPasajero, pasajero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vuelo> getVuelos() {
		if (vuelos == null) {
			vuelos = new EObjectContainmentEList<Vuelo>(Vuelo.class, this, ItinerarioDSLPackage.ITINERARIO__VUELOS);
		}
		return vuelos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItinerarioDSLPackage.ITINERARIO__VUELOS:
				return ((InternalEList<?>)getVuelos()).basicRemove(otherEnd, msgs);
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
			case ItinerarioDSLPackage.ITINERARIO__TIPO:
				return getTipo();
			case ItinerarioDSLPackage.ITINERARIO__PASAJERO:
				if (resolve) return getPasajero();
				return basicGetPasajero();
			case ItinerarioDSLPackage.ITINERARIO__VUELOS:
				return getVuelos();
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
			case ItinerarioDSLPackage.ITINERARIO__TIPO:
				setTipo((String)newValue);
				return;
			case ItinerarioDSLPackage.ITINERARIO__PASAJERO:
				setPasajero((Pasajero)newValue);
				return;
			case ItinerarioDSLPackage.ITINERARIO__VUELOS:
				getVuelos().clear();
				getVuelos().addAll((Collection<? extends Vuelo>)newValue);
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
			case ItinerarioDSLPackage.ITINERARIO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case ItinerarioDSLPackage.ITINERARIO__PASAJERO:
				setPasajero((Pasajero)null);
				return;
			case ItinerarioDSLPackage.ITINERARIO__VUELOS:
				getVuelos().clear();
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
			case ItinerarioDSLPackage.ITINERARIO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case ItinerarioDSLPackage.ITINERARIO__PASAJERO:
				return pasajero != null;
			case ItinerarioDSLPackage.ITINERARIO__VUELOS:
				return vuelos != null && !vuelos.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //ItinerarioImpl
