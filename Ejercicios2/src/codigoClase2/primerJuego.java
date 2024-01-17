package codigoClase2;

import java.util.Scanner;

public class primerJuego {
	public static void main(String[] args) {
		int numSecreto= (int)(Math.random()*100);
		int contador=0;
		numJugador();
		while (true) {
			int numABuscar=numJugador();
			if(numABuscar>numSecreto) {
			System.out.println("El número secreto es mayor que el número oculto");
			}else if (numABuscar<numJugador()) {
			System.out.println("El numero secrero es menor que tu número");
			}else {
				System.out.println("Si, has ganado, el número secreto era: "+numSecreto+ " Has tardado "+contador);
				break;
			}
			contador++;
		}
	}
	//Función para pedirle un numero al jugador y coger sus excepciones
	public static int numJugador() {
		Scanner sc= new Scanner(System.in);
		int jugador=0;
		System.out.println("Inserta un numero entre el 1 al 99");
		try {
			jugador= sc.nextInt();
		} catch (Exception e) {
			//El usuario ha introducido cualquier cosa menos un número entero
			System.out.println("Estas cometiendo un error"+e);
			return numJugador();
		}
		if (jugador<0 || jugador>99) {
			System.out.println("El numero introducido está fuera de rango");
			return numJugador();
		}
		return jugador;
	}
}
