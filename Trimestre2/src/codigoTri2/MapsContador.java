package codigoTri2;

import java.util.*;

public class MapsContador {

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<>();
		
		String txt = "Hola hola hola cara de cola cola , amo tu cola cola hermosa , porque hermosa eres tu tambien";
		
		String[] arrayTxt = txt.toLowerCase().split(" ");

		for (int i = 0; i < arrayTxt.length; i++) {
			if (arrayTxt[i].length() <= 3) {
				arrayTxt[i] = null;
			}
		}
		for (String palabra : arrayTxt) {
			if (palabra == null) {

			} else {
				if (mapa.containsKey(palabra)) {
					mapa.put(palabra, mapa.get(palabra) + 1);
				} else {
					mapa.put(palabra, 1);
				}
			}
		}
		System.out.println(mapa);
		int contador= 0;
		String palabraRepetida="";
		for (String clave: mapa.keySet()) {
			int aux = mapa.get(clave);
			if (contador < aux) {
				contador = aux;
				palabraRepetida = clave;
			}
		}
		System.out.println("La palabra más repetida es: "+palabraRepetida+" "+contador+" veces");
	}
}
