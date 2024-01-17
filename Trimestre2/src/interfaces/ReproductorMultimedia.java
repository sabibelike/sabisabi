package interfaces;

public interface ReproductorMultimedia {
	
	
	//Reproducir multimedia
	void reproducir(String archivo);
	
	//Pausa multimedia
	void pausa();
	
	//detener miltimedia
	void detener();
	
	//siguiente multimedia
	void siguiente();
	
	//anterior multimedia
	void anterior();
	
	//ajustar el volumen en el multimedia
	void ajustarVolumen(int volumen);
	
	//obtener info de la multimedia
	String informacion();
	
	//obtener la duracion 
	void duracion();
}
