package codigoClase2;


import java.util.Scanner;

public class wordle {
	public static void main(String[] args) {
		comprobarLetraPos();

	}

	public static String pedirPalabra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra de 5 letras");
		String palabraUsuario = sc.nextLine();
		if (palabraUsuario.length() != 5) {
			System.out.println("Te dije que de 5 letras");
			pedirPalabra();
		}
		return palabraUsuario;
	}

	// funcion para comprobar las letras de las posiciones
	public static void comprobarLetraPos() {
		int vida = 5;
		String palabraOculta = pedirPalabra();
		while (vida != 0) {
			String palabraJugada = pedirPalabra();
			if (palabraJugada.equals(palabraOculta)) {
				System.out.println("Enhorabuena tontis, has ganado");
				return;
			}
			for (int i = 0; i < palabraJugada.length(); i++) {
				String letraPalabraJugada = palabraJugada.charAt(i) + "";
				String letraPalabraOculta = palabraOculta.charAt(i) + "";

				if (letraPalabraOculta.equals(letraPalabraJugada)) {
					System.out.println("La letra correspondiente: " + letraPalabraJugada + ":1");
				} else if (comprobarLetraEnPalabra(palabraOculta, letraPalabraJugada)) {
					System.out.println("La letra correspondiente: " + letraPalabraJugada + ":2");
				} else {
					System.out.println("La letra correspondiente: " + letraPalabraJugada + ":3");
				}

			}
			System.out.println("-----------------------------");
			vida--;
			System.out.println("Te quedan: "+vida+" vidas");
		}
		System.out.println("Que tontito eres, perdiste juju");
	}

	public static boolean comprobarLetraEnPalabra(String palabraOculta, String letraPalabraJugada) {
		for (int x = 0; x < palabraOculta.length(); x++) {
			String letraPalabraOculta = palabraOculta.charAt(x) + "";
			if (letraPalabraOculta.equals(letraPalabraJugada)) {

				return true;
			}
		}
		return false;
	}
}