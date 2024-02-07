package aea1_T2_AndreaDal;

public interface GestionClientes {
	
	
	void agregarContacto(Cliente cliente);
	
	
	void buscarContacto(Cliente cliente);
	
	
	void actualizarInfo(Cliente cliente, String datoCambiar, String dato);
	
	
	void eliminarContacto(Cliente cliente);
	
	
}
