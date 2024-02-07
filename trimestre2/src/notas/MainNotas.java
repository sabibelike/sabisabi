package notas;

public class MainNotas {

	public static void main(String[] args) {
		Curso matematica = new Curso(CursosActuales.Matematica);
		
		Estudiante estudiante1 = new Estudiante("Andrea");
		
		matematica.añadirEstudiante(estudiante1);
		matematica.añadirCalificacion(estudiante1, 10.0);
		matematica.añadirCalificacion(estudiante1, 8.0);
		
		estudiante1.promedio();
		
		matematica.notasEstudiantes();
	}

}
