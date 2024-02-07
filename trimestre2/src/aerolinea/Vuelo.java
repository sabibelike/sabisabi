package aerolinea;

import java.util.HashMap;

public class Vuelo {
	private String numero;
	private String fechaHora;
	private Ciudades origen;
	private Ciudades destino;
	private HashMap<String,Boolean> asientos;
	
	public Vuelo(String numero, String fechaHora, Ciudades origen, Ciudades destino) {
		this.numero = numero;
		this.fechaHora = fechaHora;
		this.origen = origen;
		this.destino = destino;
		this.asientos = new HashMap<String, Boolean>();
	}
	
	public void agregarAsientos(int numeroAsientos) {
		for (int i = 0; i<=numeroAsientos; i++) {
			asientos.put(i+"", true);
		}
	}
	
	public String seleccionar() {
		for(String numero : asientos.keySet()) {
			if(asientos.get(numero)) {
				asientos.put(numero, false);
				return numero;
			}
		}
		System.out.println("No hay asientos disponibles");
		return null;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Ciudades getOrigen() {
		return origen;
	}

	public void setOrigen(Ciudades origen) {
		this.origen = origen;
	}

	public Ciudades getDestino() {
		return destino;
	}

	public void setDestino(Ciudades destino) {
		this.destino = destino;
	}

	public HashMap<String, Boolean> getAsientos() {
		return asientos;
	}

	public void setAsientos(HashMap<String, Boolean> asientos) {
		this.asientos = asientos;
	}


	
	
	
	
	
	
}
