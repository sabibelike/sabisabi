package casa;

public class Atico extends Casa{
	private int numPisos;
	public Atico(String direccion, int numHab, double precio, int numPisos) {
		super(direccion, numHab, precio);
		this.numPisos = numPisos;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Número de pisos "+numPisos);
	}
}
