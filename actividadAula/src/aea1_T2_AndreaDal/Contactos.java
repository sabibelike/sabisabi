package aea1_T2_AndreaDal;

import java.util.ArrayList;
import java.util.HashMap;

public class Contactos implements GestionClientes {

	// atributos
	HashMap<String, ArrayList<String>> agenda;

	// constructor
	public Contactos() {
		this.agenda = new HashMap<String, ArrayList<String>>();
	}

	// metodos
	public void nivelAmistad() {
		int cantidadAmigos = agenda.size();
		switch (cantidadAmigos) {
		case 0,1,2,3,4,5 : 
			System.out.println("Usuario nuevo");
			break;
		case 6,7,8,9,10 :
			System.out.println("Amistoso");
			break;
		case 11,12,13,14,15:
			System.out.println("Muy amistoso");
			break;
		case 16 :
			System.out.println("Querido por todos");
			break;
		}
	}

	@Override
	// funcion que crea un contacto, de estar ya en la agenda dice que está añadido,
	// de no ser asi primero agrega los datos al
	// arraylist y luego agrega a la agenda el nombre de la persona y despues sus
	// datos :)
	public void agregarContacto(Cliente cliente) {
		ArrayList<String> datosContacto = new ArrayList<>();
		if (agenda.containsKey(cliente)) {
			System.out.println("Ya está añadido este contacto :)");
		} else {
			datosContacto.add(cliente.getNumTelf());
			datosContacto.add(cliente.getDireccion());
			datosContacto.add(cliente.getCorreo());
			agenda.put(cliente.getNombre(), datosContacto);
		}
	}

	/*
	 * si el clinte está en la agenda regresa su numero de movil
	 */
	@Override
	public void buscarContacto(Cliente cliente) {
		if (agenda.containsKey(cliente)) {
			System.out.println("El numero de " + cliente.getNombre() + " es: " + cliente.getNumTelf());
		} else {
			System.out.println("Aún no lo añades :P");
		}
	}

	/*
	 * por parametro pasas el cliente que quieras modificar, el tipo de dato y el
	 * dato en sí
	 */
	@Override
	public void actualizarInfo(Cliente cliente, String datoCambiar, String dato) {
		if (agenda.containsKey(cliente)) {
			switch (datoCambiar) {
			case "Nombre":
				cliente.setNombre(dato);
				break;
			case "Numero":
				cliente.setNumTelf(dato);
				break;
			case "Direccion":
				cliente.setDireccion(dato);
				break;
			case "Correo":
				cliente.setCorreo(dato);
				break;
			}
		} else {
			System.out.println("No puedes cambiar nada que aún no haya sido agregado");
		}
	}

	/*
	 * busca al cliente, si se encuentra se elimina todos los datos relaciones a su
	 * nombre
	 */
	@Override
	public void eliminarContacto(Cliente cliente) {
		if (agenda.containsKey(cliente.getNombre())) {
			agenda.remove(cliente.getNombre());
			System.out.println("Ha sido eliminado por tontis");
		} else {
			System.out.println("¿Cómo vas a eliminar a alguien que no tienes agregado bobis?");
		}

	}
	
	public void listaAmigos() {
		System.out.println("Tus amigos son:");
		for (String amigos : agenda.keySet()) {
			System.out.println(amigos);
		}
	}

	// getters and setters
	public HashMap<String, ArrayList<String>> getAgenda() {
		return agenda;
	}

	public void setAgenda(HashMap<String, ArrayList<String>> agenda) {
		this.agenda = agenda;
	}

}
