package actividadAula;

public class AEA1T1_DalNieto_AndreaSabina {
	public static void main(String[] args) {
		/*Llamada la función para clasificar edades*/
		clasificacionEdad(0);
		tablaMultiplicar(5);
		sumaNum3();
		contadorVocales("esta es la cadena de texto");
		
		
	/*Busqueda de errores ejercicio 6
	 * En la linea #2 no puede estar repetido el nombre de la clase "main"
	 * En la linea #8 se debe cambiar el nombre de la variable de doble a entero
	 * En la linea #9 se debe cerrar correctamente con parentesis el System.out
	 * En la linea #15 solo haria falta borrar uno de los signos de =
	 * En la linea #18 la funcion double se debe cambiar a entero
	 * En la linea #22 deben estar declaradas ambas variable correctamente  */	
	
		
	}
	/*Ejercicio 5*/
	public static void clasificacionEdad(int edad) {
		if (edad<=12) {
			System.out.println("La edad corresponde a niño");
		}else if (edad>=13 && edad<18) {
			System.out.println("La edad corresponde a un adoslescente");
		}else if (edad>=18 && edad<=40) {
			System.out.println("La edad corresponde a un adulto joven");
		}else if (edad>=40 && edad<=110) {
			System.out.println("La edad corresponde a un adulto mayor");
		}else {
			System.out.println("No se a que etapa corresponde tu edad");
		}
	}
	
	public static void tablaMultiplicar(int num) {
		for (int x =1; x<=10;x++) {
			System.out.println("El numero "+num+" por "+x+ "es "+num*x);
		}
	}
	
	
	
	public static void sumaNum3() {
		int suma=0;
		for (int i=3; i<100; i+=10) {
			suma+=i;
			System.out.println(suma);
		}
	}
	
	public static void divisores48() {
		for(int i=0; i<48;i++) {
			if(48%i==0) {
				System.out.println("El numero "+i+" es divisor de 48");
			}
		}
	}
	
	
	public static void contadorVocales(String txt) {
		int contador=0;
		for (int i=0; i<txt.length();i++) {
			char c= txt.charAt(i);
			if(c== 'a'||c== 'e'||c== 'i'||c== 'o'||c== 'u') {
				contador++;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
