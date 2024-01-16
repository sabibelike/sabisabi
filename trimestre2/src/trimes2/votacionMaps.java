package trimes2;

import java.util.*;

public class votacionMaps {

	public static void main(String[] args) {

	}
	public static void pedirVoto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A quien quieres votas?");
		String usuario = sc.nextLine().toUpperCase();
		
	}
	public static HashMap<String,Integer> candidatos () {
		HashMap<String,Integer> candidatos = new HashMap<>();
		candidatos.put("JOSE", 0);
		candidatos.put("FAREK", 0);
		candidatos.put("YULIANA", 0);
		candidatos.put("JULANGEL", 0);
		candidatos.put("ANDREA", 0);
		return candidatos;
	}
}
