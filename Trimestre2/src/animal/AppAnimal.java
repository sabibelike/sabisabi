package animal;

public class AppAnimal {
	public static void main(String[] args) {
		Gato g = new Gato("Misu",7);
		Perro p= new Perro("Firulai", 4, "Golden");
		
		g.comer();
		p.comer();
		g.emitirSonido();
		p.emitirSonido();
		g.arañar();
		p.perseguirCola();
		
		System.out.println("Datos del gato:");
		System.out.println("Nombre: "+g.getNombre());
		System.out.println("Edad: "+g.getEdad());
		
		System.out.println("Datos del perro:");
		System.out.println("Nombre: "+g.getNombre());
		System.out.println("Edad: "+g.getEdad());
		
	}

}
