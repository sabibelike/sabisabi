package cartas;
import java.util.ArrayList;
import java.util.List;
 
public class BarajaCartas {
	// atributos
	private List<Carta> baraja1;
	private List<Carta> baraja2;
 
	// constructor
	public BarajaCartas() {
		baraja1 = new ArrayList<Carta>();
		String[] palos = { "espadas", "oros", "bastos", "copas" };
		int[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		for (String palo : palos) {
			for (int valor : valores) {
				baraja1.add(new Carta(palo, valor));
			}
		}
		baraja2 = new ArrayList<Carta>();
		for (String palo : palos) {
			for (int valor : valores) {
				baraja1.add(new Carta(palo, valor));
			}
		}
	}
 
	public List<Carta> getBaraja1() {
		return baraja1;
	}
	
	public List<Carta> getBaraja2() {
		return baraja2;
	}
	// clase privada chiquitita
	private class Carta {
		//atributos
		private int valor;
		private String palo;
		
		//constructor
		public Carta(String palo, int valor) {
			this.valor = valor;
			this.palo = palo;
		}
 
		public String toString() {
			return "Palo: " + this.palo + " -- Valor:" + this.valor;
		}
	}
    
	public static void main(String[] args) {
		BarajaCartas baraja1 = new BarajaCartas();
 
		// Mostramos todas las cartas de la baraja
		for (Carta carta : baraja1.getBaraja1()) {
			System.out.println(carta);
		}
		BarajaCartas baraja2 = new BarajaCartas();
 
		// Mostramos todas las cartas de la baraja
		for (Carta carta : baraja2.getBaraja2()) {
			//System.out.println(carta);
		}
		System.out.println(baraja1.hashCode());
		System.out.println(baraja2.hashCode());
		
		System.out.println(baraja1.equals(baraja2));
		System.out.println(baraja1.equals(baraja1));
	}
}
