/**
 */
package ItinerarioDiagram.impl;

import ItinerarioDiagram.ItinerarioDiagramPackage;
import ItinerarioDiagram.Vuelo;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vuelo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioDiagram.impl.VueloImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ItinerarioDiagram.impl.VueloImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ItinerarioDiagram.impl.VueloImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link ItinerarioDiagram.impl.VueloImpl#getSalida <em>Salida</em>}</li>
 *   <li>{@link ItinerarioDiagram.impl.VueloImpl#getLlegada <em>Llegada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VueloImpl extends MinimalEObjectImpl.Container implements Vuelo {
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
	 * The default value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected String origen = ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestino() <em>Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected String destino = DESTINO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalida() <em>Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalida()
	 * @generated
	 * @ordered
	 */
	protected static final Date SALIDA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalida() <em>Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalida()
	 * @generated
	 * @ordered
	 */
	protected Date salida = SALIDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLlegada() <em>Llegada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLlegada()
	 * @generated
	 * @ordered
	 */
	protected static final Date LLEGADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLlegada() <em>Llegada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLlegada()
	 * @generated
	 * @ordered
	 */
	protected Date llegada = LLEGADA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VueloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItinerarioDiagramPackage.Literals.VUELO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDiagramPackage.VUELO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigen(String newOrigen) {
		String oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDiagramPackage.VUELO__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestino(String newDestino) {
		String oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDiagramPackage.VUELO__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSalida() {
		return salida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalida(Date newSalida) {
		Date oldSalida = salida;
		salida = newSalida;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDiagramPackage.VUELO__SALIDA, oldSalida, salida));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLlegada() {
		return llegada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLlegada(Date newLlegada) {
		Date oldLlegada = llegada;
		llegada = newLlegada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioDiagramPackage.VUELO__LLEGADA, oldLlegada, llegada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItinerarioDiagramPackage.VUELO__NOMBRE:
				return getNombre();
			case ItinerarioDiagramPackage.VUELO__ORIGEN:
				return getOrigen();
			case ItinerarioDiagramPackage.VUELO__DESTINO:
				return getDestino();
			case ItinerarioDiagramPackage.VUELO__SALIDA:
				return getSalida();
			case ItinerarioDiagramPackage.VUELO__LLEGADA:
				return getLlegada();
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
			case ItinerarioDiagramPackage.VUELO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ItinerarioDiagramPackage.VUELO__ORIGEN:
				setOrigen((String)newValue);
				return;
			case ItinerarioDiagramPackage.VUELO__DESTINO:
				setDestino((String)newValue);
				return;
			case ItinerarioDiagramPackage.VUELO__SALIDA:
				setSalida((Date)newValue);
				return;
			case ItinerarioDiagramPackage.VUELO__LLEGADA:
				setLlegada((Date)newValue);
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
			case ItinerarioDiagramPackage.VUELO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ItinerarioDiagramPackage.VUELO__ORIGEN:
				setOrigen(ORIGEN_EDEFAULT);
				return;
			case ItinerarioDiagramPackage.VUELO__DESTINO:
				setDestino(DESTINO_EDEFAULT);
				return;
			case ItinerarioDiagramPackage.VUELO__SALIDA:
				setSalida(SALIDA_EDEFAULT);
				return;
			case ItinerarioDiagramPackage.VUELO__LLEGADA:
				setLlegada(LLEGADA_EDEFAULT);
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
			case ItinerarioDiagramPackage.VUELO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ItinerarioDiagramPackage.VUELO__ORIGEN:
				return ORIGEN_EDEFAULT == null ? origen != null : !ORIGEN_EDEFAULT.equals(origen);
			case ItinerarioDiagramPackage.VUELO__DESTINO:
				return DESTINO_EDEFAULT == null ? destino != null : !DESTINO_EDEFAULT.equals(destino);
			case ItinerarioDiagramPackage.VUELO__SALIDA:
				return SALIDA_EDEFAULT == null ? salida != null : !SALIDA_EDEFAULT.equals(salida);
			case ItinerarioDiagramPackage.VUELO__LLEGADA:
				return LLEGADA_EDEFAULT == null ? llegada != null : !LLEGADA_EDEFAULT.equals(llegada);
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
		result.append(", origen: ");
		result.append(origen);
		result.append(", destino: ");
		result.append(destino);
		result.append(", salida: ");
		result.append(salida);
		result.append(", llegada: ");
		result.append(llegada);
		result.append(')');
		return result.toString();
	}

} //VueloImpl
