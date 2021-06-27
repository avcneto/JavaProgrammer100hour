package capitulo4;

import java.util.Scanner;

public class ImprimirNumeroCubo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int numero = leitor.nextInt();
		int i = 1;
		for (; i == 1;) {
			double resultado = numero * numero * numero;
			System.out.println(numero + " ao cubo é: " + resultado);

			System.out.println("Digite 0 para sair");
			i = leitor.nextInt();

			System.out.println("Informe o proximo numero");
			numero = leitor.nextInt();
			leitor.close();

		}

	}

}
