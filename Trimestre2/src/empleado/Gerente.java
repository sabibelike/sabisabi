package empleado;

public class Gerente extends Empleado{
	private String departamento;
	private int cantidadSubordinados;
	
	
	public Gerente(String nombre, int edad, double salario, String departamento,
			int cantidadSubordinados) {
		super(nombre, edad, salario);
		this.departamento = departamento;
		this.cantidadSubordinados = cantidadSubordinados;
	}
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("De partamento "+departamento+"\nCantidad de "
				+ "subordinados "+cantidadSubordinados);
	}
	public String asignarTarea() {
		return "Asignando tareas";
	}
	
	public void revision() {
		System.out.println("Revisar");
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getCantidadSubordinados() {
		return cantidadSubordinados;
	}
	public void setCantidadSubordinados(int cantidadSubordinados) {
		this.cantidadSubordinados = cantidadSubordinados;
	}
}
