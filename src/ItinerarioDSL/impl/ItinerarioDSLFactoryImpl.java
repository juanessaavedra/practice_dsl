/**
 */
package ItinerarioDSL.impl;

import ItinerarioDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItinerarioDSLFactoryImpl extends EFactoryImpl implements ItinerarioDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItinerarioDSLFactory init() {
		try {
			ItinerarioDSLFactory theItinerarioDSLFactory = (ItinerarioDSLFactory)EPackage.Registry.INSTANCE.getEFactory(ItinerarioDSLPackage.eNS_URI);
			if (theItinerarioDSLFactory != null) {
				return theItinerarioDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ItinerarioDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItinerarioDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ItinerarioDSLPackage.VUELO: return createVuelo();
			case ItinerarioDSLPackage.ITINERARIO: return createItinerario();
			case ItinerarioDSLPackage.PASAJERO: return createPasajero();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vuelo createVuelo() {
		VueloImpl vuelo = new VueloImpl();
		return vuelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Itinerario createItinerario() {
		ItinerarioImpl itinerario = new ItinerarioImpl();
		return itinerario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pasajero createPasajero() {
		PasajeroImpl pasajero = new PasajeroImpl();
		return pasajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItinerarioDSLPackage getItinerarioDSLPackage() {
		return (ItinerarioDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ItinerarioDSLPackage getPackage() {
		return ItinerarioDSLPackage.eINSTANCE;
	}

} //ItinerarioDSLFactoryImpl
