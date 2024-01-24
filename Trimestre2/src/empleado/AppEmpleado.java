package empleado;

public class AppEmpleado {
	public static void main(String[] args) {
		EmpleadoTiempoCompleto a = new EmpleadoTiempoCompleto("Andrea", 24, 
				1000, 500, "Indefinido");
		
		EmpleadoTiempoParcial l = new EmpleadoTiempoParcial("Luis", 22, 0, 120, 15);
		
		Gerente d = new Gerente("David", 30, 2500, "Informática", 25);
		
		
		
		a.calcularSalario();
		l.calcularSalario();
		d.calcularSalario();
		a.descansar();
		a.trabajar();
		a.mostrarInfo();
		a.recibirBono();
		l.calcularSalario();
		l.mostrarHorasTrabajadas();
		d.mostrarInfo();
		d.setCantidadSubordinados(30);
		d.mostrarInfo();
		
	}
}
