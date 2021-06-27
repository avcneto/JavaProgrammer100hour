package capitulo4;

import java.util.Scanner;

public class TotalIdadePessoa {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a idade");
		int idade = leitor.nextInt();

		int contador1 = 0, contador5 = 0;

		while (idade != 99) {

			if (idade < 21) {
				contador1++;
			}

			if (idade > 50) {
				contador5++;
			}
			System.out.println("Informe a idade ou digite 99 para sair");
			idade = leitor.nextInt();
		}

		leitor.close();
		System.out.println("total de pessoas com 21 anos: " + contador1);
		System.out.println("total de pessoas com 21 anos: " + contador5);

	}

}
