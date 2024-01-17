package codigoTri2;

public enum MenuAgenda {
	AGREGAR("agregar"), BUSCAR("buscar"), ELIMINAR("eliminar"), MOSTRAR("mostrar"), SALIR("salir");

	String valor;
	MenuAgenda(String valor){
		this.valor= valor;
	}
	public String getValor() {
		return valor;
	}
}
