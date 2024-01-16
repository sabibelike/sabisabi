import java.util.ArrayList;

import java.util.Scanner;

public class carritoCompraLuis {
	public static void main(String[] args) {

		ArrayList<String> carrito = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		String usuario = "";

		boolean salir = true;

		System.out.println("VAMOS DE COMPRAS:");

		while (salir) {

			System.out.println("Elige una de estas 4 opciones:");

			System.out.println("1)Añadir al carrito \n2)Eliminar producto \n3)Mostrar carrito\n4)Salir");

			usuario = sc.next();

			switch (usuario) {

			case "1":

				añadirCarrito(carrito);

				break;

			case "2":

				eliminarProducto(carrito);

				break;

			case "3":

				mostrarCarrito(carrito);

				break;

			case "4":

				salir = false;

				break;

			default:

				System.err.println("TE HAS EQUIVOCADO VUELVE A INTRODUCIR");

			}

		}

		System.out.println("ADIOS!");

	}

	public static void añadirCarrito(ArrayList<String> carrito) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ESCRIBE QUE ARTICULO DESEAS AÑADIR");

		String usuario = sc.next();

		usuario = textoHermoso(usuario);

		if (carrito.contains(usuario)) {

			System.out.println("El producto ya se encuentra en la lista");

			añadirCarrito(carrito);

		} else {

			carrito.add(usuario);

			System.out.println("AÑADIDO");

		}

	}

	public static void eliminarProducto(ArrayList<String> carrito) {

		Scanner sc = new Scanner(System.in);

		if (!carrito.isEmpty()) {

			mostrarCarrito(carrito);

			System.out.println("ESCRIBE QUE ARTICULO DESEAS ELIMINAR");

			String usuario = sc.next();

			usuario = textoHermoso(usuario);

			if (carrito.contains(usuario)) {

				carrito.remove(carrito.indexOf(usuario));

				System.out.println("ELIMINADO");

			} else {

				System.err.println("NO SE ENCUENTRA EN LA LISTA REPITE");

				eliminarProducto(carrito);

			}

		} else {

			System.err.println("CARRITO VACIO");

		}

	}

	public static void mostrarCarrito(ArrayList<String> carrito) {

		System.out.println("--------------------------------");

		System.out.println("CARRITO:");

		if (!carrito.isEmpty()) {

			for (int i = 0; i < carrito.size(); i++) {

				int num = i + 1;

				System.out.println(num + ")" + carrito.get(i));

			}

		} else {

			System.err.println("CARRITO VACIO");

		}

		System.out.println("--------------------------------");

	}

	public static String textoHermoso(String usuario) {

		char car = usuario.charAt(0);

		car = Character.toUpperCase(car);

		String txt1 = car + "";

		for (int i = 1; i < usuario.length(); i++) {

			txt1 += usuario.charAt(i);

		}

		return txt1;

	}

}
