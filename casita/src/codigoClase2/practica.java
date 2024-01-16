package codigoClase2;

public class practica {
	public static void main(String[] args) {
		numeroPrimo();
		parImpar(56);
		tablaMultiplicar(5);
		kmAM(5);
		int[] array1 = { 4, 10, 1, 20 };
		int[] array = { 1, 2, 3, 4 };
		sumaArray(array);
		promedioArray(array1);
		numeroGrande(array1);
		numeroMenor(array1);
		buscar(array1, 20);
		otherWay(array1);
		
	}

	// funcion para saber cuantos numeros pares e impares hay en un parameto
	public static void parImpar(int num) {
		int contadorPar = 0;
		int contadorImpar = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}
		System.out.println(
				"La cantidad de numeros pares es: " + contadorPar + " y la cantidad de impares es: " + contadorImpar);
	}

	// funcion para saber si un numerp es primo o no
	public static void numeroPrimo() {
		int num = 158;
		if (num % 2 == 0) {
			System.out.println("El número es no es primo");
		} else {
			System.out.println("El número si es primo");
		}
	}

	// funcion para hacer una tabla de multiplicar
	public static void tablaMultiplicar(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("El número " + num + " multiplicado por " + i + " es " + num * i);
		}
	}

	// funcion para convertir km a metros
	public static void kmAM(int num) {
		int conversion = num * 1000;
		System.out.println(num + " kilometros serian: " + conversion + " metros");
	}

	// funcion para sumar los elementos de un array
	public static void sumaArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		System.out.println(suma);
	}

	// funcion para sacar el promedio de arrays
	public static void promedioArray(int[] array) {
		int suma = 0;
		double promedio = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		promedio = (suma / array.length);

		System.out.println(promedio);
	}

	// funcion para encontrar el numero mas grande
	public static void numeroGrande(int[] array) {
		int numMayor = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > numMayor) {
				numMayor = array[i];
			}
		}
		System.out.println("El numero mayor es " + numMayor);
	}

	// funcion para encontrar el numero mas pequeño
	public static void numeroMenor(int[] array) {
		int numMenor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < numMenor) {
				numMenor = array[i];
			}
		}
		System.out.println("El numero menor es " + numMenor);
	}

	// funcion para buscar un numero en un array
	public static void buscar(int[] array, int num) {
		int posicion = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				posicion = i;
				System.out.println("El numero " + num + " Se encuentra en la posicion " + i);
			}
		}
		if (posicion==-1) {
			System.out.println("No está el numero en el array");
		}
	}
	//funcion para invertir un array
	public static void otherWay(int [] array) {
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
		
	}
	
	
	
	
	
	
	
}
