package producto;

public class Producto {
	private String nombre;
	private double precio;
	protected int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre+"\nPrecio: "+precio
				+"\nStock: "+stock);
	}
	public void vender(String producto, int cantidad) {
		if (nombre.equals(producto) && stock > cantidad) {
			stock -= cantidad;
		} else {
			System.out.println("No tenemos ese producto o no "
					+ "tenemos tanta cantidad");
		}
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
