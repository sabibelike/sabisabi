package aea1_T2_AndreaDal;

public class Cliente {
	//atributos
	private String nombre;
	private String numTelf;
	private String direccion;
	private String correo;
	private String dni;
	
	//supuestamente esto es una comprobacion para que no permita ingresar un numero que no empiece por 6
	//spoiler: no funciona jajaja
	/*public String comprobacionNumero(String numTelf) {
		for (int i= 0; i<0; i++) {
			if(numTelf.equals("6")) {
				return numTelf;
			}
		}
		return null;
	}*/
	//constructor
	public Cliente(String nombre, String numTelf, String direccion, String correo, String dni) {
		this.nombre = nombre;
		if(numTelf.charAt(0)=='6') {
			this.numTelf=numTelf;
		}else {
			this.numTelf = null;
		}
		this.direccion = direccion;
		this.correo = correo;
		this.dni= dni;
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumTelf() {
		return numTelf;
	}

	public void setNumTelf(String numTelf) {
		for (int i= 0; i<1; i++) {
			if(numTelf!="6") {
				System.out.println("El numero de movil debe empezar por 6");
			}else {
				this.numTelf = numTelf;
			}
		}
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		
		this.correo = correo;
	}
	
	
	
	
	
	
}
