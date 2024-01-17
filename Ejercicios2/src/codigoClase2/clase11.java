package codigoClase2;

public class clase11 {
	public static void main(String[] args) {

		// ECAvanzada: if else sin llaves solo ejecuta la primera linea

		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-----");
		// de esta forma recorremos el array solo del principio al final, no al reves
		// accediendo a los valores del array, y no a sus posiciones
		for (int aux : array) {
			System.out.println(aux);
		}

		// para hacerlo con un string habria que cambiarlo primero a un array
		String txt = "Hola Buenos dias";
		for (char t : txt.toCharArray()) {
			System.out.println(t);
		}
		System.out.println("--------");

		// es una pregunta como un if else pero mas sencilla, de forma lineal, tiene su
		// parte true y false
		int x = 4;
		String resultado = (x % 2 == 0) ? "Es par" : "Es impar";
		System.out.println(resultado);

		System.out.println("--------");

		// como anidar dos preguntas, por ejemplo si es par o impar y si es menor o
		// mayor a 5
		String resultado1 = (x % 2 == 0) ? (x < 5) ? "Es par y menor que 5" : "Es par y mayor de 5" : "Es impar";
		System.out.println(resultado1);
		System.out.println("--------");

		// ejercicio para ver si una array puedo usar el for it
		int[][] array1 = new int[6][6];
		for (int aux: array) {
			for (int aux1 : array) {
				// Darle un valor random a los espacios de la matriz entre 0 a 9
				array1[aux][aux1] = ((int) (Math.random() * 10));
			}
		}
		

	}
}
