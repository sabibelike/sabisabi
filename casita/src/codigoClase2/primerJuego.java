package codigoClase2;

import java.util.Scanner;

public class primerJuego {
	public static void main(String[] args) {
		//Generar un número aleatorio del 1 al 100 y el usuario tiene que adivinarlo
		
		//Declaro variables para un número de intentos, un numero pedido por el usuario, un scanner y el numero a adivinar del 1 al 100
		
		int jugar=1;
		int num1=0;
		
		Scanner sc = new Scanner(System.in);
		
		// un bucle para jugar por primera vez y ya que despues se le pregunta si desea volver a jugar que se repita, en caso de que si (1) 
		
		while (jugar==1) {
			int numAdivinar = (int)(Math.random()*100+1);
			
			int intentos=0;
			
			intentarAdivinar(num1, numAdivinar, intentos);
			
			jugar=volverAJugar();
		}
		//Fin del programa
		
		System.out.println("Adios");
	}
	
	
	
	//crear una funcion para iniciar el juego
	public static int volverAJugar () {
		Scanner sc = new Scanner(System.in);
		
		int jugar=1;
		
		while (true) {
			System.out.println("¿Quieres volver a jugar?");
			
			System.out.println("Presiona (1) si quieres volver a jugar");
			
			System.out.println("Si no introduce cualquier número");
		
			try {
				jugar = sc.nextInt();
			} catch (Exception e) {
				System.err.println("No has introducido ningun número");
				
				sc.nextLine();
				
				continue;
			}
			
			break;
		}
		return jugar;
	}
	
	//Condicional para dar la pista si el numero es mayor, menor, si ha adivinado o si el numero esta fuera de rango
	
	public static void adivinanza (int num1, int numAdivinar, int intentos) {
		if (num1 >= 0 && num1 <= 100) {
			if (num1 > numAdivinar) {
				System.out.println("El número es menor que el introducido");
			} else if (num1 < numAdivinar) {
				System.out.println("El número es mayor al introducido");
			} else if (num1 == numAdivinar) {
				System.out.println("Es correcto el número");
				
				System.out.println("Felicidades! Adivinaste el número");
			}
		} else {
			System.out.println("El numero introducido esta fuera de rango");
		}
	}
	
	public static void intentarAdivinar (int num1, int numAdivinar, int intentos) {
		Scanner sc = new Scanner (System.in);
		
		while (num1 != numAdivinar) {
			//pedimos el número al usuario y sumamos 1 intento
			
			System.out.println("Adivina el número! Introdue un número del 1 al 100");
			
			System.out.println(numAdivinar);
			
			intentos++;
			
			//metemos una condicional en donde terminaremos el bucle en caso de que el usuario lo intente 100 veces y no lo logre
			
			if (intentos == 100) {
				System.out.println("No has podido adivinar el número secreto");
			
				break;
			}
			
			//un try para evitar crashear el programa cuando el usuario coloque otra cosa que no sea una un número
			
			try {
				num1 = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Has introducido algo que no es un número");
				
				sc.nextLine();
				
				continue;
			}
			
			adivinanza(num1, numAdivinar, intentos);
		}
	}
	
	
	
	
	
	
}
