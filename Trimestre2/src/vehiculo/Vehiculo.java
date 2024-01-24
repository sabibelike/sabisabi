package vehiculo;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int añoFabricacion;
	private boolean arrancar;
	
	public Vehiculo(String marca, String modelo, int añoFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.setArrancar(false);
	}
	
	public void mostrarInfo() {
		System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\n"
				+ "Año fabricación: "+añoFabricacion);
	}
	public boolean arrancar() {
		System.out.println("Ha sido arrancado "+true);
		return setArrancar(true);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public boolean isArrancar() {
		return arrancar;
	}

	public boolean setArrancar(boolean arrancar) {
		this.arrancar = arrancar;
		return arrancar;
	}
	
	
	
}
