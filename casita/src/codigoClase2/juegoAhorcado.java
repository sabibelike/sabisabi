package codigoClase2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class juegoAhorcado {
	public static void main(String[] args) {
		ArrayList<Character> palabraRandom = palabraAleatoria();
		ArrayList<Character> espaciosOcultos = palabraOculta(palabraRandom);
		ahorcado(palabraRandom, espaciosOcultos);

	}

	// Función para escoger la palabra aleatoria
	public static ArrayList<Character> palabraAleatoria() {
		Random rd = new Random();
		ArrayList<String> palabraAhorcado = new ArrayList<String>();
		System.out.println("Hola amix, tienes que introducir 4 palabras");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 3; i++) {
			String usuario = sc.nextLine();
			palabraAhorcado.add(usuario);
		}
		String escogida = palabraAhorcado.get(rd.nextInt(1, 4));
		ArrayList<Character> palabraAJugar = new ArrayList<Character>();
		for (int i = 0; i < escogida.length(); i++) {
			palabraAJugar.add(escogida.charAt(i));
		}
		return palabraAJugar;
	}

	// funcion que regrese un arraylist del tamaño de la palabra escogida
	public static ArrayList<Character> palabraOculta(ArrayList<Character> palabraAleatoria) {
		ArrayList<Character> palabraOculta = new ArrayList<Character>();
		ArrayList<Character> palabraAdivinar = palabraAleatoria;
		for (int i = 0; i < palabraAdivinar.size(); i++) {
			palabraOculta.add('_');
		}
		return palabraOculta;
	}

	// funcion para pedir una letra al usuario, que se muestre el array list las que
	// se hayan acertado y se guarden las ya usadas :)
	public static void ahorcado(ArrayList<Character> palabraAleatoria, ArrayList<Character> palabraOculta) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> palabraAdivinar = palabraAleatoria;

		System.out.println("Estos son los espacios de tu palabra oculta" + "\n" + palabraOculta);
		int vida = 10;
		while (vida != 0) {
			System.out.println("Introduce una letra");
			String letraJugada = sc.nextLine();
			char jugada = letraJugada.charAt(0);

			for (int i = 0; i < palabraAleatoria.size(); i++) {
				char letraPalabra = palabraAleatoria.get(i);
				if (letraPalabra == jugada) {
					palabraOculta.set(i, jugada);
				}
			}
			System.out.println(palabraOculta);
			vida--;
			System.out.println("Te quedan "+vida+" vidas");
			
			if (palabraAdivinar.equals(palabraOculta)) {
				System.out.println("Enhorabuena, haz ganado");
				return;
			}
		}
		System.out.println("AHORCADOOOOOOOOOOOO");
	}
}
