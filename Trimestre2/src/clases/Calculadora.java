package clases;

public class Calculadora {
	
	//atributos
	private double resultado;

	//constructor
	//iniciamos en 0
	public Calculadora() {
		this.resultado = 0.0;
		
	}
	//funcion para sumar el valor actual con uno pasado por parametro
	public double sumar(double num) {
		 return resultado += num;
	}
	//funcion para resta el valor actual con uno pasado por parametro
	public double resta(double num) {
		return resultado -= num;
	}
	//funcion para multiplicar el valor actual con uno pasado por parametro
	public double multi(double num) {
		 return resultado *= num;
	}
	//funcion para dividir el valor actual con uno pasad por parametro, si alguno es igual a 0 no será posible realizarce 
	public double dividir(double num) {
		if (num != 0 && resultado != 0) {
			return num /= resultado;
		} else {
			System.out.println("loquis ese número no se puede dividir entre 0");
			return num;
		}
	}
	//getters and setters
	public double getResultado() {
		return resultado;
	}
}
