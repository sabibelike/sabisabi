package codigoClase2;

import java.util.Scanner;

public class piedra_papel_tijera {
	public static void main(String[] args) {
		
	}
	
	
	
	public static String jugadaUsuario() {
		Scanner sc= new Scanner(System.in);
		String jugador="";
		System.out.println("1, 2, 3, piedra, papel o tijera");
		try {
			jugador= sc.next();
		} catch (Exception e) {
			System.out.println("Has hecho algo mal, intenta mejor escogiendo piedra, papel o tijera");
			return jugadaUsuario();
		}
		return jugador;
	}
	
	//public static String reglas() {
	//	String[] player = {"Tijera", "Piedra", "Papel"};
	//	String[] ordenador = {"Tijera", "Piedra", "Papel"};
	//		if(player[0]==ordenador[0]) {
	//			System.out.println("Empate");
			
		}
		



