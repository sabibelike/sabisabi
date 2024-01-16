package codigoClase2;

public class ejercicio04 {
	public static void main(String[] args) {
		
		/*pedir un numero y sumar los numeros pares hata ese numero*/
		sumarPares(10);
		areaCirculo(63.61);
		
		String txt= "Hola buenos dias";
		String txt1= "bebesita uah";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.replace(" ",""));
		
		reversoTxt(txt);
		reversoTxt(txt1);
		
	}
	
	public static void sumarPares(int numero) {
		int suma=0;
		while(numero>=2) {
			if(numero%2==0) {
				suma+=numero;
			}
			numero--;
		}
		
	}
	
	public static void areaCirculo(double r) {
		System.out.println("El area de un circulo de radio "+r+" es: "+r*r*3.1416);
	}
	
	public static void reversoTxt(String txt) {
		String txtAlReves="";
		for(int i=txt.length()-1;i>=0;i--) {
			txtAlReves+=txt.charAt(i);
		}
		System.out.println(txtAlReves);
	}
	
	
	
	
	
	
	
}


