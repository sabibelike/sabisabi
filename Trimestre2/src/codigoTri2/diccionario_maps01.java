package codigoTri2;

import java.util.*;

public class diccionario_maps01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hash map
		//tree map
		HashMap<Integer,String> mapa = new HashMap<>();

		//agregar al mapa
		mapa.put(500,"El valor es 500");
		mapa.put(501, "El valor es 501");
		mapa.put(501, "El valor es 502");//modifica
		mapa.put(502, null);
		
	
		System.out.println(mapa);
		System.out.println(mapa.get(500));
		System.out.println(mapa.get(1));
		System.out.println(mapa.get(502));
		
		mapa.remove(501);
		System.out.println(mapa.get(501)+"---");
		System.out.println(mapa);
		
		//como saber su una clave esta dentro del mapa
		System.out.println(mapa.containsKey(500));
		
		//mapa.isEmpty()
		System.out.println(mapa.size());
		
		for(Integer clave : mapa.keySet()) {
			System.out.println(clave+"*");
		}
		
		System.out.println("-----");
		for(String valor : mapa.values()) {
			System.out.println(valor+"***");
		}
		//devuelve
		System.out.println("-----");
		for(Integer clave : mapa.keySet()) {
			System.out.println("La clave es: "+clave+" y el valor asociado es: "+mapa.get(clave));
		}
		
		System.out.println("-----");
		mapa.forEach((clave,valor)->{
			System.out.println("La clave es: "+clave+" y el valor asociado es: "+mapa.get(clave));
		});
	}

}
