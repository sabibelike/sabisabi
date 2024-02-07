package notas;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private ArrayList<Double> nota;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
		this.nota = new ArrayList<Double>();
	}
	public void promedio() {
		Double auxNota = 0.0;
		for (Double notas : nota) {
			auxNota+=notas;
		}
		auxNota/=nota.size();
		System.out.println("El promedio de "+nombre+" es igual a: "+auxNota);
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Double> getNota() {
		return nota;
	}

	public void setNota(ArrayList<Double> nota) {
		this.nota = nota;
	}
	
	
}
