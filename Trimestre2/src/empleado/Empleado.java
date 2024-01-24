package empleado;

public class Empleado {
	private String nombre;
	private int edad;
	protected double salario;

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public void trabajar() {
		System.out.println("El empleado "+ nombre +" está trabajando");
	}
	public void descansar() {
		System.out.println("El empleado "+ nombre +" está descansando");
	}

	public void calcularSalario() {
		System.out.println("El salario de "+nombre+" es de "
				+ salario);

	}

	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Salario: "+salario);
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
