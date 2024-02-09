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
	public void buscarPubliPorAutor(String autor) {
		List<Publicacion> publisAutor = null;
		System.out.println("Las publicaciones de este autor son: ");
		for (Publicacion publicacion : listaPublicaciones) {
			if (publicacion.getAutor().equals(autor)) {
				publisAutor.add(publicacion);
			}
		}
		
		for (Publicacion publicacion : publisAutor) {
			if(publisAutor != null) {
				System.out.println("El titulo es: "+publicacion.getTituloPubli()+" el contenido es: "+publicacion.getContenidoPubli());
			} else {
				System.out.println("El autor no tiene ninguna publicacion en este blog");
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
