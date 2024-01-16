package trimes2;

public enum MenuAgenda {
	AGREGAR("agregar"), BUSCAR("agregar"), ELIMINAR("agregar"), MOSTRAR("mostrar"), SALIR("salir");

	String valor;
	MenuAgenda(String valor){
		this.valor= valor;
	}
	public String getValor() {
		return valor;
	}
}
