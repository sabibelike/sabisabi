package vehiculo;

public class AppVehiculo {
	public static void main(String[] args) {
		
		Automovil a = new Automovil("RollsRoyce", "Ghost", 2024, 4);
		Motocicleta m = new Motocicleta("Kawazaki", "Kawaii", 2023, "Deportiva");
		
		
		a.mostrarInfo();
		m.mostrarInfo();
		
		a.arrancar();
		 
		m.acelerar(5);
		
	}
}
