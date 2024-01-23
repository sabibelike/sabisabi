package fruta;

public class App {
	public static void main(String[] args) {
		Fruta f= new Fruta("Platano", "Amarillo", 80, true);
		f.info();
		System.out.println("-----------------------------");
		Naranja n= new Naranja(8);
		n.info();
	}
	

}
