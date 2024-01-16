package codigoClase2;

public class Ejercicio3 {
	//tipo, nombre, parametro de funcion//
	public static void main(String[] args) {
		
		/*convertir datos
		 * Integer de textos a numero enteros*/
		
		String txt="524";
		int numeroEntero= Integer.parseInt(txt);
		System.out.println(numeroEntero);
		
		System.out.println("*****");
		
		String txt1= "532.62";
		double numeroDouble= Double.parseDouble(txt1);
		System.out.println(numeroDouble);
		
		System.out.println("--------------");
		
		String txt2= "5362.14";
		float numeroFloat= Float.parseFloat(txt2);
		System.out.println(numeroFloat);
		
		System.out.println("--------------");
		
		int numeroDoubleToEntero=(int) numeroDouble;
		System.out.println(numeroDoubleToEntero);
		
		System.out.println("*****");
		
		/*Cualquier dato a string*/
		
		String txtNum= numeroDoubleToEntero+"";
		System.out.println(txtNum);
		
		System.out.println("*****");
		
		/*de texto a booleano*/
		/*True y false son las unicas que entiende, si lo cambiara por un numero u otra cosa seria false*/
		
		String b="true";
		boolean boleano=Boolean.parseBoolean(b);
		System.out.println(boleano);
		
		
		System.out.println("Valores max y min de los enteros");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		System.out.println("Valores max y min de los dobles");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	
		//hacer una funcion que pida dos string, que los convierta a dobles y los sume y tiene que devolver el dato resultante en formato entero//
		int x1=5;
		x1=modificar(x1);
		System.out.println("El valor de x1: "+x1);
		
		String txt4="el numero es: ";
		pasoPorReferencia(txt4);
		System.out.println("El valor de txt3"+txt);
		
		
		/*Arrays: declarrar un array de 5 posiciones vacios*/
		
		int[] arrayEnteros= new int [5];
		System.out.println(arrayEnteros[2]);
		
		int[] arrayEnteros1= {1,2,3,4};
		System.out.println(arrayEnteros1[3]);
		//asignar valor/
		arrayEnteros1[3]=1;
		System.out.println(arrayEnteros1[3]);
		System.out.println("Valor "+arrayEnteros.length);
		
		pasoPorReferenciaArray(arrayEnteros);
		System.out.println(arrayEnteros[1]+" el valor");
		

		int[] arrayEjercicio1= new int[10];
		ejercicio1(arrayEjercicio1);
		for (int i=0;i<arrayEjercicio1.length;i++) {
			System.out.println("El valor en la pocicion: "+i+" es "+arrayEjercicio1[i]);
		}
		
	}
	/*paso por valor*/
	public static int modificar(int x) {
		System.out.println("El valor de x: "+x);
		x++;
		System.out.println("El valor de x es: "+x);
		return x;
	}
	/*paso por referencia para cualquier otro valor, string(y numericos) es el unico objeto que se pasa por valor, el resto por referencia(array)*/
	public static void pasoPorReferencia(String txt5) {
		txt5+="5";
	}
	/*Almacenar datos*/
	public static void pasoPorReferenciaArray(int[]aux) {
		aux[1]=1000;
	}
	
	public static void ejercicio1(int[] posicion) {
		for(int i=0;i<posicion.length;i++) {
			posicion[i]=i;
		}
		
		int[] arrayNums= {1,2,3,8,15,50};
		int sumaInt=0;
		int i=0;
		for (i=0;i<arrayNums.length;i++) {
			sumaInt+=arrayNums[i];
		}
		System.out.println(sumaInt);
		
		/*calcular los espacios*/
		
		String txt= "Hola buenos dias me llamo andrea y he merendado una manzana";
		char espacio= ' ';
		int numEspacios=0;
		
		for(int i1=0;i1<txt.length();i1++) {
			if(txt.charAt(i1)==' ') {
				numEspacios+=1;
			}
		}
		System.out.println("el número de espacios es "+numEspacios);
		
		/*mi manera jeje*/
		int numeroPalabras= numEspacios+1;
		System.out.println("el numero de palabras es "+numeroPalabras);

	}	
	
	
		
		
}
