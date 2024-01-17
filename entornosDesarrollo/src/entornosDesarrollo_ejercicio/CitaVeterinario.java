package entornosDesarrollo_ejercicio;

import java.sql.Date;
import java.util.ArrayList;

public class CitaVeterinario {
	//clase veterinario
	
		private String idCita;
		private Date fechaCita;
		private Mascota mascota;
		private String motivoCita;
		
	//constructor
	public CitaVeterinario (String idCita, Date fechaCita, Mascota mascota, String motivoCita) {
		this.idCita = idCita;
		this.fechaCita= new Date(0);
		this.mascota=mascota;
		this.motivoCita=motivoCita;
	}
	
	//metodos
	public void reprogramarCita(Date nuevaFechaCita) {
		this.fechaCita=nuevaFechaCita;
	}
	public void cancelarCita(String idCitaCancel) {
		ArrayList<CitaVeterinario> citas = mascota.getListaCita();
		for (CitaVeterinario cita : citas ) {
			if (idCita.equals(idCitaCancel)) {
				citas.remove(cita);
			}
		}
	}
	
	//getting and setters
	public String getIdCita() {
		return idCita;
	}

	public void setIdCita(String idCita) {
		this.idCita = idCita;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public String getMotivoCita() {
		return motivoCita;
	}

	public void setMotivoCita(String motivoCita) {
		this.motivoCita = motivoCita;
	}

	
	
}	
