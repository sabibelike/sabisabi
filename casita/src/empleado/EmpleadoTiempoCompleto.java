package empleado;

public class EmpleadoTiempoCompleto extends Empleado{
	private double bonoAnual;
	private String tipoContrato;
	
	public EmpleadoTiempoCompleto(String nombre, int edad, double salario,
			double bonoAnual, String tipoContrato) {
		super(nombre, edad, salario);
		this.bonoAnual = bonoAnual;
		this.tipoContrato = tipoContrato;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tipo de contrato: "+tipoContrato);
	}
	
	public void recibirBono() {
		//this.salario += salario+bonoActual;
		System.out.println("Ha recibido su bono de "+bonoAnual);
	}
	
}
