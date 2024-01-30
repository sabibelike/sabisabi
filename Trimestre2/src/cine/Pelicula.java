package cine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pelicula {
	//atributos5
	private String titulo;
	private List<Genero> generos;
	private double duracion;
	private HashMap<String,Integer> horarioAsientos;
	
	//constructor
	public Pelicula(String titulo, double duracion) {
		this.titulo = titulo;
		this.generos = new ArrayList<>();
		this.duracion = duracion;
		this.horarioAsientos = new HashMap<>();
	}
	
	//motrar info
	
	//agregar el genero
	public void agregarGenero(Genero genero, String generoNuevo) {
		if (genero.equals(generoNuevo)) {
			generos.add(genero);
		}else {
			System.out.println("Vaya ese genero no existe");
		}
	}
	//agregar horarios y asientos
	
	//getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Genero> getGenero() {
		return generos;
	}

	public void setGenero(List<Genero> generos) {
		this.generos = generos;
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
