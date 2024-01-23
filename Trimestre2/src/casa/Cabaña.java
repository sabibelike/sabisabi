package casa;

public class Cabaña extends Casa{
	private boolean chimenea;
	public Cabaña(String direccion, int numHab, double precio, boolean chimenea) {
		super(direccion, numHab, precio);
		this.chimenea = chimenea;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tiene chimenea "+chimenea);
	}
	

}
