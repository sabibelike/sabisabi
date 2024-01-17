package codigoTri2;

import java.util.*;

public class inventarioMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> inventario = new HashMap<>();
		boolean inventarioListo= true;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué quieres hacer?");
		
		while (inventarioListo) {
			System.out.println("1)Añadir Producto 2)Actualizar Cantidad 3)Buscar Producto 4)Inventario 5)Listo el inventario");
			String usuario = sc.nextLine().toLowerCase();
			switch (usuario) {
			case "añadir":
				añadirProducto(inventario);
				break;
			case "actualizar":
				actualizarCantidad(inventario);
				break;
			case "buscar":
				buscarProducto(inventario);
				break;
			case "inventario":
				mostrarInventario(inventario);
				break;
			case "listo":
				inventarioListo = false;
			}
		}
		System.out.println("Gracias por usar este programa para tu inventario");
	}

	public static void añadirProducto(HashMap<String, Integer> inventario) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pruducto ha añadir");
		String producto = sc.nextLine();
		System.out.println("Cantidad del producto");
		int cantidad = sc.nextInt();
		sc.nextLine();

		if (inventario.containsKey(producto)) {
			int aux = inventario.get(producto);
			inventario.put(producto, (aux + cantidad));
		} else {
			inventario.put(producto, cantidad);
		}

		System.out.println(producto + " " + inventario.get(producto));
	}

	public static void actualizarCantidad(HashMap<String, Integer> inventario) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Producto");
		String producto = sc.nextLine();
		
		if (inventario.containsKey(producto)) {
			System.out.println("¿Cuanto tienes?");
			int cantidad = sc.nextInt();
			sc.nextLine();
			inventario.put(producto, cantidad);
		} else {
			System.out.println("No tienes este producto en tu inventario bobito");
			añadirProducto(inventario);
		}
	}
	public static HashMap<String,Integer> mostrarInventario(HashMap<String,Integer> inventario){
		System.out.println("Aqui tienes tu inventario:");
		for(String clave : inventario.keySet()) {
			System.out.println(clave+" "+inventario.get(clave));
		}
		return inventario;
	}
	public static HashMap<String,Integer> buscarProducto(HashMap<String,Integer> inventario){
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cúal producto quieres buscar?");
		String producto = sc.nextLine();
		if (inventario.containsKey(producto)) {
			System.out.println("Producto "+producto+": "+inventario.get(producto));
		} else {
			System.out.println("No tienes este producto bobis");
		}
		return inventario;
	}

}
