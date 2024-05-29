package animal;
import java.util.ArrayList;

public class Jugadores {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> listaJugadores = new ArrayList<ArrayList<String>>();
		agregarJugador(listaJugadores, Rango.ORO, "Luis");
		mostrarLista(listaJugadores);
	}
	
	public static void agregarJugador(ArrayList<ArrayList<String>> listaJugadores, Rango rango, String nombre) {
		ArrayList<String> jugador = new ArrayList<String>();
		jugador.add(cambiarEnum(rango));
		jugador.add(nombre);
		listaJugadores.add(jugador);
	}
	public static String cambiarEnum(Rango rango) {
		if(Rango.ORO.equals(rango)) {
			return "Oro";
		}else if(Rango.PLATA.equals(rango)) {
			return "Plata";
		}else if(Rango.BRONCE.equals(rango)) {
			return "Bronce";
		}else {
			return "Notienerango gafo";
		}
	}
	public static void mostrarLista(ArrayList<ArrayList<String>> listaJugadores) {
		//7for(ArrayList<String> jugador : listaJugadores) {
		//	System.out.println("Nombre del jugador: "+jugador.get(1)+", rango: "+jugador.get(0));
		//}
		for(int x = 0; x<listaJugadores.size(); x++) {
			System.out.println("Nombre del jugador: "+listaJugadores.get(x).get(1)+", rango: "+listaJugadores.get(x).get(0));
		}
	}
}
