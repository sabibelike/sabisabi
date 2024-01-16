package codigoClase2;

import java.util.Scanner;

public class clase010_scanner {
	public static void main(String[] args) {
		//
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un número entero");
		float num= sc.nextFloat();
		System.out.println("El numero introducido es: "+num);
		//Es necesario el nextLine para captar el enter dejado por el numero 
		// que hace falta leerlo
		sc.nextLine();
		System.out.println("Introduce un texto");
		String txt1= sc.nextLine();
		System.out.println("El texto introducido es: "+txt1);
		
	}
}
