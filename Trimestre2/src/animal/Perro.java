package animal;

public class Perro extends Animal{
	private String raza;
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}

	public void emitirSonido() {
		super.emitirSonido();
		System.out.println("Guf guf");
	}
	
	public void perseguirCola() {
		System.out.println("Persiguiendo colita");
	}
}
