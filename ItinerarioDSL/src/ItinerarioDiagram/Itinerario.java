/**
 */
package ItinerarioDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Itinerario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioDiagram.Itinerario#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ItinerarioDiagram.Itinerario#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ItinerarioDiagram.Itinerario#getPasajero <em>Pasajero</em>}</li>
 *   <li>{@link ItinerarioDiagram.Itinerario#getVuelos <em>Vuelos</em>}</li>
 * </ul>
 *
 * @see ItinerarioDiagram.ItinerarioDiagramPackage#getItinerario()
 * @model
 * @generated
 */
public interface Itinerario extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ItinerarioDiagram.ItinerarioDiagramPackage#getItinerario_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ItinerarioDiagram.Itinerario#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see ItinerarioDiagram.ItinerarioDiagramPackage#getItinerario_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link ItinerarioDiagram.Itinerario#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Pasajero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pasajero</em>' reference.
	 * @see #setPasajero(Pasajero)
	 * @see ItinerarioDiagram.ItinerarioDiagramPackage#getItinerario_Pasajero()
	 * @model required="true"
	 * @generated
	 */
	Pasajero getPasajero();

	/**
	 * Sets the value of the '{@link ItinerarioDiagram.Itinerario#getPasajero <em>Pasajero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pasajero</em>' reference.
	 * @see #getPasajero()
	 * @generated
	 */
	void setPasajero(Pasajero value);

	/**
	 * Returns the value of the '<em><b>Vuelos</b></em>' containment reference list.
	 * The list contents are of type {@link ItinerarioDiagram.Vuelo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vuelos</em>' containment reference list.
	 * @see ItinerarioDiagram.ItinerarioDiagramPackage#getItinerario_Vuelos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vuelo> getVuelos();

} // Itinerario
