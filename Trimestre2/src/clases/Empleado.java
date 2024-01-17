package clases;

public class Empleado {
	//atributos
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	private String email;
	private String telefono;
	private String direccion;
	
	//constructor
	//constructor para inicializar la clase
	public Empleado(String nombre, String apellido, int edad, double salario, String email, String telefono,
			String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	//metodos
	//funcion para enviar un correo con un mensaje pasado por parametro
	public void enviarCorreo(String mensaje) {
		System.out.println("Enviando un coreo de: "+email);
		System.out.println("Mensaje: "+mensaje);
	}
	
	//metodo para realizar una llamada a un numero pasado por parametro 
	public void realizarLlamada(String numeroLlamar) {
		System.out.println("Hacer llamada a: "+numeroLlamar);
		System.out.println("Llamando");
	}
	
	//metodo para mostrar toda la informacion del empleado 
	public String mostrarInfo() {
		return ("Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+
				"\nSalario: "+salario+"\nEmail: "+email+"\nTelefono: "+telefono+"\nDireccion: "+direccion);
	}

	//metodo para aumentar el salario del empleado conforme el porcentaje pasado por parametro 
	public void aumentarSalario(double porcentaje) {
		System.out.println("Felicidades, aumento para ti");
		if (porcentaje > 0) {
			salario += (salario*porcentaje / 100);
			System.out.println("El salario de: "+nombre+", ha aumentado en un "+porcentaje+"% dejandole un salio de: "+salario);
		} else {
			System.out.println("No puede ser un porcentaje menor a cero, genio");
		}
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public double getSalario() {
		return salario;
	}

	
}
