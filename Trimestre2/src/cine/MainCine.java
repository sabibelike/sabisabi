package cine;

public class MainCine {
	public static void main(String[] args) {
		Cine cine = new Cine("Pelisabi", "Calle Velazquez, 100", 20.50);
		
		cine.agregarPelicula(new Pelicula("Wonka", 100));
		cine.agregarPelicula(new Pelicula("Los juegos del hambre", 120));
		
		cine.mostrarCartelera();
		
	}
}
