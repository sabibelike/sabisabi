package aea1_T2_AndreaDal;

import java.util.ArrayList;

public class Gestor{
	//atributos
	ArrayList<Contactos> contactos;
	
	//constructor
	public Gestor() {
		this.contactos = new ArrayList<Contactos>();
	}
	
	//metodos
	public void listaContactos(Contactos contacto) {
		contactos.add(contacto);
	}
	
	//getter and setter
	public ArrayList<Contactos> getClientes() {
		return contactos;
	}

	public void setClientes(ArrayList<Contactos> clientes) {
		this.contactos = clientes;
	}


	


	
	
}
