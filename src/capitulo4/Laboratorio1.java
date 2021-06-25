package capitulo4;

import java.util.Scanner;

public class Laboratorio1 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = leitor.nextInt();
		if (numero % 2 != 0 & numero % 3 != 0) {
			System.out.println("O número " + numero + " é primo!");
		} else {
			System.out.println("O número " + numero + "não é primo!");
		}

	}
}