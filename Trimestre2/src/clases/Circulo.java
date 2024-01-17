package clases;

public class Circulo {
	
	//atributo
	private double radio;
	
	//constructor
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		return Math.PI * radio*radio;
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	//getters and setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
