package actividadAula;

import java.util.Scanner;

public class AEA2T1_DalNieto_AndreaSabina {
	public static void main(String[] args) {
		do {
			jugarBingo();
		} while (continuar());
	}

	public static void jugarBingo() {
		int[][] cartonJugador1 = generarCarton();
		int[][] cartonJugador2 = generarCarton();

		System.out.println("Cartón del Jugador 1:");
		imprimirCarton(cartonJugador1);

		System.out.println("\nCartón del Jugador 2:");
		imprimirCarton(cartonJugador2);

		int[] bombo = generarBombo();

		System.out.println("\nComienza el juego de Bingo:");
		jugarBingo(cartonJugador1, cartonJugador2, bombo);
	}

	public static int[] generarBombo() {
		int[] bombo = new int[20];
		for (int i = 0; i < 20; i++) {
			bombo[i] = i + 1;
		}
		return bombo;
	}

	public static void imprimirCarton(int[][] carton) {
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				System.out.print(carton[x][y] + "  ");
			}
			System.out.println();
		}
	}

	public static boolean contieneNumero(int[][] carton, int numero) {
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == numero) {
					return true;
				}
			}
		}
		return false;
	}

	// Esta función solicita al usuario si desea continuar
	// jugando y devuelve true si la respuesta es "S" (Sí) o false si es "N" (No).
	public static boolean continuar() {
		// creamos un scanner para que el usuario pueda ingresar si quiere seguir o no
		// jugando
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Quieres volver a jugar? Presiona 'S'(SI) o 'N'(NO)");
		sc.nextLine();
		if (sc.equals('S')) {
			return true;
		}
		if (sc.equals('N'));
		return false;
	}

	// Esta función genera un cartón de Bingo aleatorio de 2x5,
	// llenando cada celda con números únicos entre 1 y 20.
	// tiene que haber la misma cantidad de número 1-10 que 11-20
	public static int[][] generarCarton() {
		//declaramos parametros del array y recorremos sus posiciones para darles valor
		int[][] cartonBingo = new int[2][5];
		for (int x = 0; x < cartonBingo.length; x++) {
			for (int y = 0; y < cartonBingo[x].length; y++) {
			}
		}

		return cartonBingo;
	}

	// Esta función simula el juego de Bingo,
	// extrayendo números del bombo y verificando si
	// algún jugador ha completado su cartón.
	public static void jugarBingo(int[][] cartonJugador1, int[][] cartonJugador2, int[] bombo) {
		// A GENERAR!!!
	}

	// Esta función verifica si un número
	// dado ha sido marcado en el cartón (reemplazado por 0),
	// lo que indica que el cartón está completo.
	// Retorna true si el cartón está completo, de lo contrario, retorna false.
	public static boolean completoCarton(int[][] carton, int numero) {
		// recorremos todas las posiciones del array, si la posicion es igual al numero
		// pasa a tener valor cero y si todas las posiciones son igual a 0, return true
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == numero) {
					numero = 0;
				}
				if (carton[x][y] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	// Función para verificar si un cartón está completo.
	// Si todo el carton es 0 estará completo
	public static boolean esCartonCompleto(int[][] carton) {
		// recorremos todas las posiciones del array para verificar si cada una es igual
		// a 0
		for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == 0) {
					return true;
				}
			}
		}
		return false;
	}

}
