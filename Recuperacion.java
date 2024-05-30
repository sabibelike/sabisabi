package aea2_T2_AndreaDal;

import java.util.ArrayList;
import java.util.Scanner;

public class Recuperacion {
	public static void main(String[] args) {
		//creamos nuestra lista de estudiantes que tendra una lista de string con su nombre, dias asistidos y dias cursados en total
		ArrayList<ArrayList<String>> estudiantes = new ArrayList<ArrayList<String>>();
		Scanner sc = new Scanner(System.in);
		boolean gestor = true;
		//bucle para hacer funcionar el programa hasta que pidamos que pare
		while(gestor) {
			System.out.println("Bienvenido al intituto wonderfull, que desea hacer?");
			System.out.println("Agregar un alumno(1), pasar lista(2), mostrar alumnos(3), mostrar uno en especial(4), salir(5)");
			int usuario = sc.nextInt();
			switch (usuario) {
			case 1: {
				System.out.println("Nombre");
				String estudiante = sc.next();
				agregarEstudiante(estudiantes, estudiante);
				break;
			}
			case 2: {
				estudiantes = pasarAsistencia(estudiantes);
				break;
			}
			case 3:{
				informe(estudiantes);
				break;
			}
			case 4:{
				System.out.println("Nombre");
				String estudiante = sc.next();
				informeEstudiante(estudiantes, estudiante);
				break;
			}
			case 5:{
				System.out.println("Gracias por usar nuestro sistema gestor :P");
				gestor = false;
				break;
			}
			}
		}	
	}
	//función utilizada para agregar un estudiante dandole un nombre por parametro
	//ademas de agregarle dos posiciones extras vacias que serian para llevar la asistencia
	public static void agregarEstudiante(ArrayList<ArrayList<String>> estudiantes, String nombre) {
		ArrayList<String> alumno = new ArrayList<>();
		alumno.add(nombre.toUpperCase());
		alumno.add("");
		alumno.add("");
		estudiantes.add(alumno);
		System.out.println(estudiantes);
	}
	
	//función que permite pasar la asistencia pasandole el nombre del alumno por parametro
	//si el alumno esta en la lista de la clase se pregunta si esta presente o ausente
	//de estar presente se aumentan los dias cursados y los dias presentes
	//de no estar presente, solo aumenta el dia cursado
	public static ArrayList<ArrayList<String>> pasarAsistencia(ArrayList<ArrayList<String>> estudiantes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del alumno");
		String nombre = sc.nextLine().toUpperCase();
		for(ArrayList<String> estudiante : estudiantes) {
			if(estudiante.get(0).equals(nombre)) {
				int diasCursados = 0;
				int diasPresentes = 0;
				System.out.println("Presente: P, Ausente: A");
				String asistencia = sc.nextLine().toUpperCase();
				if(asistencia.equals("P")) {
					diasPresentes += 1;
					diasCursados += 1;
					estudiante.set(1, diasPresentes+"");
					estudiante.set(2,diasCursados+"");
				}else if (asistencia.equals("A")){
					diasCursados += 1;
					estudiante.set(1, diasPresentes+"");
					estudiante.set(2,diasCursados+"");
				}else {
					System.out.println("Ese alumno no esta en esta clase");
				}
			}
		}
		return estudiantes;
		//problemilla, no actualiza correctamente las asistencias :P sé que debo guardar los dias cursados y presentes para poder actualizarlo cada vez que pase lista
		//pero no me ha dado time jejeje no olvide que le estimo mucho como docente <3 jajaja 
	}
	//funcion que muestra los datos de los estudiante y sus asistencias
	public static void informe(ArrayList<ArrayList<String>> estudiantes) {
		for(ArrayList<String> alumno : estudiantes) {
			System.out.println("Nombre: "+alumno.get(0));
			System.out.println("Dias presente: "+alumno.get(1)+"/"+alumno.get(2));
		}
	}
	//funcion que muestra los datos y asistencia de un alumno en especifico
	public static void informeEstudiante(ArrayList<ArrayList<String>> estudiantes, String nombre) {
		for(ArrayList<String> alumno : estudiantes) {
			if(alumno.get(0).equals(nombre)) {
				informe(estudiantes);
			}else {
				System.out.println("Que onda, ese alumno no estudia aqui");
			}
		}
	}
}
