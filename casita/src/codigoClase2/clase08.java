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

	public static int[][] rellenoAleatorio(int[][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				matriz[x][y] = ((int) (Math.random() * 10));
			}
		}
		return matriz;

	}

	public static int[][] rellenarDiagonal(int[][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				if (x < y) {
					matriz[x][y] = ((int) (Math.random() * 10));
				} else {
					matriz[x][y] = 0;
				}
			}
		}
		return matriz;
	}

	public static void otroEjemplo(int[][] matriz) {
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
	
	public static void crearMatrizDiagonal(int [][]matriz) {
		for (int x=0; x<matriz.length; x++) {
			for (int y=x+1; y <matriz[0].length;y++) {
				matriz[x][y]=(int)(Math.random()*10);
			}
		}
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y<matriz[0].length; y++) {
				System.out.println(matriz[x][y]+" ");
			}
			System.out.println();
		}
	}
	
	//función para sumar array
	public static int sumarArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	

	
}
