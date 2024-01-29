package cine;

public class Cine {
	//atributos
	private String nombre;
	private String ubicacion;
	private double precioBoleto;
	
	//constructor
	public Cine(String nombre, String ubicacion, double precioBoleto) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.precioBoleto = precioBoleto;
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getPrecioBoleto() {
		return precioBoleto;
	}

	public void setPrecioBoleto(double precioBoleto) {
		this.precioBoleto = precioBoleto;
	}
	
	
}
