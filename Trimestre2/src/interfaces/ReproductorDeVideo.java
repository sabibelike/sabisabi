package interfaces;

public class ReproductorDeVideo implements ReproductorMultimedia{
	//atributos
	private boolean reproduciendo;
	private String archivoActual;
	
	//constructor
	public ReproductorDeVideo() {
		this.reproduciendo = false;
		this.archivoActual = "";
	}
	
	@Override
	public void reproducir (String archivo) {
		this.reproduciendo = true;
		archivoActual = archivo;
		System.out.println("Reproduciendo video: "+archivo);
	}

	@Override
	public void pausa() {
		if (reproduciendo) {
			this.reproduciendo = false;
			System.out.println("El video ha sido pausado");
		} else {
			System.out.println("Tontito el video ya estaba pausado");
		}
	}

	@Override
	public void detener() {
		if(reproduciendo) {
			this.reproduciendo = false;
			System.out.println("Se ha detenido la reproduccion del archivo: "
					+archivoActual);
		}
	}

	@Override
	public void siguiente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anterior() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajustarVolumen(int volumen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String informacion() {
		return ("Archivo actual: "+archivoActual);
		
	}

	@Override
	public void duracion() {
		// TODO Auto-generated method stub
		
	}
	
	//getters and setters
	public boolean isReproduciendo() {
		return reproduciendo;
	}

	public void setReproduciendo(boolean reproduciendo) {
		this.reproduciendo = reproduciendo;
	}

	public String getArchivoActual() {
		return archivoActual;
	}

	public void setArchivoActual(String archivoActual) {
		this.archivoActual = archivoActual;
	}


}
