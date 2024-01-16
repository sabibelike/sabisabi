package codigoClase2;

import java.util.Scanner;

public class juego2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				Scanner sc = new Scanner(System.in);

				//Creamos 2 variables la primera para generar un número del 1 al 3 y la otra para guardar el texto ("piedra","papel"o"tijera")



				

				//En este if veremos que número eligio el Math.random y le asignaremos a cada valor una mano (1 = piedra), (2 = papel) y (3 = tijera) 

				

				System.out.println("Vamos a Jugar al piedra, Papel o Tijeras!");

				int eleccion = ElegirContricante() ;

				

				

				String Manocontricante="";

				String ManoUsuario="";

				if (eleccion == 1) {

					Manocontricante= GenerarManoOrdenador();

					System.out.println("El ordenador elige:" +Manocontricante);

					System.out.println("Jugador Local:");

					ManoUsuario = Pedirusuario();

				} else {

					System.out.println("Jugador Local:");

					ManoUsuario = Pedirusuario();

					System.out.println("Jugador Contricante:");

					Manocontricante = Pedirusuario();

				}

				

				Partida(Manocontricante, ManoUsuario);

				

			}

			

			//En esta función pedimos al usuario que nos escriba la palabra "Piedra", "Papel" o "Tijeras" para jugar contra el Ordenador

			public static String Pedirusuario() {

				Scanner sc = new Scanner(System.in);

				System.out.print("Introduce (Piedra), (Papel) o (Tijera):");

				String txt1 = sc.nextLine();

				//Convertimos el texto en minuscula para que nos de igual si el usuario escribio en Mayusculas o minusculas

				txt1=txt1.toLowerCase();

				

				//Aqui devolvemos el texto unicamente si es "piedra","papel"o"tijera"

				if (txt1.equals("piedra") || txt1.equals("papel") || txt1.equals("tijera")) {

					return txt1;

				}else {

					System.err.println("Escribiste mal algunas de las opciones...");

					return Pedirusuario();

				}

				

			}

			public static String GenerarManoOrdenador() {

				int NumOrdenador = (int)(Math.random()*3+1);

				String ManoOrdenador = "";

				

				if (NumOrdenador == 1) {

					ManoOrdenador = "piedra";

					return ManoOrdenador;

				} else if (NumOrdenador == 2) {

					ManoOrdenador = "papel";

					return ManoOrdenador;

				} else {

					ManoOrdenador = "tijera";

					return ManoOrdenador;

				}

			}

			public static int ElegirContricante() {

				System.out.println("Elige si quieres jugar contra el Ordenador o contra un amigo:");

				System.out.println("Escribe (1) si quieres vs EL ORDENADOR");

				System.out.println("Escribe (2) si quieres vs UN AMIGO");

				Scanner sc = new Scanner(System.in);

				String txt1 = sc.nextLine();

				

				if (txt1.equals("1") || txt1.equals("2")) {

					int eleccion = Integer.parseInt(txt1);

					return eleccion;

				}else {

					System.err.println("Escribe 1 o 2 IDIOTA");

					return ElegirContricante();

				}

				

			}

			

			public static void Partida(String Manocontricante, String ManoUsuario) {

				if (Manocontricante.equals(ManoUsuario)) {

					System.out.println("Tenemos un Empate!: tu has sacado "+ManoUsuario+" y el contricante saco "+Manocontricante);

				} else if ((Manocontricante.equals("piedra") && ManoUsuario.equals("papel")) || (Manocontricante.equals("papel") && ManoUsuario.equals("tijera")) || (Manocontricante.equals("tijera") && ManoUsuario.equals("piedra"))) {

					System.out.println("Has Ganado!: tu has sacado "+ManoUsuario+" y el contricante saco "+Manocontricante);

				}else {

					System.out.println("Has Perdido!: tu has sacado "+ManoUsuario+" y el contricante saco "+Manocontricante);

				}

			}

	}


