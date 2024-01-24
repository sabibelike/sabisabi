package vehiculo;

public class Motocicleta extends Vehiculo{
	private String tipoMoto;
	private int acelerar;
	public Motocicleta(String marca, String modelo, int añoFabricacion, 
			String tipoMoto) {
		super(marca, modelo, añoFabricacion);
		this.tipoMoto = tipoMoto;
		this.acelerar = 0;
	}
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tipo moto "+tipoMoto);
	}
	public void acelerar(int km) {
		if (isArrancar()) {
			acelerar += km;
			System.out.println("Ahora la velocidad es de: "+acelerar);
		} else {
			System.out.println("No está encendido");
		}
	}
}
