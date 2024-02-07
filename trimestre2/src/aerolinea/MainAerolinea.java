package aerolinea;

public class MainAerolinea {
	public static void main(String[] args) {
		Aerolinea aerolinea = new Aerolinea("Sabilines");
		
		Vuelo vuelo1 = new Vuelo("5", "03", Ciudades.Caracas, Ciudades.Lisboa);
		Vuelo vuelo2 = new Vuelo("5", "02", Ciudades.Lisboa, Ciudades.Madrid);
		Vuelo vuelo3 = new Vuelo("5", "01", Ciudades.Madrid, Ciudades.Lisboa);
		Vuelo vuelo4 = new Vuelo("5", "03", Ciudades.Madrid, Ciudades.Caracas);
		
		
		vuelo1.agregarAsientos(5);
		vuelo2.agregarAsientos(5);
		vuelo3.agregarAsientos(5);
		vuelo4.agregarAsientos(5);
		
		Pasajero pasajero1 = new Pasajero("Andrea");
		Pasajero pasajero2 = new Pasajero("Luis");
		Pasajero pasajero3 = new Pasajero("Mami");
		
		aerolinea.agregarVuelo(vuelo1);
		aerolinea.agregarVuelo(vuelo2);
		aerolinea.agregarVuelo(vuelo3);
		aerolinea.agregarVuelo(vuelo4);
		
		aerolinea.agregarPasajero(pasajero1);
		aerolinea.agregarPasajero(pasajero2);
		aerolinea.agregarPasajero(pasajero3);
		
		aerolinea.mostrarVuelos();
		aerolinea.buscarOrigen(Ciudades.Caracas);
		
		
		pasajero1.comprarAsiento(vuelo4);
		System.out.println(pasajero1.getAsientos());
		
		
		
		
		
		
		
		
		
		
		
	}
}
