package codigoClase2;

public class clase09 {
	public static void main(String[] args) {
	
		int [] num= new int [5];
		int num1=5;
		//try {
		//	System.out.println(num[55]);
		//	System.out.println(num1/0);
		//} 
		//catch (ArrayIndexOutOfBoundsException e){
		//	System.out.println("Ha ocurrido un error(array): "+e);
		//} 
		//catch (ArithmeticException e){
		//	System.out.println("Ha ocurrido un error(dividir/0): "+e);
		//} 
		//catch (Exception e) {
		//}
		//finally {
		//	System.out.println("Este es el bloque finally");
		//}
		//System.out.println("Esto si que se va a ejecutar");
		
		
		
		
		//int [] num2= new int [-5];
		//try {
		//	System.out.println(num2);
		//}
		//catch (NegativeArraySizeException e) {
		//	System.out.println("Ha ocurrido un error en array: "+e);
		//}
		//finally {
		//	System.out.println("Este es el bloque finally");
		//}
		//System.out.println("Esto si que se ejecuta");
		
		
		//String txt="hola profe jeje";
		//try {
		//	System.out.println(txt.charAt(26));
		//}
		//catch (StringIndexOutOfBoundsException e) {
		//	System.out.println("Ha ocurrido un error en el string: "+e);
		//}
		//finally {
		//	System.out.println("finally");
		//}
		//System.out.println("----");
		
		
		//String txt1= null;
		//System.out.println(txt1.length());
		
		//System.out.println(Float.parseFloat(txt1));	
	
		try {
			dividirNum(5,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void dividirNum(int x1, int x2) throws Exception {
	try {
		System.out.println("La division es: "+x1/x2);
	} catch (Exception e) {
		System.out.println(e);
		throw new Exception("Has intentaado dividir entre 0");
	} 	
	finally {
		System.out.println("Hola");
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
