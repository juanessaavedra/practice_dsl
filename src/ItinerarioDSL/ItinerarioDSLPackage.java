/**
 */
package ItinerarioDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ItinerarioDSL.ItinerarioDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ItinerarioDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ItinerarioDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "htttp://itinerario/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "i";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItinerarioDSLPackage eINSTANCE = ItinerarioDSL.impl.ItinerarioDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ItinerarioDSL.impl.VueloImpl <em>Vuelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioDSL.impl.VueloImpl
	 * @see ItinerarioDSL.impl.ItinerarioDSLPackageImpl#getVuelo()
	 * @generated
	 */
	int VUELO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__ORIGEN = 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__DESTINO = 2;

	/**
	 * The feature id for the '<em><b>Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__SALIDA = 3;

	/**
	 * The feature id for the '<em><b>Llegada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__LLEGADA = 4;

	/**
	 * The number of structural features of the '<em>Vuelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vuelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ItinerarioDSL.impl.ItinerarioImpl <em>Itinerario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioDSL.impl.ItinerarioImpl
	 * @see ItinerarioDSL.impl.ItinerarioDSLPackageImpl#getItinerario()
	 * @generated
	 */
	int ITINERARIO = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Pasajero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__PASAJERO = 1;

	/**
	 * The feature id for the '<em><b>Vuelos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__VUELOS = 2;

	/**
	 * The number of structural features of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ItinerarioDSL.impl.PasajeroImpl <em>Pasajero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioDSL.impl.PasajeroImpl
	 * @see ItinerarioDSL.impl.ItinerarioDSLPackageImpl#getPasajero()
	 * @generated
	 */
	int PASAJERO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Itinerarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO__ITINERARIOS = 1;

	/**
	 * The number of structural features of the '<em>Pasajero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pasajero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ItinerarioDSL.Vuelo <em>Vuelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vuelo</em>'.
	 * @see ItinerarioDSL.Vuelo
	 * @generated
	 */
	EClass getVuelo();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDSL.Vuelo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ItinerarioDSL.Vuelo#getNombre()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDSL.Vuelo#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see ItinerarioDSL.Vuelo#getOrigen()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Origen();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDSL.Vuelo#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destino</em>'.
	 * @see ItinerarioDSL.Vuelo#getDestino()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Destino();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDSL.Vuelo#getSalida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salida</em>'.
	 * @see ItinerarioDSL.Vuelo#getSalida()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Salida();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDSL.Vuelo#getLlegada <em>Llegada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Llegada</em>'.
	 * @see ItinerarioDSL.Vuelo#getLlegada()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Llegada();

	/**
	 * Returns the meta object for class '{@link ItinerarioDSL.Itinerario <em>Itinerario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itinerario</em>'.
	 * @see ItinerarioDSL.Itinerario
	 * @generated
	 */
	EClass getItinerario();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDSL.Itinerario#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see ItinerarioDSL.Itinerario#getTipo()
	 * @see #getItinerario()
	 * @generated
	 */
	EAttribute getItinerario_Tipo();

	/**
	 * Returns the meta object for the reference '{@link ItinerarioDSL.Itinerario#getPasajero <em>Pasajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pasajero</em>'.
	 * @see ItinerarioDSL.Itinerario#getPasajero()
	 * @see #getItinerario()
	 * @generated
	 */
	EReference getItinerario_Pasajero();

	/**
	 * Returns the meta object for the containment reference list '{@link ItinerarioDSL.Itinerario#getVuelos <em>Vuelos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vuelos</em>'.
	 * @see ItinerarioDSL.Itinerario#getVuelos()
	 * @see #getItinerario()
	 * @generated
	 */
	EReference getItinerario_Vuelos();

	/**
	 * Returns the meta object for class '{@link ItinerarioDSL.Pasajero <em>Pasajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pasajero</em>'.
	 * @see ItinerarioDSL.Pasajero
	 * @generated
	 */
	EClass getPasajero();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDSL.Pasajero#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ItinerarioDSL.Pasajero#getNombre()
	 * @see #getPasajero()
	 * @generated
	 */
	EAttribute getPasajero_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link ItinerarioDSL.Pasajero#getItinerarios <em>Itinerarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Itinerarios</em>'.
	 * @see ItinerarioDSL.Pasajero#getItinerarios()
	 * @see #getPasajero()
	 * @generated
	 */
	EReference getPasajero_Itinerarios();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItinerarioDSLFactory getItinerarioDSLFactory();

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
		 * The meta object literal for the '{@link ItinerarioDSL.impl.VueloImpl <em>Vuelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioDSL.impl.VueloImpl
		 * @see ItinerarioDSL.impl.ItinerarioDSLPackageImpl#getVuelo()
		 * @generated
		 */
		EClass VUELO = eINSTANCE.getVuelo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__NOMBRE = eINSTANCE.getVuelo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__ORIGEN = eINSTANCE.getVuelo_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__DESTINO = eINSTANCE.getVuelo_Destino();

		/**
		 * The meta object literal for the '<em><b>Salida</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__SALIDA = eINSTANCE.getVuelo_Salida();

		/**
		 * The meta object literal for the '<em><b>Llegada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__LLEGADA = eINSTANCE.getVuelo_Llegada();

		/**
		 * The meta object literal for the '{@link ItinerarioDSL.impl.ItinerarioImpl <em>Itinerario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioDSL.impl.ItinerarioImpl
		 * @see ItinerarioDSL.impl.ItinerarioDSLPackageImpl#getItinerario()
		 * @generated
		 */
		EClass ITINERARIO = eINSTANCE.getItinerario();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITINERARIO__TIPO = eINSTANCE.getItinerario_Tipo();

		/**
		 * The meta object literal for the '<em><b>Pasajero</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERARIO__PASAJERO = eINSTANCE.getItinerario_Pasajero();

		/**
		 * The meta object literal for the '<em><b>Vuelos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERARIO__VUELOS = eINSTANCE.getItinerario_Vuelos();

		/**
		 * The meta object literal for the '{@link ItinerarioDSL.impl.PasajeroImpl <em>Pasajero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioDSL.impl.PasajeroImpl
		 * @see ItinerarioDSL.impl.ItinerarioDSLPackageImpl#getPasajero()
		 * @generated
		 */
		EClass PASAJERO = eINSTANCE.getPasajero();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASAJERO__NOMBRE = eINSTANCE.getPasajero_Nombre();

		/**
		 * The meta object literal for the '<em><b>Itinerarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASAJERO__ITINERARIOS = eINSTANCE.getPasajero_Itinerarios();

	}

} //ItinerarioDSLPackage
