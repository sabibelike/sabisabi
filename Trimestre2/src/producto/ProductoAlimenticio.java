package producto;

public class ProductoAlimenticio extends Producto {
	private String fechaVencimiento;
	
	public ProductoAlimenticio(String nombre, double precio, int stock,
			String fechaVencimiento) {
		super(nombre, precio, stock);
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Fecha vencimiento "+fechaVencimiento);
	}
	public void verificarCaducidad(String fechaActual) {
		int stock = this.getStock();
		if (fechaVencimiento.equals(fechaActual) && stock > 0) {
			stock--;
			this.setStock(stock);
			System.out.println("Está dañado, ahora el "
					+ "stock es de: "+this.getStock());
		} else {
			System.out.println("Aún está bueno :P");
		}
	}
}
