package clases;

import java.util.ArrayList;
import java.util.List;

public class Blog {
	// atributos
	private String nombreBlog;
	private List<Publicacion> listaPublicaciones;

	// constructor
	public Blog(String nombreBlog) {
		this.nombreBlog = nombreBlog;
		this.listaPublicaciones = new ArrayList<Publicacion>();
	}

	// metodos
	/*
	 * agregarpublicacion
	 */
	public void agregarPublicacion(Publicacion publicacion) {
		listaPublicaciones.add(publicacion);
	}

	/* agregarcomentario */
	public void agregarComentario(Publicacion publicacion, Comentario comentario) {
		if (listaPublicaciones.contains(publicacion)) {
			publicacion.agregarComentario(comentario);
		} else {
			System.out.println("La publicacion no existe en el blog");
		}
	}

	/* buscarpublicacionesporautor */
	public void buscarPubliPorAutor(Publicacion publicacion, String autor) {
		System.out.println("Las publicaciones de este autor son: ");
		for (Publicacion autores : listaPublicaciones) {
			if (publicacion.getAutor().equals(autor)) {
				System.out.println(publicacion.getContenidoPubli());
			} else {
				System.out.println(autor + " no tiene ninguna publicación");
			}
		}
	}

	/*
	 * obtenerComentariosDePublicacion*/
	 public void obtenerComentarioPubli(Publicacion publicacion) {
		 publicacion.getComentarios();
	 }

	// getters and setters
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
