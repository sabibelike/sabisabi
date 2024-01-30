package cine;

import java.util.ArrayList;

public class Cine {
	//atributos4
	private String nombre;
	private String ubicacion;
	private double precioBoleto;
	private ArrayList<Pelicula> cartelera;

	//constructor
	public Cine(String nombre, String ubicacion, double precioBoleto) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.precioBoleto = precioBoleto;
		this.cartelera = new ArrayList<>();
	}
	
	//agregar pelicula a la cartelera
	public void agregarPelicula(Pelicula pelicula) {
		cartelera.add(pelicula);
	}
	//mostrar cartelera
	public void mostrarCartelera() {
		for (Pelicula pelicula : cartelera) {
			System.out.println(pelicula.getTitulo());
		}
	}
	
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getPrecioBoleto() {
		return precioBoleto;
	}

	public void setPrecioBoleto(double precioBoleto) {
		this.precioBoleto = precioBoleto;
	}
	
	public ArrayList<Pelicula> getCartelera() {
		return cartelera;
	}

	public void setCartelera(ArrayList<Pelicula> cartelera) {
		this.cartelera = cartelera;
	}
}
