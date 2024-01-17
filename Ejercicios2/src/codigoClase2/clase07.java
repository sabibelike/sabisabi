package codigoClase2;

public class clase07 {
	public static void main(String[] args) {
		/*NULL ES SOLO PARA OBJETOS, NO NUMEROS NI BOOLEANOS*/
		
		//String txt=null;
		String txt1="hola cara de bola"; /*tambien funciona declararlo de esta manera*/
	
		
		/* indexOf sirve para saber la primera posición y no diferencia letras mayusculas o minusculas
		 a diferencia del charAt es para mostrar el caracter*/
		String txt2="Hola buenos dias";
		System.out.println(txt2.indexOf("n"));
		
		/*Contains devuelve true o false, busca si el parámetro está dentro del texto*/
		
		System.out.println(txt2.contains("Hola b"));
		
		/*Compara 2 textos ignorando las mayusculas o minus*/
		System.out.println(txt2.equalsIgnoreCase("HOLA BUENOS DIAS"));
		System.out.println(txt2.equals("HOLA BUENOS DIAS"));

		
		/*El split separa en arrays un string por el parametro indicado */
		
		String[] arrayPalabras=txt2.split(" ");
		for (int i=0;i<arrayPalabras.length;i++) {
			System.out.println(arrayPalabras[i]);
		}
		
		/*Comprueba si el string empieza o termina por el paramtro indicado*/
		System.out.println(txt2.startsWith(" "));
		System.out.println(txt2.endsWith("días"));

		
		int[] arrayDesordenado= {5,8,4,7,9,6,3,1,2};
		ordenarNums(arrayDesordenado);                                                                                                                                
		
		 
	}
	//creamos una función que por parametro pide un array
	public static void ordenarNums(int[] array) {
		int contador=0;
		//hacemos un bucle 
		for (int j =0; j< array.length-1; j++) {
			for (int i= 0; i<array.length-1;i++) {
				contador++;
				if (array[i] > array[i +1]) {
					int contenedor =array[i];
					array[i] = array[i + 1];
					array[i+1] =contenedor;
				}
			}
		}
		System.out.println("Para odenar el array ha dado: "+contador+" vueltas");
	}
	
	//funcion que regrese si un array está ordenado o no
	public static void duplicarArray(int[]array, int numero, int posicion) {
		int[] aux = new int[array.length]; 
		if (posicion > array.length -1) {
			do {
				aux = new int[aux.length *2];
			} while (posicion>aux.length-1);
			for (int i= 0; i<array.length; i++) {
				aux[i] = array[i];
			}
			array= aux;
		 }
		array[posicion]=numero;
	}
	//creamos una función 
	public static int fibonacci (int posicion) {
		int contenedor= 1;
		int anterior=0;
		int aux= 0;
		
		for (int i= 0; i<= posicion; i++) {
			aux= contenedor;
			contenedor= contenedor + anterior;
			anterior = aux;
		}
		return contenedor;
	}
	
	public static int fibo(int pos) {
		int a= 0;
		int b= 1;
		for (int i=0; i<pos; i++) {
			int c=a;
			a=b;
			b=c+b;
		}
		return pos; 
	}
	
	
	
}
