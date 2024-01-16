package codigoClase2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListCalculadora {
	public static void main(String[] args) {
		ArrayList<Integer> tabla = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido, empecemos a calcular!!");
		String usuario1 = null;
		boolean salir = true;
		while (salir) {
			System.out.println("Tienes varias opciones jejeje \nAgregar \nCalcular \nMostrar \nSalir");
			String usuario = sc.nextLine().toUpperCase();
			switch (usuario) {
			case "AGREGAR":
				agregarNum(sc, tabla);
				break;
			case "CALCULAR":
				System.out.println(
						"Okis, ahora escoge entre sumar(+), restar (-), multiplicar (*), dividir(/) o elevar(^)");
				usuario1 = sc.nextLine();
				switch (usuario1) {
				case "/":
					division(sc, tabla);
					break;
				case "^":
					exponente(sc, tabla);
					break;
				case "*":
					multiplicacion(sc, tabla);
					break;
				case "-":
					resta(sc, tabla);
					break;
				case "+":
					suma(sc, tabla);
					break;
				default:
				}
				break;
			case "MOSTRAR":
				if (tabla.isEmpty()) {
					System.out.println("La tabla está vacia bobis :P");
				} else {
				mostrarTabla(tabla);
				}
				break;
			case "SALIR":
				salir = false;
				break;
			}
		}
		System.out.println("Chais amigui \ngus nai");

	}

	public static void agregarNum(Scanner sc, List<Integer> tabla) {
		System.out.println("Escribe el número que quieras agregar");
		int usuario = 0;
		try {
			usuario = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			sc.nextLine();
			System.err.println("Tontis, es un numero UwU");
			agregarNum(sc,tabla);
			return;
		}
		tabla.add(usuario);
		System.out.println("¡Añadido!");
		System.out.println(tabla);
	}

	public static void mostrarTabla(List<Integer> tabla) {
		System.out.println("----------");
		System.out.println("Los números en la lista son:");
		System.out.println(tabla);
	}

	public static void suma(Scanner sc, ArrayList<Integer> tabla) {
		int aux = 0;
		for (int i = 0; i < tabla.size(); i++) {
			aux += tabla.get(i);
		}
		System.out.println("La suma de toda la lista es igual a: " + aux);

	}

	public static void resta(Scanner sc, ArrayList<Integer> tabla) {
		long aux2 = tabla.get(0);
		for (int i = 1; i < tabla.size(); i++) {
			aux2 -= tabla.get(i);
		}
		System.out.println("La resta de toda la lista es igual a: " + aux2);
	}

	public static void multiplicacion(Scanner sc, ArrayList<Integer> tabla) {
		long aux1 = tabla.get(0);
		for (int i = 1; i < tabla.size(); i++) {
			aux1 *= tabla.get(i);
		}
		System.out.println("La multiplicación de todos los elementos de la lista es igual a: " + aux1);

	}

	public static void division(Scanner sc, ArrayList<Integer> tabla) {
		if (tabla.contains(0)) {
			System.out
					.println("Amigui no es posible hacer la division, porque la tabla contiene un cero :'( try again");
			return;
		}
		float aux3 = tabla.get(0);
		for (int i = 1; i < tabla.size(); i++) {
			aux3 /= tabla.get(i);
		}
		System.out.println("La división de todos los elementos de la lista es igual a: " + aux3);
	}

	public static void exponente(Scanner sc, ArrayList<Integer> tabla) {
		long aux4 = tabla.get(0);
		for (int i = 1; i < tabla.size(); i++) {
			aux4 = (long) Math.pow(aux4, tabla.get(i));
		}
		System.out.println("El resultado de la operacion es: " + aux4);
	}

}
