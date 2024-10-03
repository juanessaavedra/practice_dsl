/**
 */
package ItinerarioDSL;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vuelo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioDSL.Vuelo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ItinerarioDSL.Vuelo#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ItinerarioDSL.Vuelo#getDestino <em>Destino</em>}</li>
 *   <li>{@link ItinerarioDSL.Vuelo#getSalida <em>Salida</em>}</li>
 *   <li>{@link ItinerarioDSL.Vuelo#getLlegada <em>Llegada</em>}</li>
 * </ul>
 *
 * @see ItinerarioDSL.ItinerarioDSLPackage#getVuelo()
 * @model
 * @generated
 */
public interface Vuelo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getVuelo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Vuelo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' attribute.
	 * @see #setOrigen(String)
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getVuelo_Origen()
	 * @model
	 * @generated
	 */
	String getOrigen();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Vuelo#getOrigen <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' attribute.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(String value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' attribute.
	 * @see #setDestino(String)
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getVuelo_Destino()
	 * @model
	 * @generated
	 */
	String getDestino();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Vuelo#getDestino <em>Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' attribute.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(String value);

	/**
	 * Returns the value of the '<em><b>Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salida</em>' attribute.
	 * @see #setSalida(Date)
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getVuelo_Salida()
	 * @model
	 * @generated
	 */
	Date getSalida();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Vuelo#getSalida <em>Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salida</em>' attribute.
	 * @see #getSalida()
	 * @generated
	 */
	void setSalida(Date value);

	/**
	 * Returns the value of the '<em><b>Llegada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Llegada</em>' attribute.
	 * @see #setLlegada(Date)
	 * @see ItinerarioDSL.ItinerarioDSLPackage#getVuelo_Llegada()
	 * @model
	 * @generated
	 */
	Date getLlegada();

	/**
	 * Sets the value of the '{@link ItinerarioDSL.Vuelo#getLlegada <em>Llegada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Llegada</em>' attribute.
	 * @see #getLlegada()
	 * @generated
	 */
	void setLlegada(Date value);

} // Vuelo
