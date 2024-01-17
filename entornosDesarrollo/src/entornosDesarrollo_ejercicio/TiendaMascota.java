package entornosDesarrollo_ejercicio;

public class TiendaMascota {

	public static void main(String[] args) {
	//cliente y mascota añadidos jeje
		Cliente cliente1 = new Cliente ("00741","Pedro");
		Mascota mascota1 = new Mascota ("01596","Rocco","Cacri");
		
		//vincular la mascota con el cliente
		cliente1.añadirMascota(mascota1);
		
		cliente1.listarMascota();

	}
}
