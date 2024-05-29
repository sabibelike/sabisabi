package animal;

import java.lang.reflect.Array;
import java.util.Random;

public class CapturarBandera {

	public static void main(String[] args) {
		String[][] tablero = generarTablero();
		int equipoAzul = 0;
		int equipoRojo = 0;
		
		while(true) {
			equipoAzul= captura(tablero, equipoAzul);
			mostrarTablero(tablero);
			if(comprobarTablero(tablero)) {
				break;
			}
			equipoRojo= captura(tablero, equipoRojo);
			mostrarTablero(tablero);
			if(comprobarTablero(tablero)) {
				break;
			}
		}
		if(equipoAzul > equipoRojo) {
			System.out.println("Equipo azul ha ganado");
		}else {
			System.out.println("Equipo rojo ha ganado");
		}
		System.out.println("El equipo azul ha capturado: "+equipoAzul+" banderas");
		System.out.println("El equipo rojo ha capturado: "+equipoRojo+" banderas");
	}

	public static String[][] generarTablero() {
		String[][] tablero = new String[5][5];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = "_";
			}
		}
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			int x = rd.nextInt(5);
			int y = rd.nextInt(5);
			if (tablero[x][y] == "_") {
				tablero[x][y] = "B";
			} else {
				i--;
			}
		}
		return tablero;
	}

	public static void mostrarTablero(String[][] tablero) {
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int captura(String[][] tablero, int jugador) {
		Random rd = new Random();
		int posX = rd.nextInt(5);
		int posY = rd.nextInt(5);
		if(tablero[posX][posY]=="B") {
			jugador++;
			tablero[posX][posY]="_";
		}
		return jugador;
	}

	public static boolean comprobarTablero(String[][] tablero) {
		for(int x = 0; x<tablero.length; x++) {
			for(int y = 0; y<tablero[x].length; y++) {
				if(tablero[x][y]=="B") {
					return false;
				}
			}
		}
		return true;
	}
}
