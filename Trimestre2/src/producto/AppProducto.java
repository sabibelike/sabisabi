package producto;

public class AppProducto {
	public static void main(String[] args) {
		
		ProductoAlimenticio s1 = new ProductoAlimenticio("Maki", 18, 5, "26/02");
		ProductoAlimenticio s2 = new ProductoAlimenticio("Uramaki", 16, 10, "24/02");
		
		ProductoElectronico i1 = new ProductoElectronico("Iphone", 20, 45, "Apple", "15 pro max");
		ProductoElectronico i2 = new ProductoElectronico("Mac", 500, 10, "Apple", "Air");
		
		s1.mostrarInfo();
		s2.mostrarInfo();
		s1.vender("Maki", 3);
		System.out.println("Luego de la venta hay en stock"+s1.getStock());
		s2.verificarCaducidad("24/02");
		
		i1.mostrarInfo();
		i2.mostrarInfo();
		i1.vender("Iphone", 60);
		System.out.println("Luego de la venta hay en stock "+i1.getStock());
	}

}
