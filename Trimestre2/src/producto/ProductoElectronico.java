package producto;

public class ProductoElectronico extends Producto{
	private String marca;
	private String modelo;
	
	public ProductoElectronico(String nombre, double precio, int stock,
			String marca, String modelo) {
		super(nombre, precio, stock);
		this.marca = marca;
		this.modelo = modelo;
	}
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Marca "+marca+"\nModelo "+modelo);
	}
}
