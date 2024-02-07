package aerolinea;

import java.util.ArrayList;

public class Aerolinea implements Cositas{
	private String nombre;
	private ArrayList<Pasajero> pasajero;
	private ArrayList<Vuelo> vuelo;
	
	
	public Aerolinea(String nombre) {
		this.nombre = nombre;
		this.pasajero = new ArrayList<Pasajero>();
		this.vuelo = new ArrayList<Vuelo>();
	}
	
	@Override
	public void mostrarVuelos() {
		System.out.println("Los vuelos disponibles son:");
		for(Vuelo vuelosDispo : vuelo) {
			System.out.println(vuelosDispo.getOrigen()+" "+vuelosDispo.getDestino()+" "
					+vuelosDispo.getFechaHora()+" "+vuelosDispo.getAsientos().size());
		}
	}

	@Override
	public void buscarOrigen(Ciudades ciudades) {
		System.out.println("Los vuelos disponibles de esta ciudad son:");
		for(Vuelo vuelosDispo : vuelo) {
			if(vuelosDispo.getOrigen().equals(ciudades)) {
				System.out.println(vuelosDispo.getOrigen()+" "+vuelosDispo.getDestino()+" "
					+vuelosDispo.getFechaHora()+" "+vuelosDispo.getAsientos().size());
			}
		}
		
	}

	@Override
	public void buscarDestino(Ciudades ciudades) {
		System.out.println("Los vuelos disponibles a esta ciudad son:");
		for(Vuelo vuelosDispo : vuelo) {
			if(vuelosDispo.getDestino().equals(ciudades)) {
				System.out.println(vuelosDispo.getOrigen()+" "+vuelosDispo.getDestino()+" "
					+vuelosDispo.getFechaHora()+" "+vuelosDispo.getAsientos().size());
			}
		}
	}

	@Override
	public void buscarFecha(String fechaHora) {
		System.out.println("Los vuelos disponibles a esta ciudad son:");
		for(Vuelo vuelosDispo : vuelo) {
			if(vuelosDispo.getFechaHora().equals(fechaHora)) {
				System.out.println(vuelosDispo.getOrigen()+" "+vuelosDispo.getDestino()+" "
					+vuelosDispo.getFechaHora()+" "+vuelosDispo.getAsientos().size());
			}
		}
		
	}
	
	public void agregarVuelo(Vuelo vuelos) {
		vuelo.add(vuelos);
	}
	
	public void agregarPasajero(Pasajero persona) {
		pasajero.add(persona);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Pasajero> getPasajero() {
		return pasajero;
	}
	public void setPasajero(ArrayList<Pasajero> pasajero) {
		this.pasajero = pasajero;
	}
	public ArrayList<Vuelo> getVuelo() {
		return vuelo;
	}
	public void setVuelo(ArrayList<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}

	


	
	
	
	
}
