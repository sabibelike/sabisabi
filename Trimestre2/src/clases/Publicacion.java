package clases;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
	//atributos
	private String tituloPubli;
	private String contenidoPubli;
	private String autor;
	private int fechaPubli;
	private List<Comentario> comentarios;
	
	//contructor
	public Publicacion(String tituloPubli, String contenidoPubli, String autor, int fechaPubli) {
		this.tituloPubli = tituloPubli;
		this.contenidoPubli = contenidoPubli;
		this.autor = autor;
		this.fechaPubli = fechaPubli;
		this.comentarios = new ArrayList<Comentario>();;
	}
	//metodos
	/*
	 * agregarcomentario	 
	 * 
	 * 
	 * */
	
	public void agregarComentario(Comentario comentario) {
		this.comentarios.add(comentario);
	}
	
	
	//getters and setters
	public String getTituloPubli() {
		return tituloPubli;
	}
	
	public void setTituloPubli(String tituloPubli) {
		this.tituloPubli = tituloPubli;
	}
	public String getContenidoPubli() {
		return contenidoPubli;
	}
	public void setContenidoPubli(String contenidoPubli) {
		this.contenidoPubli = contenidoPubli;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getFechaPubli() {
		return fechaPubli;
	}
	public void setFechaPubli(int fechaPubli) {
		this.fechaPubli = fechaPubli;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	
}
