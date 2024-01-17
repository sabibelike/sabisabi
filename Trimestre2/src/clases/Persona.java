package clases;

public class Persona {
	//atributos
	private String nombre;
	private int edad;
	private boolean sexo;
	
	//constructor
	public Persona (String nombre, int edad, boolean sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	//metodos
	
	public String saludar () {
		return ("Hola "+nombre+", bienvenido a este hermoso lugar");
	}
	
	public int cumplirAno() {
		return ++edad;
	}
	
	//getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
}
