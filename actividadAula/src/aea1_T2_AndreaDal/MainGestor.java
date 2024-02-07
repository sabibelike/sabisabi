package aea1_T2_AndreaDal;

public class MainGestor {
	public static void main(String[] args) {
		
		//crear clientes
		Cliente cliente1 = new Cliente("Andrea", "658745201", "Calle de tu corazon", "holaprofe@quieropasar.com","51029045A");
		Cliente cliente2 = new Cliente("Andrés", "678412587", "Calle de tu corazon", "holaprofe@quieropasar.com","51029045A");
		Cliente cliente3 = new Cliente("Luis", "632547841", "Calle de tu corazon", "holaprofe@quieropasar.com","51029045A");
		Cliente cliente4 = new Cliente("Coral", "620147445", "Calle de tu corazon", "holaprofe@quieropasar.com","51029045A");
		Cliente cliente5 = new Cliente("Juanpe", "666777888", "Calle de tu corazon", "holaprofe@quieropasar.com","51029045A");
		Cliente cliente6 = new Cliente("Deyby", "696565414", "Calle de tu corazon", "holaprofe@quieropasar.com","51029045A");
		Cliente cliente7 = new Cliente("David", "632541785", "Calle de tu corazon", "holaprofe@quieropasar.com","51029045A");
		
		//crear agenda
		Contactos agenda = new Contactos();
		
		//agregarContactos
		agenda.agregarContacto(cliente1);
		agenda.agregarContacto(cliente2);
		agenda.agregarContacto(cliente3);
		agenda.agregarContacto(cliente4);
		agenda.agregarContacto(cliente5);
		agenda.agregarContacto(cliente6);
		//el cliente 7 no ha sido agregado
		
		
		/*Algunos sysout son solomente algo mas orientativo*/
		System.out.println("Nivel amistad");
		//comprobar el nivel de amistad :)
		agenda.nivelAmistad();
		
		//ver toda la agenda
		agenda.listaAmigos();
		
		//demo de eliminar a un contacto de la agenda y a otro que no ha sido agregado
		agenda.eliminarContacto(cliente6);
		agenda.eliminarContacto(cliente7);
		agenda.eliminarContacto(cliente5);
		agenda.eliminarContacto(cliente4);
		agenda.eliminarContacto(cliente3);
		agenda.nivelAmistad();
		agenda.listaAmigos();
		
		
		
	}
}
