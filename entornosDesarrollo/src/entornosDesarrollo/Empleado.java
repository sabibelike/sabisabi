package entornosDesarrollo;

public class Empleado {
	// Clase Empleado
	private String idEmpleado;
	private String nombre;
	private String cargo;

	// Constructor
	public Empleado(String idEmpleado, String nombre, String cargo) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.cargo = cargo;
	}

	// Métodos
	public Usuario registrarUsuario(String idUsuario, String nombre) {
		return new Usuario(idUsuario, nombre);
	}

	public void procesarDevolucion(Usuario usuario, Libro libro) {
		usuario.devolver(libro);
		libro.agregarCopias(1);
	}

	// Getters y setters
	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
