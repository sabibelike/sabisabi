package clases;

public class CuentaBancaria {
	
	//atributos
	private String titular;
	private double saldo;
	
	//constructor
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//metodos
	public double depositar(double deposito) {
		if (deposito > 0.50) {
			return saldo += deposito;
		} else {
			System.out.println("El monto mínimo de deposito es de 0.50");
			return saldo;
		}
		
	}
	
	public double retirar (double retirado) {
		if (retirado <= saldo && retirado > 0) {
			return saldo -= retirado;
		} else {
			System.out.println("No tienes saldo suficiente");
			return saldo;
		}
	}
	
	//getters and setters
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
}
