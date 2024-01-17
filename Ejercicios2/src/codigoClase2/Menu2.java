package codigoClase2;

public enum Menu2 {
	SUMA("+"), RESTA("-"), MULTIPLICAR("*"), DIVIDIR("/"), ELEVAR("e");

	String valor;

	Menu2(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
}
