package clases;

public class Main {
	public static void main(String[] args) {
		Blog blog = new Blog("Chikilukis");
	
		Publicacion publicacion1 = new Publicacion("Que lacreo", "Lo veo y no lo creo jeje", "Sabi sabi", 19);
		Publicacion publicacion2 = new Publicacion("No hay vida", "Queso, mortadela y empieza", "La chiqui popular", 13);
		Publicacion publicacion3 = new Publicacion("Holi", "Si te he fallado te pido perdon", "Sabi sabi", 18);
	
		blog.agregarPublicacion(publicacion1);
		blog.agregarPublicacion(publicacion2);
		blog.agregarPublicacion(publicacion3);
		
		blog.agregarComentario(publicacion1, (new Comentario("Efectivamente lo veo y no lo creo", "sabix", 19)));
		blog.agregarComentario(publicacion2, (new Comentario("Y empieza ta ta ta", "sabibu", 19)));
		blog.agregarComentario(publicacion3, (new Comentario("De la unica forma que se", "sabisad", 19)));
		
		
		//mostrar info de las publicaciones y copmentarios 
		blog.buscarPubliPorAutor("Sabi sabi");
	}
	
	
}


