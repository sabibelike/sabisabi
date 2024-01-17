package app;

import java.util.ArrayList;

import clases.Empleado;

public class MainEmpresaEmpleado {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa ("Tienda Vino");
		
		Empleado empleado = new Empleado("Andrea", "Dal", 24, 700.0, "asdn@gmail.com","722167658", "Calle Lopez de hoyos");  
		empresa.contratarEmpleado(empleado);
		empresa.contratarEmpleado(new Empleado("Farek", "Kuzniar", 25, 1500, "farek@gmail.com","6881523645", "Calle Ramon Calabuig"));
		empresa.contratarEmpleado(new Empleado("Luis", "Angel", 21, 700.0, "luis@gmail.com","88768745", "Calle a tomar por culo"));
		

		empresa.despedirEmpleado("Luis","Angel");
		empresa.mostrarListaEmpleados();
		
		empresa.mostrarInfoEmpleado("Farek", "Kuzniar");
		
		empresa.aumento("Andrea", "Dal", 50.0);

	}

}
