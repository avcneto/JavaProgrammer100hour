package capitulo4;

import java.util.Scanner;

public class Laboratorio1 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int numero = leitor.nextInt();
		leitor.close();
		if (numero % 2 != 0 & numero % 3 != 0) {
			System.out.println("O n�mero " + numero + " � primo!");
		} else {
			System.out.println("O n�mero " + numero + "n�o � primo!");
		}

	}
}