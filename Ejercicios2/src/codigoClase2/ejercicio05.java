package codigoClase2;

public class ejercicio05 {
	public static void main(String[] args) {
		/* las clases son un conjunto de funcionalidades que nos dicen cosas */

		System.out.println("El valor de PI es: " + Math.PI);
		System.out.println("El valor de E: " + Math.E);
		System.out.println("El valor absoluto de -15 es: " + Math.abs(-15));
		System.out.println("La raiz cuadrada de 25 es: "
				+ (int) +Math.sqrt(25));/* le podemos agregar int oara tratarlo comno un entero */
		System.out.println("Para elevar un numero a un exponente: " + Math.pow(10, 3));
		System.out.println("Para calcular el seno de un angulo en radianes: " + Math.sin(45));
		System.out.println("Para calcular el coseno de un angulo en radianes: " + Math.cos(90));
		System.out.println("Para calcular el tangente de un angulo en radianes: " + Math.tan(36));

		/* La que mas se usa :), da un numero random del 0 al 1(casi) */
		System.out.println(Math.random());

		System.out.println(numAleatorio());
		hipotenusa(25, 52);

		int[] arrayEjercicio = { 58, 26, 48, 1020, 5, 3 };
		numArray(arrayEjercicio);
		
	}

	public static int numAleatorio() {
		return (int)(Math.random()*100)+1;
	}

	public static double hipotenusa(double catetoA, double catetoB) {
		/*double hipotenusa = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
		System.out.println("La hipotenusa es: " + Math.sqrt(hipotenusa));*/
		return Math.hypot(catetoA, catetoB);
	}

	public static void numArray(int[] array1) {
		int num = 0;
		for (int i6 = 0; i6 < array1.length; i6++) {
			int maximo = Math.max(num, array1[i6]);
			num = maximo;
			
			/*min=Math.min(min,array1[i])
			 *max=Math.max(max,array1[i]) 
			 *
			 *imprimir cada uno, esta es otra opcion */
		}
		System.out.println(num);
		int num2 = num;
		for (int i7 = 0; i7 < array1.length; i7++) {
			int minimo = Math.min(num2, array1[i7]);
			num2 = minimo;
		}
		System.out.println(num2);
	}
	public static double log10(double num) {
		return Math.log10(num);
		
	}
	public static double logE(double num) {
		return Math.log(num);
	}
	
	public static double anguloVectores(double[] vector1, double[] vector2) {
		double productoEscalar= vector1[0]*vector2[0]+vector1[1]*vector2[1];
		double modulo1=Math.sqrt(Math.pow(vector1[0], 2)+Math.pow(vector1[1], 2));
		double modulo2=Math.sqrt(Math.pow(vector2[0], 2)+Math.pow(vector2[1], 2));
		double resultado= Math.toDegrees(Math.acos(productoEscalar/modulo1*modulo2));
		return resultado;
	}
	
	public static double interesCompuesto(double p, double r, double n, int t) {
		return p*Math.pow((1+r/n) ,n* t);
	}
	
	
	
	
	

}
