package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import clases.Calculadora;
import clases.Circulo;
import clases.Coche;
import clases.CuentaBancaria;
import clases.Estudiante;
import clases.Persona;
import clases.Rectangulo;

public class App {

	public static void main(String[] args) {
		System.out.println("------------------------coche--------------------------------");
		Coche cocheNuevo = new Coche("Tesla", "Normal", 99, "Amarrillo", 5.25);
		Coche cocheNuevo1 = new Coche("Citroen", "equis", 99, "Animal print", 4);
		Coche cocheNuevo2 = new Coche("Rolls Royce","el de cr7", 4, "Verde", 2.50);

		System.out.println("La marca de los coches nuevos son: " + cocheNuevo.marca + ", " + cocheNuevo1.marca + ", "
				+ cocheNuevo2.marca);

		Coche[] arrayCoche = new Coche[3];
		arrayCoche[0] = cocheNuevo;
		arrayCoche[1] = cocheNuevo1;
		arrayCoche[2] = cocheNuevo2;
		
		for(Coche c : arrayCoche) {
			System.out.println("El color del coche es: "+c.color);
		}
		
		cocheNuevo.color = "Color passion fruit";
		
		System.out.println("------------------------calculadora---------------------------------");
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.sumar(5));
		System.out.println(calculadora.resta(1));
		System.out.println(calculadora.multi(7));
		System.out.println(calculadora.dividir(2));
		
		System.out.println("---------------------circulo--------------------------------------");
		
		Circulo circulo = new Circulo(5.5);
		System.out.println(Math.round(circulo.calcularArea()));
		System.out.println(circulo.calcularPerimetro());
		
		System.out.println("------------------cuenta bancaria-----------------------------------------");
		
		//manifestando
		CuentaBancaria cliente = new CuentaBancaria("Andrea",5000);
		
		System.out.println(cliente.depositar(50000));
		System.out.println(cliente.retirar(20000));
		
		System.out.println("------------------persona-----------------------------------------");
		
		Persona nuevaPersona = new Persona("Deyby", 19, false);
		
		System.out.println(nuevaPersona.saludar());
		System.out.println(nuevaPersona.getEdad());
		System.out.println(nuevaPersona.cumplirAno());
		
		System.out.println("------------------rectangulo-----------------------------------------");
		
		Rectangulo rectangulo = new Rectangulo(7, 58);
		
		System.out.println(rectangulo.calcularArea());
		System.out.println(rectangulo.calcularPerimetro());
		
		System.out.println("------------------Estudiante-----------------------------------------");
		
		HashMap<String,List<Double>> calificaciones = new HashMap<String, List<Double>>();
		List<String> listaCursos = new ArrayList<String>();
		Estudiante estudiante = new Estudiante ("Andrea", 24, listaCursos, calificaciones);
		
		estudiante.agregarCurso("Programacion");
		estudiante.agregarCurso("Sistemas");
		estudiante.agregarCurso("Lenguaje");
		
		estudiante.agregarCalificacion("Lenguaje", 5.0);
		estudiante.agregarCalificacion("Lenguaje", 7.0);
		estudiante.agregarCalificacion("Lenguaje", 10.0);
		 //manifestando
		estudiante.agregarCalificacion("Programacion", 10.0);
		estudiante.agregarCalificacion("Programacion", 10.0);
		estudiante.agregarCalificacion("Programacion", 10.0);
		
		estudiante.agregarCalificacion("Sistemas", 10.0);
		estudiante.agregarCalificacion("Sistemas", 8.0);
		estudiante.agregarCalificacion("Sistemas", 8.0);
		
		System.out.println(estudiante.promedio());

	}
}
