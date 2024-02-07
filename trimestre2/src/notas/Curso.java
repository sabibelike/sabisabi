package notas;

import java.util.ArrayList;
import java.util.HashMap;

public class Curso implements AñadirNota {
	private CursosActuales cursos;
	private HashMap<Estudiante, ArrayList<Double>> notaEstudiante;
	
	public Curso(CursosActuales cursos) {
		this.cursos = cursos;
		this.notaEstudiante = new HashMap<Estudiante, ArrayList<Double>>();
	}
	
	public void añadirEstudiante(Estudiante estudiante) {
		notaEstudiante.put(estudiante, new ArrayList<Double>());
	}
	
	@Override
	public void añadirCalificacion(Estudiante estudiante, Double nota) {
		ArrayList<Double> notasEstudiante = notaEstudiante.get(estudiante);
		notasEstudiante.add(nota);
		notaEstudiante.put(estudiante, notasEstudiante);
		
		notasEstudiante = estudiante.getNota();
		notasEstudiante.add(nota);
		estudiante.setNota(notasEstudiante);
		
	}
	
	public void notasEstudiantes() {
		for (Estudiante estudiante : notaEstudiante.keySet()) {
			System.out.println("Las notas del estudiante "+estudiante.getNombre()
					+" son:");
			for(ArrayList<Double> nota : notaEstudiante.values()) {
				System.out.println(nota);
			}
		}
	}

	public HashMap<Estudiante, ArrayList<Double>> getEstudiante() {
		return notaEstudiante;
	}

	public void setEstudiante(HashMap<Estudiante, ArrayList<Double>> estudiante) {
		this.notaEstudiante = estudiante;
	}

	public CursosActuales getCursos() {
		return cursos;
	}

	public void setCursos(CursosActuales cursos) {
		this.cursos = cursos;
	}

	
	
}
