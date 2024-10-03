/**
 */
package ItinerarioDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pasajero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioDSL.Pasajero#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ItinerarioDSL.Pasajero#getItinerarios <em>Itinerarios</em>}</li>
 * </ul>
 *
 * @see ItinerarioDSL.ItinerarioDSLPackage#getPasajero()
 * @model
 * @generated
 */
public interface Pasajero extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getPasajero_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Pasajero#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Itinerarios</b></em>' reference list.
	 * The list contents are of type {@link ItinerarioDSL.Itinerario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itinerarios</em>' reference list.
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getPasajero_Itinerarios()
	 * @model
	 * @generated
	 */
	EList<Itinerario> getItinerarios();

} // Pasajero
