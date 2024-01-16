package trimes2;

import java.util.*;

public class ejercicioMapsAgenda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> agenda = new HashMap<>();
		boolean salir = true;
		
		System.out.println("Che boludo, que querés hacer?");
		while (salir) {
			switch (agendaMenu()) {
			case AGREGAR:
				agregarAgenda(sc,agenda);
				break;
			case ELIMINAR:
				eliminarAgenda(sc,agenda);
				break;
			case BUSCAR:
				buscarNumero(sc,agenda);
				break;
			case MOSTRAR:
				mostrarAgenda(sc,agenda);
				break;
			case SALIR:
				salir = false;
			}
		}
		System.out.println("Chais amigui");
	}
	public static MenuAgenda agendaMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1)Agregar 2)Eliminar 3)Buscar 4)Mostrar 5)Salir");
			String usuario = sc.nextLine().toLowerCase();
			switch (usuario) {
			case "agregar":
				return MenuAgenda.AGREGAR;
			case "eliminar":
				return MenuAgenda.ELIMINAR;
			case "buscar":
				return MenuAgenda.BUSCAR;
			case "mostrar":
				return MenuAgenda.MOSTRAR;
			case "salir":
				return MenuAgenda.SALIR;
			default: System.out.println("Bobis, es una de estas opciones jejejejeje");
			}
		}
	}
	
	public static void agregarAgenda(Scanner sc, HashMap<String,String> agenda) {
		System.out.println("Nombre del contacto y numero del contacto :P");
		String usuarioNombre = sc.nextLine();
		String usuarioNumero = sc.nextLine();
		if (usuarioNumero.length()!=9) {
			System.out.println("Debe ser un número de 9 digitos");
			agregarAgenda(sc,agenda);
		}else {
			agenda.put(usuarioNombre,usuarioNumero);
		}
		
	}
	public static void eliminarAgenda(Scanner sc, HashMap<String,String> agenda) {
		System.out.println("¿Cúal es el contacto que quieres eliminar?");
		String nombre = sc.nextLine().toLowerCase();
		for (String clave : agenda.keySet()) {
			if (agenda.containsKey(clave)) {
				agenda.remove(nombre);
			}
		}
	}
	public static HashMap<String,String> buscarNumero (Scanner sc, HashMap<String,String> agenda){
		System.out.println("¿A quien quieres buscar?");
		String nombre = sc.nextLine().toLowerCase();
		System.out.println("El numero que corresponde a "+nombre+" es: " +agenda.get(nombre));
		return agenda;
		
	}
	public static HashMap<String,String> mostrarAgenda (Scanner sc, HashMap<String,String> agenda){
		for (String clave : agenda.keySet()) {
			System.out.println("El numero de "+clave+" es: "+agenda.get(clave));
		}
		return agenda;
	}
}
