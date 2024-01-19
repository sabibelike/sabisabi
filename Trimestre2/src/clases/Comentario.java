package clases;

import java.sql.Date;

public class Comentario {
	//atributos
	private String contenidoComen;
	private String usuario;
	private int fechaComentario;
	
	//constructor
	public Comentario(String contenidoComen, String usuario, int fechaComentario) {
		this.contenidoComen = contenidoComen;
		this.usuario = usuario;
		this.fechaComentario = fechaComentario;
	}
	
	//getters and setters
	public String getContenidoComen() {
		return contenidoComen;
	}
	public void setContenidoComen(String contenidoComen) {
		this.contenidoComen = contenidoComen;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setAutor(String usuario) {
		this.usuario = usuario;
	}
	public int getFechaComentario() {
		return fechaComentario;
	}
	public void setFechaComentario(int fechaComentario) {
		this.fechaComentario = fechaComentario;
	}
	
}
