/**
 */
package ItinerarioDiagram.impl;

import ItinerarioDiagram.*;

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
public class ItinerarioDiagramFactoryImpl extends EFactoryImpl implements ItinerarioDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItinerarioDiagramFactory init() {
		try {
			ItinerarioDiagramFactory theItinerarioDiagramFactory = (ItinerarioDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ItinerarioDiagramPackage.eNS_URI);
			if (theItinerarioDiagramFactory != null) {
				return theItinerarioDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ItinerarioDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItinerarioDiagramFactoryImpl() {
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
			case ItinerarioDiagramPackage.ITINERARIO: return createItinerario();
			case ItinerarioDiagramPackage.VUELO: return createVuelo();
			case ItinerarioDiagramPackage.PASAJERO: return createPasajero();
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
	public ItinerarioDiagramPackage getItinerarioDiagramPackage() {
		return (ItinerarioDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ItinerarioDiagramPackage getPackage() {
		return ItinerarioDiagramPackage.eINSTANCE;
	}

} //ItinerarioDiagramFactoryImpl
