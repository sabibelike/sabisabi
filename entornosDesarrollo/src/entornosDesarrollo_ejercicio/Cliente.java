package entornosDesarrollo_ejercicio;

import java.util.ArrayList;

public class Cliente {
	//clase cliente
	
		private String idCliente;
		private String nombre;
		private ArrayList<Mascota> listaMascota;
	
	//constructor
	public Cliente (String idCliente, String nombre) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.listaMascota = new ArrayList<>();
	}
	
	//metodos
	public void añadirMascota(Mascota mascota) {
		this.listaMascota.add(mascota);
	}
	public void listarMascota() {
		System.out.println(this.nombre+" tiene de mascotas a: ");
		for (Mascota mascota : this.listaMascota) {
			System.out.println(mascota.getNombreMascota());
		}
	}
	
	//getters y setters
	public String getIdCliente() { return idCliente; }
    public void setIdUsuario(String idCliente) { this.idCliente = idCliente; }
	
	public String getNombreCliente() { return nombre;}
	public void setNombreCliente(String Nombre) { this.nombre = nombre; }
	
	public ArrayList<Mascota> getListaMascota() { return listaMascota;}
	public void setListaMascota(ArrayList<Mascota> mascota) {this.listaMascota = listaMascota; }
	
}
