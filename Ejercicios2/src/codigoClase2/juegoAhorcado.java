package codigoClase2;

import java.util.ArrayList;
import java.util.Scanner;

public class juegoAhorcado {
	public static void main(String[] args) {
		
		palabraOculta();
		
	}
	//Función para escoger la palabra aleatoria
	public static String palabraAleatoria () {
		ArrayList<String> palabraAhorcado = new ArrayList<String>();
		System.out.println("Hola amix, tienes que introducir 4 palabras");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<=3; i++) {	
			String usuario = sc.nextLine();
			palabraAhorcado.add(usuario);
		}
		//Código hecho por el profe SUPONDREMOS QUE ESTÁ bien
		String palabraEscogida=palabraAhorcado.get((int)(Math.random()*4));
		return palabraEscogida;
	}
	//funcion que regrese un arraylist del tamaño de la palabra escogida
	public static ArrayList<Character> palabraOculta() {
		ArrayList <Character> palabraOculta = new ArrayList <Character>();
		String txt = palabraAleatoria();
		for (int i=0; i<=txt.length(); i++) {
			palabraOculta.add('_'); 
		}
		System.out.println(palabraOculta);
		return palabraOculta;
	}
	
	//funcion para pedir una letra al usuario, que se muestre el array list las que se hayan acertado y se guarden las ya usadas :)
	public static void darLetra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta tu letra");
		 
	}
	
	
}
