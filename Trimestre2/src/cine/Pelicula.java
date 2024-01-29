package cine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pelicula {
	//atributos
	private String titulo;
	private List<String> genero;
	private double duracion;
	private HashMap<String,Integer> horarioAsientos;
	
	//constructor
	public Pelicula(String titulo, List<String> genero, double duracion, HashMap<String,Integer> horarioAsientos) {
		this.titulo = titulo;
		this.genero = new ArrayList<>();
		this.duracion = duracion;
		this.setHorarioAsientos(new HashMap<>());
	}
	//mostrarinfo
	//getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getGenero() {
		return genero;
	}

	public void setGenero(List<String> genero) {
		this.genero = genero;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public HashMap<String,Integer> getHorarioAsientos() {
		return horarioAsientos;
	}

	public void setHorarioAsientos(HashMap<String,Integer> horarioAsientos) {
		this.horarioAsientos = horarioAsientos;
	}

	 

	
	
	
	
}
