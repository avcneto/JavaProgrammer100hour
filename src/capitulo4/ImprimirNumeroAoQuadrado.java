package capitulo4;

import java.util.Scanner;

public class ImprimirNumeroAoQuadrado {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int numero = leitor.nextInt();
		int sair;

		do {
			int numeroAoQuadrado = numero * numero;
			System.out.println(numero + " ao quadrado é: " + numeroAoQuadrado);

			if (numero % 2 == 0) {
				System.out.println(numero + " é numero par");
			} else {
				System.out.println(numero + " é numero impar");
			}

			System.out.println("\nDigite 1 para sair");
			sair = leitor.nextInt();
			System.out.println("Informe o próximo número: ");
			numero = leitor.nextInt();
		} while (sair != 1);

		leitor.close();

	}

}
