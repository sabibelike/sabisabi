package codigoClase2;

import java.util.ArrayList;
import java.util.Scanner;

public class wordleArrayList {

	public static void main(String[] args) {
		comprobarPos();

	}

	// funcion para pedir palabra
	public static ArrayList pedirPalabra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra de 5 letras");
		String palabraUsuario = sc.nextLine();
		if (palabraUsuario.length() != 5) {
			System.out.println("Pajuo, te dije que de 5 letras");
			pedirPalabra();
		}
		char[] usuario = palabraUsuario.toCharArray();
		ArrayList<Character> listUsuarioPalabra = new ArrayList<Character>();
		for (char aux : usuario) {
			listUsuarioPalabra.add(aux);
		}
		return listUsuarioPalabra;
	}

	public static void comprobarPos() {
		System.out.println("Holis, escribe una palabra para ser adivinada");
		ArrayList palabraAdivinar = pedirPalabra();
		int vidas = 5;
		while (vidas != 0) {
			System.out.println("Escribe la palabra que quieres jugar");
			ArrayList palabraJugada = pedirPalabra();
			if (palabraJugada.equals(palabraAdivinar)) {
				System.out.println("Que bien, ganasteeee");
				return;
			}
			for (int i = 0; i < 5; i++) {
				char letraAdivinar = (char) palabraAdivinar.get(i);
				char letraJugada = (char) palabraJugada.get(i);
				
				if (letraAdivinar==letraJugada) {
					System.out.println("La letra " + letraJugada + " :1");
				} else if (palabraAdivinar.contains(letraJugada)) {
					System.out.println("La letra " + letraJugada + ": 2");
				} else {
					System.out.println("La letra " + letraJugada + ": 3");
				}
			}
			vidas--;
			System.out.println("Te quedan "+vidas+" vidas");
		}
		System.out.println("Peldiste jeje");
	}
}
