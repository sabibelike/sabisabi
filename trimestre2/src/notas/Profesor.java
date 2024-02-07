package notas;

import java.util.ArrayList;

public class Profesor {
	private String nombre;
	private ArrayList<Curso> curso;
	
	public Profesor(String nombre) {
		this.nombre = nombre;
		this.curso = new ArrayList<Curso>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Curso> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<Curso> curso) {
		this.curso = curso;
	}
	
	
}
