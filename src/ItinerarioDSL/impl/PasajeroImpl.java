/**
 */
package ItinerarioDSL.impl;

import ItinerarioDSL.Itinerario;
import ItinerarioDSL.ItinerarioDSLPackage;
import ItinerarioDSL.Pasajero;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pasajero</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioDSL.impl.PasajeroImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ItinerarioDSL.impl.PasajeroImpl#getItinerarios <em>Itinerarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PasajeroImpl extends MinimalEObjectImpl.Container implements Pasajero {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItinerarios() <em>Itinerarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItinerarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Itinerario> itinerarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasajeroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItinerarioDSLPackage.Literals.PASAJERO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDSLPackage.PASAJERO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Itinerario> getItinerarios() {
		if (itinerarios == null) {
			itinerarios = new EObjectResolvingEList<Itinerario>(Itinerario.class, this, ItinerarioDSLPackage.PASAJERO__ITINERARIOS);
		}
		return itinerarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItinerarioDSLPackage.PASAJERO__NOMBRE:
				return getNombre();
			case ItinerarioDSLPackage.PASAJERO__ITINERARIOS:
				return getItinerarios();
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
			case ItinerarioDSLPackage.PASAJERO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ItinerarioDSLPackage.PASAJERO__ITINERARIOS:
				getItinerarios().clear();
				getItinerarios().addAll((Collection<? extends Itinerario>)newValue);
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
			case ItinerarioDSLPackage.PASAJERO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ItinerarioDSLPackage.PASAJERO__ITINERARIOS:
				getItinerarios().clear();
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
			case ItinerarioDSLPackage.PASAJERO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ItinerarioDSLPackage.PASAJERO__ITINERARIOS:
				return itinerarios != null && !itinerarios.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //PasajeroImpl
