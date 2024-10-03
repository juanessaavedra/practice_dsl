package ItinerarioDiagram;



public class Main {
    public static void main(String[] args) {
       
    	
    	ItinerarioDiagramFactory factory = ItinerarioDiagramFactory.eINSTANCE;

    	Itinerario itinerario = factory.createItinerario();

    	Pasajero pasajero = factory.createPasajero(); 
    	pasajero.setNombre("Juan Pérez");

    	itinerario.setPasajero(pasajero);

  
    	Vuelo vuelo = factory.createVuelo();
    	vuelo.setNombre("AA123");
    	vuelo.setOrigen("Madrid");
    	vuelo.setDestino("Nueva York");
    	

    	itinerario.getVuelos().add(vuelo);

    	System.out.println("Itinerario creado para el pasajero: " + pasajero.getNombre());
    	System.out.println("Vuelo: " + vuelo.getNombre() + " de " + vuelo.getOrigen() + " a " + vuelo.getDestino());

       
    }
}
