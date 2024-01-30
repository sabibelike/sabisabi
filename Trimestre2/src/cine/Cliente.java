package cine;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	//atributos4
	private String nombre;
	private String numero;
	private List<Reserva> boletosReservados;
	
	//constructor
	public Cliente(String nombre, String numero, List<Reserva> boletosReservados) {
		this.nombre = nombre;
		this.numero = numero;
		this.setBoletosReservados(new ArrayList<>());
	}
	//obtener boletos
	
	//getter and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Reserva> getBoletosReservados() {
		return boletosReservados;
	}

	public void setBoletosReservados(List<Reserva> boletosReservados) {
		this.boletosReservados = boletosReservados;
	}
	
	

}
