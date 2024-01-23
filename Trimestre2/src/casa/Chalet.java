package casa;

public class Chalet extends Casa{
	private int tamJardin;
	public Chalet(String direccion, int numHab, double precio, int tamJardin) {
		super(direccion, numHab, precio);
		this.tamJardin = tamJardin;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println(tamJardin);
	}
	public void mostrarPiscina() {
		System.out.println("Tiene piscina");
	}

}
