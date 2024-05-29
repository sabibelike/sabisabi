package animal;
import java.util.Scanner;
import java.util.Random;

public class examenBingo {
    public static void main(String[] args) {
        do {        	
        	jugarBingo();
        }while(continuar()); 
    }
    
    
    public static void jugarBingo() {
        int[][] cartonJugador1 = generarCarton();
        int[][] cartonJugador2 = generarCarton();

        System.out.println("Cartón del Jugador 1:");
        imprimirCarton(cartonJugador1);

        System.out.println("\nCartón del Jugador 2:");
        imprimirCarton(cartonJugador2);

        int[] bombo = generarBombo();

        System.out.println("\nComienza el juego de Bingo:");
        jugarBingo(cartonJugador1, cartonJugador2, bombo);
    }
    public static int[] generarBombo() {
        int[] bombo = new int[20];
        for (int i = 0; i < 20; i++) {
            bombo[i] = i + 1;
        }
        return bombo;
    }
    public static void imprimirCarton(int[][] carton) {
        for (int x = 0; x < carton.length; x++) {
            for (int y = 0; y < carton[x].length; y++) {
                System.out.print(carton[x][y] + "  ");
            }
            System.out.println();
        }
    }
    
    public static boolean contieneNumero(int[][] carton, int numero) {
    	for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == numero) {
					carton[x][y] = 0;
					return true;
				}
			}
		}
		return false;
    }
    
    // Esta función solicita al usuario si desea continuar
    //jugando y devuelve true si la respuesta es "S" (Sí) o false si es "N" (No).
	public static boolean continuar() {
		Scanner sc = new Scanner(System.in); 
		String usuario = sc.nextLine().toUpperCase();
		if (usuario.equals("N")) {
			return false;
		}else {
			return true;
		}
	}

    // Esta función genera un cartón de Bingo aleatorio de 2x5, 
    // llenando cada celda con números únicos entre 1 y 20.
    // tiene que haber la misma cantidad de número 1-10 que 11-20
    public static int[][] generarCarton() {
    	Random rd = new Random();
        int [][] carton;
        carton = new int [2][5];
        while(true) {
	        int numero1 = rd.nextInt(10)+1;
	        int numero2 = rd.nextInt(10)+11;
	        for (int i = 0; i < 5; i++) {
	        	if(carton[0][i] == 0) {
	        		carton[0][i] = numero1;
	        		break;
	        	}else if(carton[0][i] == numero1) {
	        		break;
	        	}
	        }
	        for (int i = 0; i < 5; i++) {
	        	if(carton[1][i] == 0) {
	        		carton[1][i] = numero2;
	        		break;
	        	}else if(carton[1][i] == numero2) {
	        		break;
	        	}
	        }
	        if (carton[0][4]==0 || carton[1][4] ==0) {
	        	continue;
	        }else {
	        	break;
	        }
        }
        return carton;
    }

   

    // Esta función simula el juego de Bingo, 
    //extrayendo números del bombo y verificando si 
    //algún jugador ha completado su cartón.
    public static void jugarBingo(int[][] cartonJugador1, int[][] cartonJugador2, int[] bombo) {
    	Random rd = new Random();
    	while (true) {
    		int numeroBombo = rd.nextInt(20);
    		if (bombo[numeroBombo] != 0) {
    			contieneNumero(cartonJugador1, bombo[numeroBombo]);
    			contieneNumero(cartonJugador2, bombo[numeroBombo]);
    		}else {
    			continue;
    		}
    		if (esCartonCompleto(cartonJugador1)) {
    			System.out.println("El jugador 1 ha ganado");
    			break;
    		}else if(esCartonCompleto(cartonJugador2)) {
    			System.out.println("El jugador 2 ha ganado");
    			break;
    		}else {
    			continue;
    		}
    	}
    }

    //Esta función verifica si un número 
    //dado ha sido marcado en el cartón (reemplazado por 0),
    //lo que indica que el cartón está completo. 
    //Retorna true si el cartón está completo, de lo contrario, retorna false.
    //public static boolean completoCarton(int[][] carton, int numero) {
    //	return str.mmgvmarico


    // Función para verificar si un cartón está completo.
    // Si todo el carton es 0 estará completo
    public static boolean esCartonCompleto(int[][] carton) {
    	for (int x= 0; x <carton.length; x++) {
    		for (int y = 0; y<carton[x].length; y++) {
    			if(carton[x][y]!=0) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}







