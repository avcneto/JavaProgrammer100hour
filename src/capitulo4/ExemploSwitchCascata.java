package capitulo4;

public class ExemploSwitchCascata {
	public static void main(String[] args) {
		int hora = 6;

		if (hora <= 24) {

			switch (hora) {
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
				System.out.println("Bom dia!");
				break;
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
				System.out.println("Boa tarde!");
				break;
			default:
				System.out.println("Boa noite!");

			}
		} else {
			System.out.println("Hora invalida!");
		}
	}
}
