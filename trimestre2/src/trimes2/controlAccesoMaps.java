package trimes2;

import java.util.*;

public class controlAccesoMaps {

	public static void main(String[] args) {
		turnoActivo();
	}

	public static HashMap<String, Boolean> empleados() {
		HashMap<String, Boolean> turnos = new HashMap<>();

		turnos.put("AB789", false);
		turnos.put("SD7T5", false);
		turnos.put("RT564", false);
		turnos.put("BF567", false);
		turnos.put("NJ890", false);
		turnos.put("XC535", false);
		turnos.put("JK786", false);
		turnos.put("GH123", false);
		turnos.put("MJ456", false);
		turnos.put("FG456", false);
		turnos.put("AF450", false);

		return turnos;
	}

	public static HashMap<String, Boolean> turnoActivo() {
		HashMap<String, Boolean> turnoActual = empleados();
		Scanner sc = new Scanner(System.in);
		int capacidadMaxima = 2;
		int activosAhora = 0;
		while (capacidadMaxima <= 2 ) {
			System.out.println("Ingresa tu clave de acceso");
			String empleado = sc.nextLine().toUpperCase();
			if (turnoActual.containsKey(empleado)) {
				turnoActual.put(empleado, true);
				System.out.println("Tu turno ha empezado");
				activosAhora++;
			} else {
				System.out.println("Gafo, pusiste mal tu clave de acceso");
			}
			System.out.println("Hay " + activosAhora + " empleados trabajando en este momento");
			capacidadMaxima--;
		}
		System.out.println("Epa, vas a tener que pagar extras, ya estamos a maxima capacidad jeje");
		return turnoActual;
	}
}
