package codigoClase2;

public class CodigoPruebas {
	public static void main(String[] args) {
		System.out.println(DiasSemana.LUNES);
		DiasSemana ds=DiasSemana.LUNES;
		System.out.println(ds.getValor());
		
		for (DiasSemana d: DiasSemana.values()) {
			System.out.println(d);
		}
		
		System.out.println(DiasSemana.valueOf("LUNES").getValor());
		
		
		/*switch(ds) {
		case DOMINGO:
			break;
		case JUEVES:
			break;
		case LUNES:
			break;
		case MARTES:
			break;
		case MIERCOLES:
			break;
		case SABADO:
			break;
		case VIERNES:
			break;
		default:
			break;
		*/
	}
}

