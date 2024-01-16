import java.util.ArrayList;
import java.util.Scanner;

public class carritoCompra {
	public static void main(String[] args) {
		ArrayList<String> carrito = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola chama, vamonos de compras");
		boolean salir = true;
		while (salir) {
			System.out.println(
					"Cuentame, tienes varias opciones con tu lista: \nAñadir un producto \nEliminar un producto \nMostrar la lista \nSalir");
			String usuario = sc.nextLine().toUpperCase();
			switch (usuario) {
			case "AÑADIR":
				añadirCarrito(sc, carrito);
				break;
			case "ELIMINAR":
				eliminarProd(sc, carrito);
				break;
			case "MOSTRAR":
				mostrar(carrito);
				break;
			case "SALIR":
				salir = false;
				break;
			}
		}
		System.out.println("Chais amiguis, vete a por todo y deja la tarjeta ;*");
	}

	public static void añadirCarrito(Scanner sc, ArrayList<String> carrito) {
		System.out.println("Amigui escribe lo que vas a comprar :)");
		String usuario = sc.nextLine();
		for (int i=0; i<carrito.size(); i++) {
			carrito.get(i);
			if (usuario.equals(carrito)) {
				System.out.println("Amigui, eso ya lo tienes en la lista tontis");
			}
		}
		carrito.add(usuario);
		System.out.println("Añadido");
	}

	public static void mostrar(ArrayList<String> carrito) {
		System.out.println("Chiquis esto es lo que llevas en tu lista: " + "\n" + carrito);
	}

	public static void eliminarProd(Scanner sc, ArrayList<String> carrito) {
		System.out.println("Escribe lo que deseas eliminar de la lista chama, no tienes dinero");
		String usuario = sc.nextLine();
		carrito.remove(usuario);
		System.out.println("Eliminado");
	}

}
