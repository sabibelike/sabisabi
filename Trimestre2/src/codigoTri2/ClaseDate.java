package codigoTri2;

import java.util.Date;

public class ClaseDate {
	public static void main(String[] args) {
		Date fecha = new Date();
		//fecha actual horas, minutos y segundos
		System.out.println(fecha.toString());
		
		Date fechaAux = new Date(1998, 11, 2);
		System.out.println(fechaAux.toString());
	}
}
