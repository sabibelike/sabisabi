package animal;
import java.util.ArrayList;
import java.util.Random;

public class BarcosHundidos {
	
	public static void main(String[] args) {
	
		ArrayList<ArrayList<String>> tablero = new ArrayList<ArrayList<String>>();
		tablero = generarTablero();
		mostrarTablero(tablero);
		while(true) {
			disparar(tablero);
			if(comprobarGanador(tablero)) {
				break;
			}
		}
	}
	public static ArrayList<ArrayList<String>> generarTablero() {
		Random rd = new Random();
		ArrayList<ArrayList<String>> tablero = new ArrayList<ArrayList<String>>();
		for (int i =0; i<5; i++) {
			ArrayList<String> fila = new ArrayList<String>();
			for (int j =0; j<5; j++) {
				fila.add("-");
			}
				tablero.add(fila);
		}
		
		for (int x = 0; x<5; x++) {
			int posX = rd.nextInt(5);
			int posY = rd.nextInt(5);
			ArrayList<String> filaX = tablero.get(posX);
			if (filaX.get(posY)=="-") {
				filaX.set(posY, "X");
			}else {
				x--;
				continue;
			}
		}
		for (int x = 0; x<5; x++) {
			int posX = rd.nextInt(5);
			int posY = rd.nextInt(5);
			ArrayList<String> filaX = tablero.get(posX);
			if (filaX.get(posY)=="-") {
				filaX.set(posY, "Y");
			}else {
				x--;
				continue;
			}
		}
		return tablero;
	}
	public static void mostrarTablero(ArrayList<ArrayList<String>> tablero){
		for (int x =0; x<tablero.size(); x++) {
			System.out.println(tablero.get(x));
		}
		System.out.println();
	}
	
	public static void disparar(ArrayList<ArrayList<String>> tablero) {
		Random rd = new Random();
		int posX = rd.nextInt(5);
		int posY = rd.nextInt(5);
		ArrayList<String> filaX = tablero.get(posX);
		if(filaX.get(posY)=="X" || filaX.get(posY)=="Y") {
			filaX.set(posY, "=");	
		}
		mostrarTablero(tablero);
	}
	
	public static boolean comprobarGanador(ArrayList<ArrayList<String>> tablero) {
		int contadorX = 5;
		int contadorY = 5;
		for(int x = 0; x<tablero.size(); x++) {
			for(int y = 0; y<tablero.get(x).size(); y++) {
				if(tablero.get(x).get(y)=="X") {
					contadorX--;
				}else if(tablero.get(x).get(y)=="Y") {
					contadorY--;
				}
			}
		}
		if(contadorX == 5){
			System.out.println("El equipo X ha ganado");
			return true;
		}else if(contadorY == 5) {
			System.out.println("El equipo Y ha ganado");
			return true;
		}
		return false;
	}
	
}
