package clases;

import java.util.ArrayList;
import java.util.List;

public class Blog {
	//atributos
	private String nombreBlog;
	private List<Publicacion> listaPublicaciones;
	
	//constructor
	public Blog(String nombreBlog) {
		this.nombreBlog = nombreBlog;
		this.listaPublicaciones = new ArrayList<Publicacion>();
	}
	
	//metodos
	/*
	 * agregarpublicacion*/
	public void agregarPublicacion(Publicacion publicacion) {
		
	}
	
	
	 /* agregarcomentario
	 * buscarpublicacionesporautor
	 * obtenerComentariosDePublicacion 
	 * 
	 */
	
	
	//getters and setters
	public String getNombreBlog() {
		return nombreBlog;
	}
	public void setNombreBlog(String nombreBlog) {
		this.nombreBlog = nombreBlog;
	}
	public List<Publicacion> getListaPublicaciones() {
		return listaPublicaciones;
	}
	public void setListaPublicaciones(List<Publicacion> listaPublicaciones) {
		this.listaPublicaciones = listaPublicaciones;
	}
	
	

}
