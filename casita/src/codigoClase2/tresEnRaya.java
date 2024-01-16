package codigoClase2;

public class tresEnRaya {
	public static void main(String[] args) {
		
	}
	//crear uuna funcion para saber si se ha logrado ganar 
	public static boolean ganado(int[][] matriz) {
		//ganar por filas
		if(matriz[0][0]==-1 && matriz [0][1]== -1 && matriz [0][2]== -1) {
			System.out.println("Gana jugador 1");
			return true;
		}
		if(matriz[1][0]==-1 && matriz [1][1]== -1 && matriz [1][2]== -1) {
			System.out.println("Gana jugador 1");
			return true;
		}
		if(matriz[2][0]==-1 && matriz [2][1]== -1 && matriz [2][2]== -1) {
			System.out.println("Gana jugador 1");
			return true;
		}
		//ganar por columnas
		if(matriz [0][0]==-1 && matriz [1][0]==-1 && matriz [2][0]==-1 ) {
			System.out.println("Gana jugador 1");	
			return true;		
		}
		if(matriz [0][1]==-1 && matriz [1][1]==-1 && matriz [2][1]==-1 ) {
			System.out.println("Gana jugador 1");	
			return true;		
		}
		if(matriz [0][2]==-1 && matriz [1][2]==-1 && matriz [2][2]==-1 ) {
			System.out.println("Gana jugador 1");	
			return true;		
		}
		//ganar por diagonales
		if (matriz [0][0]==-1 && matriz [1][1]==-1 && matriz [2][2]==-1 ) {
			System.out.println("gana jugador 1");
		}
		if (matriz [0][2]==-1 && matriz [1][1]==-1 && matriz [2][0]==-1 ) {
			System.out.println("gana jugador 1");
		}
		return false;
	}
	//funcion para mostrar la matriz
	public static int mostrarMatriz(int [][]matriz) {
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz.length; y++) {
				System.out.print(matriz[x][y]+" ");
				System.out.println(" ");
			}
		}
		return mostrarMatriz(matriz);
	}
}
