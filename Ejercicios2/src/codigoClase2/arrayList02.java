package codigoClase2;

import java.util.ArrayList;

public class arrayList02 {
	public static void main(String[] args) {
		//creamos un arraylist de tipo entero
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(4);
		lista.add(90);
		lista.add(89);
		lista.add(100);
		lista.add(7);
		lista.add(45);
		lista.add(1080);
		lista.add(74);
		lista.add(43);
		
		System.out.println(lista);
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Numero en la posicion "+i+" es: "+lista.get(i));
		}
		
		System.out.println("-------------------------------------------");
		int pos=0;
		for (int aux: lista) {
			System.out.println("Numero en la posicion "+pos+" es "+aux);
			pos++;
		}
		//luego hacerlo con un scanner
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(45);
		lista1.add(90);
		lista1.add(8);
		lista1.add(1007);
		lista1.add(79);
		lista1.add(45);
		lista1.add(100);
		lista1.add(4);
		lista1.add(50);

		borrarNumero(lista1,4);
		System.out.println(lista1);
		
	}
	//funcion para borrar un numero de la lista que ha sido pasado por parametro
	public static void borrarNumero(ArrayList<Integer> lista, int numero) {
		while (lista.indexOf(numero) != -1) {
			lista.remove(lista.indexOf(numero));
		}
	}
	//funcion para borrar uno de los numeros repetidos
	public static void borrarRepetido(ArrayList<Integer> lista, int numero) {
		if (lista.indexOf(numero) != lista.lastIndexOf(numero)) {
			while(true) {
				if (lista.contains(numero)) {
					lista.remove(lista.indexOf(numero));
				} else {
					break;
				}
			}
		}
	}
	
	public static void borrarTodosRepetidos(ArrayList<Integer> lista) {
		int max = lista.get(0);
		int min = lista.get(0);
		
		for (int aux: lista) {
			if (aux > max) {
				max = aux;
			}
			if (aux < min) {
				min = aux;
			}
		}
		for (int i=min; i<=max; i++) {
			if (lista.indexOf(i)!=lista.lastIndexOf(i)){
				while (true) {
					if (lista.contains(i)) {
						lista.remove(lista.indexOf(i));
					}else {
						break;
					}
				}
			}
		}
	}
	
	
	
}
