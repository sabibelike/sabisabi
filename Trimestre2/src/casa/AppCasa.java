package casa;

public class AppCasa {
	public static void main(String[] args) {
		Chalet c = new Chalet("Lopez", 3, 50, 50);
		Cabaña ca = new Cabaña("Hoyos", 7, 70, true);
		Atico a = new Atico("tengo", 5, 50, 2);
	
		c.mostrarInfo();
		ca.mostrarInfo();
		a.mostrarInfo();
	}
}
