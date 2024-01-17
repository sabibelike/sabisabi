package codigoClase2;

public enum DiasSemana {
	//todas las letras en mayuscula y sirve para menús
	//DIAS DE LA SEMANA
	LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);
	
	
	int valor;
	DiasSemana(int valor){
		this.valor=valor;
	}
	
	public int getValor() {
		return valor;
	}
	
}
