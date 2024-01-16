package entornosDesarrollo;

import java.sql.Date;

public class Venta {
	//atributos
	
	private String idVenta;
	private Producto producto;
	private int cantidadVenta;
	private Cliente cliente;
	private Date fechaVenta;
	
	//constructor
	public Venta (String idVenta, Producto producto, int cantidadVenta, Cliente cliente, Date fechaVenta) {
		this.idVenta = idVenta;
		this.producto = producto;
		this.cantidadVenta = cantidadVenta;
		this.cliente = cliente;
		this.fechaVenta = fechaVenta;
	}
	
	//metodos
	//calculartotal
	public double totalVenta () {
		return this.cantidadVenta*this.producto.getPrecio();
	}
	//generar recibo
	public String recibo() {
		return "Venta Id:" + idVenta + "\\NProducto: "+ producto.getNombre()+ "\\nCantidad: "+ cantidadVenta + "\\nTotal: $"+ totalVenta();
	}
	
	//getters and setters
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidadVenta() {
		return cantidadVenta;
	}
	public void setCantidadVenta(int cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
}
