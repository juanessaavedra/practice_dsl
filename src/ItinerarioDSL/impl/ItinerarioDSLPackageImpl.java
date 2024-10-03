/**
 */
package ItinerarioDSL.impl;

import ItinerarioDSL.Itinerario;
import ItinerarioDSL.ItinerarioDSLFactory;
import ItinerarioDSL.ItinerarioDSLPackage;
import ItinerarioDSL.Pasajero;
import ItinerarioDSL.Vuelo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItinerarioDSLPackageImpl extends EPackageImpl implements ItinerarioDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vueloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itinerarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pasajeroEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ItinerarioDSL.ItinerarioDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ItinerarioDSLPackageImpl() {
		super(eNS_URI, ItinerarioDSLFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ItinerarioDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ItinerarioDSLPackage init() {
		if (isInited) return (ItinerarioDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ItinerarioDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredItinerarioDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ItinerarioDSLPackageImpl theItinerarioDSLPackage = registeredItinerarioDSLPackage instanceof ItinerarioDSLPackageImpl ? (ItinerarioDSLPackageImpl)registeredItinerarioDSLPackage : new ItinerarioDSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theItinerarioDSLPackage.createPackageContents();

		// Initialize created meta-data
		theItinerarioDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theItinerarioDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ItinerarioDSLPackage.eNS_URI, theItinerarioDSLPackage);
		return theItinerarioDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVuelo() {
		return vueloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVuelo_Nombre() {
		return (EAttribute)vueloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVuelo_Origen() {
		return (EAttribute)vueloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVuelo_Destino() {
		return (EAttribute)vueloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVuelo_Salida() {
		return (EAttribute)vueloEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVuelo_Llegada() {
		return (EAttribute)vueloEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItinerario() {
		return itinerarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItinerario_Tipo() {
		return (EAttribute)itinerarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItinerario_Pasajero() {
		return (EReference)itinerarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItinerario_Vuelos() {
		return (EReference)itinerarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPasajero() {
		return pasajeroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPasajero_Nombre() {
		return (EAttribute)pasajeroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPasajero_Itinerarios() {
		return (EReference)pasajeroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItinerarioDSLFactory getItinerarioDSLFactory() {
		return (ItinerarioDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vueloEClass = createEClass(VUELO);
		createEAttribute(vueloEClass, VUELO__NOMBRE);
		createEAttribute(vueloEClass, VUELO__ORIGEN);
		createEAttribute(vueloEClass, VUELO__DESTINO);
		createEAttribute(vueloEClass, VUELO__SALIDA);
		createEAttribute(vueloEClass, VUELO__LLEGADA);

		itinerarioEClass = createEClass(ITINERARIO);
		createEAttribute(itinerarioEClass, ITINERARIO__TIPO);
		createEReference(itinerarioEClass, ITINERARIO__PASAJERO);
		createEReference(itinerarioEClass, ITINERARIO__VUELOS);

		pasajeroEClass = createEClass(PASAJERO);
		createEAttribute(pasajeroEClass, PASAJERO__NOMBRE);
		createEReference(pasajeroEClass, PASAJERO__ITINERARIOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(vueloEClass, Vuelo.class, "Vuelo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVuelo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Vuelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVuelo_Origen(), ecorePackage.getEString(), "origen", null, 0, 1, Vuelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVuelo_Destino(), ecorePackage.getEString(), "destino", null, 0, 1, Vuelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVuelo_Salida(), ecorePackage.getEDate(), "salida", null, 0, 1, Vuelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVuelo_Llegada(), ecorePackage.getEDate(), "llegada", null, 0, 1, Vuelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itinerarioEClass, Itinerario.class, "Itinerario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItinerario_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Itinerario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItinerario_Pasajero(), this.getPasajero(), null, "pasajero", null, 0, 1, Itinerario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItinerario_Vuelos(), this.getVuelo(), null, "vuelos", null, 0, -1, Itinerario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pasajeroEClass, Pasajero.class, "Pasajero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPasajero_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Pasajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPasajero_Itinerarios(), this.getItinerario(), null, "itinerarios", null, 0, -1, Pasajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ItinerarioDSLPackageImpl
