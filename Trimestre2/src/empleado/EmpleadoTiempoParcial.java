package empleado;

public class EmpleadoTiempoParcial extends Empleado{
	private int horasTrabajadas;
	private double tarifaHora;

	public EmpleadoTiempoParcial(String nombre, int edad, double salario,
			int horasTrabajadas, double tarifaHora) {
		super(nombre, edad, salario);
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Horas trabajadas "+horasTrabajadas);
		System.out.println("Tarifa por hora "+tarifaHora);
	}
	public void calcularSalario() {
		this.salario = horasTrabajadas*tarifaHora;
		super.calcularSalario();
	}
	
	public void mostrarHorasTrabajadas() {
		System.out.println("El empleado ha trabajado: "+horasTrabajadas+
				" horas");
	}
}
