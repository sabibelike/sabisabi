

public class PrimeraClase {

	public static void main(String[] args) {
		// Esto es un comentario
		/*
		 * Esto es un comentario de varias lineas jajaja siempre cerrar con el asterisco
		 * 
		 */
		// Declaramos una variable de tipo numero entero con signo y valor 1
		int variableTipoNumero = 1;
		// Vamos a modificar su valor por 2
		variableTipoNumero = 2;

		// Esta linea va a dar error poeque intentamos meter un decimal en una variable
		// de tipo entera
		// variableTipoNumero = 1.5;

		// Declaramos una variable de tipo decimal con valor 1.5
		// Los decimales en java deben finalizar en f
		float variableTipoDecimal = 1.5f;

		// Declaramos una variable de tipo booleano con valor verdadero
		boolean variableTipoBooleano = true;

		// Declaramos una variable de tipo caracter con valor 'a'
		// Siempre debe ir entre comilla simple
		char variableTipoCaracter = 'a';

		// Declaramos una variable de tipo String (conjunto de char, debe ir en comillas
		// dobles)
		String variableTipoString = "ddd";

		// Ejercicio 1
		// Declar tres variables de cada tipo con valores diferentes

		// Vamos a declarar variables de tipo numerico
		int variableCallesMadrid = 859;
		System.out.println(variableCallesMadrid);
		int variableMayorEdad = 18;
		int variableClasesGrado = 6;

		// Declaramos variables de tipo float
		float numeroDePi = 3.14F;
		System.out.println(numeroDePi);
		float gramosDeAzucar = 5.98F;
		float notaMinimaExamen = 4.98F;

		// Declaramos variables de tipo booleano
		boolean cabelloRojo = true;
		boolean calzadoTalla38 = true;
		boolean vivirEnBurgos = false;

		// Declaramos variable de tipo caracter
		char denominacionMoneda = '$';
		System.out.println(denominacionMoneda);
		char preguntas = '?';
		char divisaFuerte = '£';

		// Declaramos variable de tipo string

		int numero1 = 2;
		int numero2 = 15;

		int sumaTotal = 2 + 5;
		int sumaTotal1 = numero1 + numero2;
		System.out.println(sumaTotal);
		System.out.println(sumaTotal1);
		int resta = 10 - 100;
		System.out.println(resta);
		int multiplicacion = 2 * 5;
		System.out.println(multiplicacion);
		int division = 10 / 2;
		System.out.println(division);
		System.out.println("hola cara de cola");
		System.out.println(true);

		/*
		 * < menor que <= menor o igual que > mayor que >= mayor o igual que
		 */

		short numeroPequeño = 5;
		double numeroDoble = 46545454.54545484;

		int edad = 18;
		if (edad > 17) {

			System.out.print("es mayoe de edad - 1");
		}
		int años = 18;
		if (edad % 2 == 0) {
			System.out.println("Es mayor de edad y par - 2");
			if (edad > 17) {

				System.out.println("Es mayor de edad - 2");
			}
			/*
			 * && representa el si logico || representa el no logico ! representa la
			 * negacion == representa si dos cosas son iguales (en valor)
			 * 
			 * 
			 * != representa si dos elementos son diferentes
			 */
			int edadm = 19;

			if (edadm != 19) {
				System.out.println("Edad es diferente a 19");
			}

			if (edadm == 19) {
				System.out.println("Edad es igual a 19 - 6");

			} else {
				System.out.println("Edad es distinto a 19 - 7");

			}

			if (edad == 17) {
				System.out.println("Edad es 17");

			} else if (edad == 19) {
				System.out.println("edad es 19");

			}
		}
		switch (edad) {
		case 1:
			System.out.println("La edad vale 1");
			break;
		case 17:
			System.out.println("La edad vale 17");
			break;
		case 19:
			System.out.println("La edad vale 18");
			break;
		default:
			System.out.println("No se que edad tienes");
		}

		switch (edad) {
		case 17:
		case 18:
		case 19:
			System.out.println("El alumno aprueba la asignatura");
			break;
		case 20:
			System.out.println("La edad vale 20");
			break;
		default:
			System.out.println("Codigo fuera del if");

		}

		String nombreUsuario = "Andres";
		switch (nombreUsuario) {
		case "Estuche":
			System.out.println("El usuario se llama estuche");
			break;
		case "Felipe":
			System.out.println("El usuario se llama felipe");
			break;
		case "Andres":
			System.out.println("El usuario se llama Andres");
			break;
		default:
			System.out.println("Who knows");
		}
		String nombreCool = "Andrea";
		switch (nombreCool) {
		case "Carlangas":
			System.out.println("El usuario se llama Carlangas");
			break;
		case "coral":
			System.out.println("El usuario se llama coral");
			break;
		case "fulano":
			System.out.println("El usuario se llama fulano");
			break;
		case "Andrea":
			System.out.println("El usuario se llama Andrea");
			break;
		default:
			System.out.println("No se cual es tu nombre");
		}
	

	int num = 0;

	while(num!=10) {
		System.out.println("La variable vale "+num);
		num++;
	}
	// num=num+1;
	// num+=1;
	// num++;
	// las 4 formas hacen los mismo//
	// num=num+10;
	// num+=10;
	// hacer primero la pregunta
	// do while se hace despues
	// para ejecutar el codigo mientras no se cumpla la condicion o hasta que se
	// cumpla
	num=0;
	do{
		System.out.println("-La variable vale " + num);
		++num;
	}while(num!=10);

	// desde donde quiero empezar, condicion, y como llego
	for(int i = 0;i<=5;i++)
	{
		System.out.println("+la variable vale: " + i);
	}

	int num1 = 10;
	
	while(num!=20) {
		System.out.println("la variable vale "+num1);
		num++;
	}
		
	/*  */
	int suma = 0;
	num=0;
	while (num != 10) {
		suma += num;
		num++;
	}
	System.out.println(suma);
	
	
	suma=0;
	num=0;
	do {
		suma += num;
		num++;
	} while (num <= 10);
		System.out.println(suma);
		
	suma=0;
	for(int i=0; i<= 10; i++) {
		suma+=i;
	}
	System.out.println(suma);
		}
	}
	