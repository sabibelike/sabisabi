package codigoClase2;

import java.util.Random;
import java.util.Scanner;

public class DadosTirarJeje {

	public static void main(String[] args) {
		int usuario = 0;
		Random rd = new Random();
		System.out.println("Chame, de cuantas caras quieres que sea el dado, ojito del 2 al 20");
		Scanner sc = new Scanner(System.in);
		usuario  = sc.nextInt();
		sc.nextLine();
		System.out.println("El dado ha arrojado el numero: "+rd.nextInt(1, usuario));		
	}

}
