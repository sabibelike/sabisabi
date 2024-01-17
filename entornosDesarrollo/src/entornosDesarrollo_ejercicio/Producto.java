package entornosDesarrollo_ejercicio;

public class Producto {
	//atributos
	private String idProducto;
	private String nombre;
	private double precio;
	private int cantidadStock;
	
	//constructor
	public Producto (String idProducto, String nombre, double precio, int cantidadStock) {
		this.setIdProducto(idProducto);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setCantidadStock(cantidadStock);
	}
	//methods
	public void reponerStock(int cantidad) {
		this.cantidadStock = cantidadStock+cantidad;
	}
	
	public void venderProducto(int cantidad) {
		this.cantidadStock = cantidadStock-cantidad;
	}
	
	//getters and setters
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	
	 

}
