package capitulo4;

import java.util.Scanner;

public class ClassificacaoDeIdade {
	public static void main(String[] args) {
		// crie um programa que receba a idade de uma pessoa
		// classifique conforme abaixo
		// 0 - 2 - BEBE
		// 2 - 11 - criança
		// 11 - 18 adolecente
		// 18-60 = adulto
		// 60-150 = idoso
		// >150 ou < 0 = valor invalido

		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe sua idade: ");
		int idade = leitor.nextInt();

		if (idade >= 0 && idade < 2) {
			System.out.println("Bebê");

		} else if (idade >= 2 && idade < 11) {
			System.out.println("Adolecente");

		} else if (idade >= 11 && idade < 18) {
			System.out.println("Adulto");

		} else if (idade >= 18 && idade < 60) {
			System.out.println("Idoso");

		} else if (idade >= 60 && idade < 150) {

		} else {
			System.out.println("Idade invalida");
		}

	}

}
