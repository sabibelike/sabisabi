package clases;

public class Coche {

	// defino las propiedades de la clase
	public String marca;
	public String modelo;
	public int anoFabricacion;
	public String color;
	public double velocidadActual;
	public boolean encendido;
	public double consumoXKm;

	// defino constructor
	public Coche(String marca, String modelo, int anoFabricacion, String color, double consumoXKm) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacion = anoFabricacion;
		this.color = color;
		this.velocidadActual = 0.0;
		this.encendido = false;
		this.consumoXKm = consumoXKm;
	}

	// metodos
	public void encenderMotor() {
		this.encendido = true;
		System.out.println("El coche está encendido");
	}

	public void apagarMotor() {
		this.encendido = false;
		System.out.println("El coche ha sido apagado");
	}

	public void acelerar(double acelerarKmH) {
		if (encendido) {
			this.velocidadActual = acelerarKmH;
			System.out.println("Se ha incrementado la velocidad");
		} else {
			System.out.println("No está encendido bobo");
		}
	}

	public void frenar(double frenarKmH) {
		if (encendido && velocidadActual > frenarKmH) {
			this.velocidadActual = frenarKmH;
			System.out.println("Se ha frenado");
		} else if (velocidadActual < frenarKmH) {
			this.velocidadActual = 0;
		} else {
			System.out.println("Esta apagado bobito");
		}
	}

	public double calcularConsumo(double distancia) {
		double litrosConsumidos = consumoXKm / distancia;
		return litrosConsumidos;
	}

	public String mostrarInfo() {
		return ("La marca del coche es " + marca + ", el modelo es " + modelo + ", el año de fabricación es "
				+ anoFabricacion + ", y el color es " + color);
	}
}
