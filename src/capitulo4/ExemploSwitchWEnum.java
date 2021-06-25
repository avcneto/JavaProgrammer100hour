package capitulo4;


public class ExemploSwitchWEnum {
	public static void main(String[] args) {
		int mes = 2;

		switch (mes) {
		case 1: System.out.println(Meses.JANEIRO); break;
		case 2: System.out.println(Meses.FEVEREIRO); break;
		case 3: System.out.println(Meses.MARCO); break;
		case 4: System.out.println(Meses.ABRIL); break;
		case 5: System.out.println(Meses.MAIO); break;
		case 6: System.out.println(Meses.JUNHO); break;
		case 7: System.out.println(Meses.JULHO); break;
		case 8: System.out.println(Meses.AGOSTO); break;
		case 9: System.out.println(Meses.SETEMBRO); break;
		case 10: System.out.println(Meses.OUTUBRO); break;
		case 11: System.out.println(Meses.NOVEMBRO); break;
		case 12: System.out.println(Meses.DEZEMBRO); break;
		default: System.out.println(Meses.MES_NAO_EXISTE);

		}
	}
}
