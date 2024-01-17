package entornosDesarrollo_ejercicio;

import java.util.ArrayList;

public class Mascota {
	//clase mascota
	
		private String idMascota;
		private String nombreMascota;
		private String razaMascota;
		private ArrayList<CitaVeterinario> listaCita;
	
	//constructor
	public Mascota (String idMascota, String nombreMascota, String razaMascota) {
		this.idMascota = idMascota;
		this.nombreMascota = nombreMascota;
		this.razaMascota = razaMascota;
		this.listaCita = new ArrayList<>();
	}
	
	//metodos
	public void programarCita(CitaVeterinario listaCita) {
		this.listaCita.add(listaCita);
	}
	public void listarCitas() {
		System.out.println("La mascota "+nombreMascota+" tiene cita(s): ");
		for (CitaVeterinario cita : this.listaCita) {
			System.out.println(cita.getFechaCita());
		}	
	}
	//getters y setters
	public String getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(String idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getRazaMascota() {
		return razaMascota;
	}

	public void setRazaMascota(String razaMascota) {
		this.razaMascota = razaMascota;
	}
	public ArrayList<CitaVeterinario> getListaCita() {
		return listaCita; 
	}


	

	
}
