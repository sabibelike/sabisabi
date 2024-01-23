package animal;

public class Gato extends Animal{
	
	
	public Gato(String nombre, int edad) {
		super(nombre, edad);
		
	}

	public void emitirSonido() {
		super.emitirSonido();
		System.out.println("Miau");
	}
	
	public void arañar() {
		System.out.println("Araña");
	}

}
