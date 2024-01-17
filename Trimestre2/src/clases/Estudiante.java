package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Estudiante {
	// atributos
	private String nombre;
	private int edad;
	private List<String> listaCursos;
	private HashMap<String, List<Double>> calificaciones;

	// constructores
	public Estudiante(String nombre, int edad, List<String> listaCursos, HashMap<String, List<Double>> calificaciones) {
		this.nombre = nombre;
		this.edad = edad;
		this.listaCursos = listaCursos;
		this.calificaciones = calificaciones;
	}

	// metodos
	public void agregarCurso(String nuevoCurso) {
		listaCursos.add(nuevoCurso);
		calificaciones.put(nuevoCurso, new ArrayList<>());
	}

	public void agregarCalificacion(String curso, Double calificacion) {
		if (calificaciones.containsKey(curso)) {
			calificaciones.get(curso).add(calificacion);
		} else {
			System.out.println("El estudiante no está incrito en el curso " + curso);
		}
	}

	public double promedio() {
		int cantidadCursos = listaCursos.size();
		double totalCalificaciones = 0;
		for (List<Double> calificacionesCurso : calificaciones.values()) {
			for (Double calificacion : calificacionesCurso) {
				totalCalificaciones += calificacion;
			}
		}
		if (cantidadCursos > 0) {
			return totalCalificaciones / cantidadCursos;
		} else {
			return 0.0;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
