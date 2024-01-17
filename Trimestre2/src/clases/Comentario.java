package clases;

import java.sql.Date;

public class Comentario {
	//atributos
	private String contenidoComen;
	private String autor;
	private Date fechaComentario;
	
	//constructor
	public Comentario(String contenidoComen, String autor, Date fechaComentario) {
		this.contenidoComen = contenidoComen;
		this.autor = autor;
		this.fechaComentario = fechaComentario;
	}
	
	//getters and setters
	public String getContenidoComen() {
		return contenidoComen;
	}
	public void setContenidoComen(String contenidoComen) {
		this.contenidoComen = contenidoComen;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getFechaComentario() {
		return fechaComentario;
	}
	public void setFechaComentario(Date fechaComentario) {
		this.fechaComentario = fechaComentario;
	}
	
}
