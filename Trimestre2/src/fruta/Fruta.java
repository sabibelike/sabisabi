package fruta;

public class Fruta {
	private String nombre;
	private String color;
	private double peso;
	private boolean semilla;
	
	public void info () {
		System.out.println("La fruta se llama "+nombre);
		System.out.println("La fruta tine color "+color);
		System.out.println("La fruta tiene peso de "+peso);
		System.out.println("La fruta tiene la semilla "+semilla);
		
	}

	public Fruta(String nombre, String color, double peso, boolean semilla) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.semilla = semilla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isSemilla() {
		return semilla;
	}

	public void setSemilla(boolean semilla) {
		this.semilla = semilla;
	}
}
