package codigoClase2;

public class ejericio06 {
	public static void main(String[] args) {
		
		int i=0;
		while (i<10) {
			if (i==5) {
				break;
			}
			System.out.println("El valolr de i es: "+i);
			i++;
		}
		
		i =0;
		do {
			if(i==5) {
				break;
			}
			System.out.println("el valor es: "+i);
			i++;
		}while (i<10);
		
		for (i=0;i<10;i++) {
			if (i==5) {
				break;
			}
			System.out.println("valor i: "+i);
		}
	}
	
	public static int calcularIntentos(int valorBuscado) {
		int intentos=0;
		while(true) {
			if(Math.random()==valorBuscado) {
				break;
			}
			intentos++;
		}
		return intentos;
	}
	public static int numAleatorio() {
		return (int)(Math.random()*100)+1;

	}
	
	/*Crea una función que pida un array de String y un String como 2º parametro
	 * Devuelve el array que contenga SOLO los elementos del 1º array que sean diferentes al String del parámetro*/
	
	public static void compararArray(String[] txt, String txt2) {
		
		
	}
	
	
	/*Crea una función que pida un array del tipo que quieras y un 2º parámetro del mismo tipo(no array).
	 * Dime cuantos valores del 2º parámetro hay en el array*/
	
	/*Crea una función que pida un array de números decimales. Calculame la media de los valores del array*/
	
	
	
	
	
	
	
	
	
	
	
}
