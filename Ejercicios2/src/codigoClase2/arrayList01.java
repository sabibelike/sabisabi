package codigoClase2;

import java.util.ArrayList;
import java.util.List;

public class arrayList01 {
	public static void main(String[] args) {
		//Formas de declarar arrayList
		
		ArrayList<String> arrayList= new ArrayList<String>();
		List<Integer> lista = new ArrayList<Integer>();
		
		//Para añadir elementos de forma que vayan siendo introducidos utilizamos la herramienta add
		
		arrayList.add("txt1");
		arrayList.add("txt2");
		arrayList.add("txt3");
		arrayList.add("txt4");
		arrayList.add("txt5");
		arrayList.add("txt6");
		
		//para añadir un ellemento en un indice especifico 
		
		arrayList.add(3, null);
		//arrayList.add(10;"aaa");
		
		//Mostramos la lista completa
		System.out.println("Array list completa: "+arrayList);
		
		//Para buscar un dato en concreto en la list usamos la herramienta get
		System.out.println("\nEn la posicion 2 tenemos: "+arrayList.get(2));
		
		//Para mirar el tamaño del array usando el size
		System.out.println("\nEl tamaño de la lista es: "+arrayList.size());
		
		//Sustituimos una posicion en la lista con el 
		arrayList.set(0,"Nuevo txt");
		System.out.println("\nAhora la poscion 0 cambio: "+arrayList);
		
		//Para limpiar toda la lista 
		arrayList.clear();
		System.out.println("\nAhora la lista esta vacia"+arrayList);
		
		//Preguntar si la lista está vacia con el isEmpty devuelve true o false
		System.out.println("\nLa lista está vacia?: "+arrayList.isEmpty());
		
		//Mirar si la lista contiene algo en especifico 
		System.out.println("\nDentro de la lista contiene(\"Hola buenos dias\"): "+arrayList.contains("Hola buennos dias"));
		
		//Miramos en que posicion de la lista esta el siguiente elemento (si no esta ponndra -1)
		//tener en cuenta que si esta repetido te mostrara la posicion del primero que encuentre
		System.out.println(arrayList.indexOf("aaaaaa"));
		arrayList.add("txt1");
		arrayList.add("txt2");
		arrayList.add("txt3");
		arrayList.add("txt4");
		arrayList.add("txt5");
		arrayList.add("txt6");
		
		System.out.println("\ntxt3 se encuentra en la posicion: "+arrayList.indexOf("txt3"));
		//agregamos otro elemento y miramos si se repite o si solo nos da el primero que encuentre
		arrayList.add("txt5");
		System.out.println("\ntxt5 se encuentra en la poscion: "+arrayList.indexOf("txt5"));
		
		//si queremos empezar desde atras hacia adellante usaremos last indexOf
		System.out.println("\ntxt5 se encuentra desde el final en la posicion: "+arrayList.lastIndexOf("txt5"));
		
		
		
		
		
		
		
	}

}
