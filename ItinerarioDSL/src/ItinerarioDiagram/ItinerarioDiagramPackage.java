/**
 */
package ItinerarioDiagram;

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
 * @see ItinerarioDiagram.ItinerarioDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ItinerarioDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ItinerarioDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://itinerarios/";

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
	ItinerarioDiagramPackage eINSTANCE = ItinerarioDiagram.impl.ItinerarioDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ItinerarioDiagram.impl.ItinerarioImpl <em>Itinerario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioDiagram.impl.ItinerarioImpl
	 * @see ItinerarioDiagram.impl.ItinerarioDiagramPackageImpl#getItinerario()
	 * @generated
	 */
	int ITINERARIO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Pasajero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__PASAJERO = 2;

	/**
	 * The feature id for the '<em><b>Vuelos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__VUELOS = 3;

	/**
	 * The number of structural features of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ItinerarioDiagram.impl.VueloImpl <em>Vuelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioDiagram.impl.VueloImpl
	 * @see ItinerarioDiagram.impl.ItinerarioDiagramPackageImpl#getVuelo()
	 * @generated
	 */
	int VUELO = 1;

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
	 * The meta object id for the '{@link ItinerarioDiagram.impl.PasajeroImpl <em>Pasajero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioDiagram.impl.PasajeroImpl
	 * @see ItinerarioDiagram.impl.ItinerarioDiagramPackageImpl#getPasajero()
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
	 * Returns the meta object for class '{@link ItinerarioDiagram.Itinerario <em>Itinerario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itinerario</em>'.
	 * @see ItinerarioDiagram.Itinerario
	 * @generated
	 */
	EClass getItinerario();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Itinerario#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ItinerarioDiagram.Itinerario#getNombre()
	 * @see #getItinerario()
	 * @generated
	 */
	EAttribute getItinerario_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Itinerario#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see ItinerarioDiagram.Itinerario#getTipo()
	 * @see #getItinerario()
	 * @generated
	 */
	EAttribute getItinerario_Tipo();

	/**
	 * Returns the meta object for the reference '{@link ItinerarioDiagram.Itinerario#getPasajero <em>Pasajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pasajero</em>'.
	 * @see ItinerarioDiagram.Itinerario#getPasajero()
	 * @see #getItinerario()
	 * @generated
	 */
	EReference getItinerario_Pasajero();

	/**
	 * Returns the meta object for the containment reference list '{@link ItinerarioDiagram.Itinerario#getVuelos <em>Vuelos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vuelos</em>'.
	 * @see ItinerarioDiagram.Itinerario#getVuelos()
	 * @see #getItinerario()
	 * @generated
	 */
	EReference getItinerario_Vuelos();

	/**
	 * Returns the meta object for class '{@link ItinerarioDiagram.Vuelo <em>Vuelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vuelo</em>'.
	 * @see ItinerarioDiagram.Vuelo
	 * @generated
	 */
	EClass getVuelo();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Vuelo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ItinerarioDiagram.Vuelo#getNombre()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Vuelo#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see ItinerarioDiagram.Vuelo#getOrigen()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Origen();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Vuelo#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destino</em>'.
	 * @see ItinerarioDiagram.Vuelo#getDestino()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Destino();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Vuelo#getSalida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salida</em>'.
	 * @see ItinerarioDiagram.Vuelo#getSalida()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Salida();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Vuelo#getLlegada <em>Llegada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Llegada</em>'.
	 * @see ItinerarioDiagram.Vuelo#getLlegada()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Llegada();

	/**
	 * Returns the meta object for class '{@link ItinerarioDiagram.Pasajero <em>Pasajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pasajero</em>'.
	 * @see ItinerarioDiagram.Pasajero
	 * @generated
	 */
	EClass getPasajero();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioDiagram.Pasajero#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ItinerarioDiagram.Pasajero#getNombre()
	 * @see #getPasajero()
	 * @generated
	 */
	EAttribute getPasajero_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link ItinerarioDiagram.Pasajero#getItinerarios <em>Itinerarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Itinerarios</em>'.
	 * @see ItinerarioDiagram.Pasajero#getItinerarios()
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
	ItinerarioDiagramFactory getItinerarioDiagramFactory();

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
		 * The meta object literal for the '{@link ItinerarioDiagram.impl.ItinerarioImpl <em>Itinerario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioDiagram.impl.ItinerarioImpl
		 * @see ItinerarioDiagram.impl.ItinerarioDiagramPackageImpl#getItinerario()
		 * @generated
		 */
		EClass ITINERARIO = eINSTANCE.getItinerario();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITINERARIO__NOMBRE = eINSTANCE.getItinerario_Nombre();

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
		 * The meta object literal for the '{@link ItinerarioDiagram.impl.VueloImpl <em>Vuelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioDiagram.impl.VueloImpl
		 * @see ItinerarioDiagram.impl.ItinerarioDiagramPackageImpl#getVuelo()
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
		 * The meta object literal for the '{@link ItinerarioDiagram.impl.PasajeroImpl <em>Pasajero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioDiagram.impl.PasajeroImpl
		 * @see ItinerarioDiagram.impl.ItinerarioDiagramPackageImpl#getPasajero()
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

} //ItinerarioDiagramPackage
