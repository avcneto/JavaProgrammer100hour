package capitulo4;

import java.util.Scanner;

public class Laboratorio3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o ano atual: ");

		int anoAtual = leitor.nextInt();
		System.out.println();

		for (int ano = 1930; ano <= anoAtual; ano += 4) {

			if (ano == 1942 || ano == 1946) {
				continue;
			}
			System.out.println("Copa do mundo de " + ano);

		}

	}

}
