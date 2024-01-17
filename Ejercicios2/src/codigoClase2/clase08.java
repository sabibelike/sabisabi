package codigoClase2;

public class clase08 {
	public static void main(String[] args) {

		int[][] arrayMatriz = new int[7][4];
		rellenoAleatorio(arrayMatriz);
		for (int x = 0; x < arrayMatriz.length; x++) {
			for (int y = 0; y < arrayMatriz[0].length; y++) {
				System.out.print(arrayMatriz[x][y] + " ");
			}
			System.out.println("");
		}
		System.out.println("----");
		int[][] arrayMatriz1 = new int[6][6];
		rellenarDiagonal(arrayMatriz1);
		for (int x = 0; x < arrayMatriz1.length; x++) {
			for (int y = 0; y < arrayMatriz1[0].length; y++) {

			}
			System.out.println("");
		}

		otroEjemplo(arrayMatriz1);

	}
	//Creamos una función que pida una matriz
	public static int[][] rellenoAleatorio(int[][] matriz) {
		//crear un bucle que recorra las posiciones de x,y
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				//Darle un valor random a los espacios de la matriz entre 0 a 9
				matriz[x][y] = ((int) (Math.random() * 10));
			}
		}
		return matriz;

	}
	//Creamos una función que pida una matriz por marametro
	public static int[][] rellenarDiagonal(int[][] matriz) {
		 //Crear un bucle para recorrer todas las posiciones de x,y
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				//hacemos comprobación para darle o bien darle valor de ser x menor que y o darle valor 0 
				if (x < y) {
					matriz[x][y] = ((int) (Math.random() * 10));
				} else {
					matriz[x][y] = 0;
				}
			}
		}
		return matriz;
		//revisar el codigo del profe
	}

	public static void otroEjemplo(int[][] matriz) {
		//no sirve pa una monda
		int pos = 0;
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 1 + pos; y < matriz[0].length; y++) {
				matriz[x][y] = ((int) (Math.random() * 10));
			}
			pos++;
		}
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				System.out.print(matriz[x][y] + " ");
			}
		System.out.println();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
