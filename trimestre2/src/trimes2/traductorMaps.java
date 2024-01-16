package trimes2;

import java.util.*;

public class traductorMaps {

	public static void main(String[] args) {
		traduccion();

	}

	public static HashMap<String, String> diccionario() {
		HashMap<String, String> traductor = new HashMap<>();
		traductor.put("hola", "hello");
		traductor.put("buenos", "good");
		traductor.put("que", "what");
		traductor.put("listo", "ready");
		traductor.put("amor", "love");
		traductor.put("dias", "morning");
		traductor.put("sol", "sun");
		traductor.put("atardecir", "sunset");
		traductor.put("nube", "clouds");
		traductor.put("lluvia", "rain");
		return traductor;
	}

	public static void traduccion() {
		HashMap<String, String> traductor = diccionario();
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cúal palabra quieres traducir?");
		
		String[] usuario = sc.nextLine().toLowerCase().split(" ");
		
		for (String palabra : usuario) {
			if (traductor.containsKey(palabra)) {
				System.out.print(traductor.get(palabra)+" ");
			}else {
				System.err.println(palabra);
			}
		}

	}
}
