package casa;

public class Casa {
	private String direccion;
	private int numHab;
	private double precio;
	
	public Casa(String direccion, int numHab, double precio) {
		this.direccion = direccion;
		this.numHab = numHab;
		this.precio = precio;
	}
	public void mostrarInfo() {
		System.out.println("La casa está en "+direccion+", con numero de "
				+ "habitacion "+numHab+" y con precio "+precio);
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumHab() {
		return numHab;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
