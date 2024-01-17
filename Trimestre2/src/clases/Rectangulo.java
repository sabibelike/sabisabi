package clases;

public class Rectangulo {
	//atributos
	private double longitud;
	private double ancho;
	
	//constructor
	public Rectangulo (double longitud, double ancho) {
		this.longitud = longitud;
		this.ancho = ancho;
	}
	
	//metodos
	public double calcularArea () {
		return longitud*ancho;
	}
	
	public double calcularPerimetro() {
		return 2*longitud+2*ancho;
	}
	
	//getters and setters
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
}
