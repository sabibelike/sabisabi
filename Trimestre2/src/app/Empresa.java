package app;

import java.util.ArrayList;

import clases.Empleado;

public class Empresa {

	// atributos
	private String nombreEmpresa;
	private ArrayList<Empleado> listaEmpleados;

	// constructor
	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.listaEmpleados = new ArrayList<Empleado>();
	}

	// metodos
	public void contratarEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);
		System.out.println(
				empleado.getNombre() + " " + empleado.getApellido() + " ha sido contratado por " + nombreEmpresa);
	}

	public void despedirEmpleado(String nombre, String apellido) {
		Empleado empleado = buscarEmpleado(nombre, apellido);
		if (empleado != null) {
			System.out.println(
					"El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " ha sido despedido");
		} else {
			System.out.println("Esta persona ni siquiera trabaja aqui tonto");
		}
		if (empleado != null) {
			listaEmpleados.remove(empleado);
		}
	}

	public Empleado buscarEmpleado(String nombre, String apellido) {
		for (Empleado empleado : listaEmpleados) {
			if (empleado.getNombre().equals(nombre) && empleado.getApellido().equals(apellido)) {
				return empleado;
			}
		}
		return null;
	}

	public void mostrarListaEmpleados() {
		System.out.println("Los empleados actualmente contratados son:");
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado.getNombre() + " " + empleado.getApellido());
		}
	}

	public void mostrarInfoEmpleado(String nombre, String apellido) {
		Empleado empleado = buscarEmpleado(nombre, apellido);
		if (empleado != null) {
			System.out.println("La información de este empleado es: " + empleado.mostrarInfo());
		} else {
			System.out.println("No tienes a nadie contratado bajo ese nombre");
		}
	}

	public void aumento(String nombre, String apellido, double aumento) {
		Empleado empleado = buscarEmpleado(nombre, apellido);
		if (empleado != null) {
			empleado.aumentarSalario(aumento);
		} else {
			System.err.println("No tienes ningun empleado con este nombre");
		}
	}

	// getters and setters
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

}
