package empleado;

public class EmpleadoTiempoParcial extends Empleado {
	private int horasTrabajadas;
	private double tarifaHora;
	
	public EmpleadoTiempoParcial(String nombre, int edad, double salario,
			int horasTrabajadas, double tarifaHora) {
		super(nombre, edad, salario);
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}
	
	public void calcularSalario() {
		this.calcularSalario();
	}
}
