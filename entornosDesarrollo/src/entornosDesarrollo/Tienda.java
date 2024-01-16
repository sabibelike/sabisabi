package entornosDesarrollo;

import java.util.ArrayList;

public class Tienda {
	//atributos
	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaProductos;
	private ArrayList<Cliente> listaClientes;
	
	//constructor
	public Tienda (String nombre, String direccion, ArrayList<Producto> listaProductos, ArrayList<Cliente> listaClientes) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaProductos = new ArrayList<>();
		this.listaClientes = new ArrayList<>();
	}
	
	//metodos
	//añadirproducto
	public void añadirProducto(Producto producto) {
		this.listaProductos.add(producto);
	}
	//registrarcliente
	public void registrarCliente(Cliente nuevoCliente) {
		this.listaClientes.add(nuevoCliente);
	}
	//realizarventa
	public void realizarVenta(Venta vendido) {
		
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
}
