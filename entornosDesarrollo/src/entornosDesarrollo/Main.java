package entornosDesarrollo;

public class Main {
	// Clase Main para demostración
	    public static void main(String[] args) {
	        // Crear objetos de las clases
	        Libro libro = new Libro("123456789", "El Principito", "Antoine de Saint-Exupéry", 1943, 5);
	        Empleado empleado = new Empleado("E01", "Juan Perez", "Bibliotecario");
	        Usuario usuario = empleado.registrarUsuario("U100", "Ana Gomez");

	        // Realizar un préstamo
	        Prestamo prestamo = new Prestamo(libro, usuario, 14);
	        usuario.tomarPrestado(prestamo);

	        // Imprimir información del préstamo
	        System.out.println(prestamo);

	        // Procesar una devolución
	        empleado.procesarDevolucion(usuario, libro);

	        // Mostrar la información del libro después de la devolución
	        System.out.println(libro.mostrarInfo());
	    }
	}

