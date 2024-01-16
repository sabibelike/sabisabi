package codigoClase2;

public class ejercicio2 {

	public static void main(String[] args) {

		/*Declaramos funciones*/
		enteros();
		decimal();
		caracter();
		dobles();
		Saluditos();
	
		
		String txt = "Hola Bebesita Uah";
		String txt1= "Chiquis";
		String txt2= "Grandis";
		System.out.println(txt.charAt(6));
		char caracter = txt.charAt(10);
		System.out.println(caracter);
		Saluditos();

		
		/*Para poder hacer hacer el return hay que recoger la funcion*/
		System.out.println( areaRectangulo(5, 15));
		int rectanguloArea= areaRectangulo(5, 15);
		rectanguloArea++;
		System.out.println(rectanguloArea);
		System.out.println(numero());
		System.out.println("********");
		
		/*aqui recogi la funcion y le di un nombre para ser usada*/
		char caracterCool= primerCaracter(txt); 
		System.out.println(caracterCool);
		
		
		/*Use la funcion de comparar textos*/
		System.out.println("------");
		System.out.println(textosIguales(txt1, txt2));
	
	}

	public static void enteros() {
		int i = 5;
		System.out.println(i);
	}
	
	public static void decimal() {
		float i2 = 2.5f;
		System.out.println(i2);
	}
	
	public static void caracter() {
		char i3 ='$';
		System.out.println(i3);
	}
	
	public static void dobles() {
		double i4 = 665.6545;
		System.out.println(i4);
	}
	
	public static void Saluditos() {
		String i5 = "Hola cara de bola";
		System.out.println(i5);
	}
	/*parametros de funcion*/
	public static void decirNombre(String nombre, int edad) {
		System.out.println("Hola buenos dias: "+nombre+ "y tengo: "+edad+" años");
	}
	/*si no es llamada no se ejecuta*/
	public static void areaCuadrado(int lado) {
		System.out.println("El area del cuadrado es: "+lado*lado);
	}
	
	public static int areaRectangulo(int base, int altura) {
		return base*altura;
	}
	public static int numero() {
		return areaRectangulo(5, 15);
	}
	
	public static char primerCaracter(String txt) {
		char caracter1 = txt.charAt(0);
		System.out.println("El primer caracter es: "+caracter1); /*no hace falta imprimmirlo aqui*/
		return caracter1;
		/*char txt.charAt(0)*/
	}
	
	public static boolean numeroPar(int numeroAComprobar) {
		return numeroAComprobar%2==0;
		/*if(numeroAComprobar%2==0) {
			return true
			else return false
			*/
		
		}
	
	public static boolean textosIguales(String txt1, String txt2) {
		return txt1.equals(txt2);
	}
	
	public static char caracterEnPosicion(String txt, int posicion) {
		if(txt.length()-1>posicion) {
			return txt.charAt(posicion);
		}
		else { return '0';
			
		}
	}
	
	public static double convertirCelsiusToFarenheid(double tempCelsius) {
		return (tempCelsius*9/5)+32;
		}
	
	/*enunciado de funciones basicas en java para practicar*/
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

