package codigoClase2;

import java.util.Random;
import java.util.Scanner;

public class clase12 {
	public static void main(String[] args) {
		//Clase llamada random, nos proporciona un entero, decimal, etc con las funciones, nos permite coger un rango determinado de numeros aleatorios		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int usuario = sc.nextInt();
		System.out.println(rd.nextInt());		
		System.out.println(rd.nextInt(0,usuario));		
		System.out.println(rd.nextBoolean());		
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextDouble(2,6));
		System.out.println(rd.nextExponential());
		System.out.println(rd.nextGaussian());		
	}
	
	

}
