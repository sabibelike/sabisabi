package codigoClase2;

import java.util.Random;
import java.util.Scanner;

public class ContraseñaSegura {
	public static void main(String[] args) {
		System.out.println("Bueno, una contraseña es muy importante");
		int longitudC = longitudUsuario();
		comprobar(contraseñaSegura(longitudC));

	}

	// Función para pedirle al usuario la longitud de la contraeña
	public static int longitudUsuario() {
		Scanner sc = new Scanner(System.in);
		int longitudContra = 0;
		System.out.println("Ingresa la cantidad de caracteres de tu nueva contraseña, debe ser igual o superior que 9");
		try {
			longitudContra = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			System.err.println("Es un numero, no letra, gafo");
			return longitudUsuario();
		}
		if (longitudContra < 9) {
			System.out.println("Bobis, te he dicho que sea un numero");
			return longitudUsuario();
		} else {
			return longitudContra;
		}
	}

	public static String contraseñaSegura(int longitud) {
		Random rd = new Random();
		String txt1 = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVXYZ0123456789*-+/.#%&!";
		String contraseña = "";
		for (int i = 0; i <= longitud; i++) {
			contraseña += txt1.charAt(rd.nextInt(txt1.length()));
		}
		return contraseña;
	}

	public static void comprobar(String contra) {
		int auxLetra = 0;
		int auxNum = 0;
		int auxCar = 0;
		for (int i = 0; i < contra.length(); i++) {
			if (Character.isLetter(contra.charAt(i))) {
				auxLetra++;
			}
			if (Character.isDigit(contra.charAt(i))) {
				auxNum++;
			} else {
				auxCar++;
			}
		}
		if (auxLetra >= 3 && auxNum >= 3 && auxCar >= 3){
			
			System.out.println("Tu contraseña es: " + contra);
		} else {
			comprobar(contraseñaSegura(contra.length()));
		}
	}

}
