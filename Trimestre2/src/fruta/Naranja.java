package fruta;

public class Naranja extends Fruta{
	private int numGajos;

	public Naranja(int numGajos) {
		super("Naranja", "naranja", 4, true);
		this.numGajos = numGajos;
	}
	 public void info() {
		 super.info();
		 System.out.println("La naranja tiene este numero de gajos "+this.numGajos);
	 }

}
