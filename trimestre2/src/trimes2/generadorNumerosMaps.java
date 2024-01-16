package trimes2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class generadorNumerosMaps {
	
	public static void main(String[] args) {
		HashMap<Integer,ArrayList<Integer>> numerosAleatorios = new HashMap<>();
		Random rd = new Random();
		
		for (int i = 0; i<=10000; i++) {
			int numero = rd.nextInt(1,10);
			if (numerosAleatorios.containsKey(numero)) {
				ArrayList arrayList = numerosAleatorios.get(numero);
				arrayList.add(numero);
			} else {
				ArrayList arrayList = new ArrayList();
				arrayList.add(numero);
				numerosAleatorios.put(numero, arrayList);
			}
		}
		for (int numero : numerosAleatorios.keySet()) {
			System.out.println("El numero "+numero+" se ha repetido: "+numerosAleatorios.get(numero).size());
		}
	}
}
