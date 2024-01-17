package codigoClase2;

public class Ejercicios01 {

	public static void main(String[] args) {
		// Java es una escritura orientado a objetos

		String txt = "Hola Bebesita Uah";

		System.out.println(txt.charAt(6));
		char caracter = txt.charAt(10);
		System.out.println(caracter);
		System.out.println("El numero de caracteres del string es: " + txt.length());

		/* el length te regresa el numero de caracteres que tiene un string */
		String txt1 = "aaaaaaaaaaaaaaajkhbsdjhasbdjahsbdasssssssssssssjahsbdjahsbdj";
		System.out.println("El numero de caracteres del string es: " + txt1.length());

		/* Este subestring va desde donde le digas hasta el final */
		System.out.println(txt.substring(5));

		/* este va desde donde quiero hasta donde quiero que termine */
		System.out.println(txt.substring(5, 13));

		/* mayus y minusculas */

		String txtMayusculas = txt.toUpperCase();
		System.out.println(txtMayusculas);

		String txtMinuscula = txtMayusculas.toLowerCase();
		System.out.println(txtMinuscula);

		/*
		 * Reemplazo de caracteres y ademas puedes volver a usar el stings para mayus y
		 * minus. Ademas que para el texto con " y para caracter '
		 */

		String txtReemplazado = txt1.replace('a', 'z');
		System.out.println(txtReemplazado);
		System.out.println(txt.replace(' ', '1').toUpperCase());
		System.out.println(txt.replace("Hola", "Adios").toUpperCase());

		/* Esta funcion le quita los espacios de principio y del final */
		String txt2 = "   Ho  la   ";
		System.out.println("'" + txt2.trim() + "'");

		/*
		 * esta forma es solo para comparar los caracteres, no esta bien de esta manera
		 */

		String txt3 = "Hola";
		String txt4 = "Hola";

		if (txt3 == txt4) {
			System.out.println("Los string son iguales");
		} else {
			System.out.println("Los string son diferentes");
		}

		/* Forma correcta de comparar dos string */

		if (txt3.equals(txt4)) {
			System.out.println("Los strings son iguales");
		} else {
			System.out.println("+Los strings son diferentes");
		}

		/* Hacia adelante */
		for (int i1 = 0; i1 < txt.length(); i1++) {
			System.out.println(txt.charAt(i1));
		}

		/* hacia atras */
		System.out.println("------");
		for (int i2 = txt.length() - 1; i2 > -1; i2--) {
			System.out.println(txt.charAt(i2));

		}

		/**/
		System.out.println("*******");
		for (int i3 = 0; i3 < txt.length(); i3 = i3 + 2) {
			System.out.println(txt.charAt(i3));
		}
		
		System.out.println("---------");
		/*letras pares*/
		for (int i4=0;i4<txt.length();i4++) {
			
			if(i4 % 2 == 0) {
				System.out.println(txt.charAt(i4));
			}
		}
			
		saludar();
		
		
	}
	
	/*funciones de declaracion, las funciones no pueden ir juntas, deben estar separadas de la public class*/
	
	public static void saludar() {
		System.out.println("Saludos");
		
		int i=0;
		System.out.println("El valor de i es: "+ i);
		
		i++;
		System.out.println("El valor de i es: "+ 1);
		
		for (int i1 = 0; i1 !=10;i1++) {
			System.out.println("Saludos");
		}
		
		
		/* Declaramos una funcion para cada uno de los tipos de datos
		 * 
		 * int, long, dobles, chars, string
		 * 
		 * en cada una de las funciones tengo que declarar el tipo de dato correspondiente y modificar la variable
		 * 
		 * en el main tengo que llamar a todos esas funciones
		 * modificad el orden de llamada
		 * probad a usar estructuras de control para llemar a las funciones en condiciones que querais*/
		
	}
	
	/*Declaramos funciones*/
	
	
	
}
