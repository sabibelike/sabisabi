package cine;

public class Reserva {
	//atributos
	private Pelicula pelicula;
	private int cantidadReservada;
	
	//constructor
	public Reserva(Pelicula pelicula, int cantidadReservada) {
		this.pelicula = pelicula;
		this.cantidadReservada = cantidadReservada;
	}
	
	//confirmacion entrada
	
	
	//getters and setter
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public int getCantidadReservada() {
		return cantidadReservada;
	}

	public void setCantidadReservada(int cantidadReservada) {
		this.cantidadReservada = cantidadReservada;
	}
	
	
	
}
