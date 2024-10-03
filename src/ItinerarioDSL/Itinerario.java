/**
 */
package ItinerarioDSL;

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
 *   <li>{@link ItinerarioDSL.Itinerario#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ItinerarioDSL.Itinerario#getPasajero <em>Pasajero</em>}</li>
 *   <li>{@link ItinerarioDSL.Itinerario#getVuelos <em>Vuelos</em>}</li>
 * </ul>
 *
 * @see ItinerarioDSL.ItinerarioDSLPackage#getItinerario()
 * @model
 * @generated
 */
public interface Itinerario extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getItinerario_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Itinerario#getTipo <em>Tipo</em>}' attribute.
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
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getItinerario_Pasajero()
	 * @model
	 * @generated
	 */
	Pasajero getPasajero();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Itinerario#getPasajero <em>Pasajero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pasajero</em>' reference.
	 * @see #getPasajero()
	 * @generated
	 */
	void setPasajero(Pasajero value);

	/**
	 * Returns the value of the '<em><b>Vuelos</b></em>' containment reference list.
	 * The list contents are of type {@link ItinerarioDSL.Vuelo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vuelos</em>' containment reference list.
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getItinerario_Vuelos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vuelo> getVuelos();

} // Itinerario
