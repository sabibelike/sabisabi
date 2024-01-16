package entornosDesarrollo;

public class Cliente {
	//atributos
	
	private String idCliente;
	private String nombre;
	private String email;
	
	//constructor
	
	public Cliente (String idCliente, String nombre, String email) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
	}
	
	//metodos
	//actualizar correo
	public void actualizarEmail(String nuevoEmail) {
		this.email = nuevoEmail;
	}
	
	
	//getters and setters
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
