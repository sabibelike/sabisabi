package vehiculo;

public class Automovil extends Vehiculo{
	private int numeroPuertas;
	private boolean arrancar;
	public Automovil(String marca, String modelo, int añoFabricacion,
			int numeroPuertas) {
		super(marca, modelo, añoFabricacion);
		this.numeroPuertas = numeroPuertas;
		this.arrancar = false;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Numero de puertas: "+numeroPuertas);
	}
	
}
