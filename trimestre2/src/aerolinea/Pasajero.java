package aerolinea;

import java.util.ArrayList;

public class Pasajero {
	private String nombre;
	private ArrayList<String> asientos;
	
	public Pasajero(String nombre) {
		this.nombre = nombre;
		this.asientos = new ArrayList<String>();
	}
	
	public void comprarAsiento(Vuelo vuelo) {
		if(vuelo.seleccionar()!=null) {
			asientos.add(vuelo.seleccionar());
		}else {
			System.out.println("No hay asientos loquis");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<String> asientos) {
		this.asientos = asientos;
	}
	
	
	
}
