package entornosDesarrollo;

public class Producto {
	//Atributos
	
	private String idProducto;
	private String nombre;
	private int precio;
	private int stock;
	
	//Constructor
	public Producto (String idProducto, String nombre, int precio, int stock) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	//metodos
	//reponer
	public void reponerStock(int cantidad) {
		this.stock += cantidad;
	}
	//reducir
	public void reducirStock(int cantidad) {
		this.stock -= cantidad;
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
