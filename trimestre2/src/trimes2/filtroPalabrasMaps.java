package trimes2;

import java.util.HashMap;
import java.util.Scanner;

public class filtroPalabrasMaps {

	public static void main(String[] args) {
		frase();
	}

	public static HashMap<String, String> groserias() {
		HashMap<String, String> groserias = new HashMap<>();
		groserias.put("puta", "****");
		groserias.put("maldita", "*******");
		groserias.put("hijoputa", "********");
		groserias.put("chinga", "*****");
		groserias.put("coño", "****");
		groserias.put("gafo", "****");
		groserias.put("pajuo", "*****");
		groserias.put("ladilla", "*******");
		return groserias;
	}

	public static void frase() {
		HashMap<String, String> groserias = groserias();
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		while (contador < 5) {
			System.out.println("Escribe una frase");
			String[] usuario = sc.nextLine().toLowerCase().split(" ");
			for (String palabra : usuario) {
				if (groserias.containsKey(palabra)) {
					System.err.println(groserias.get(palabra) + " ");
					contador++;
				} else {
					System.out.print(palabra + " ");
				}
			}
		}
		System.out.println("Por grosero ya no puedes estar aqui tontis, regulate");
	}
}
