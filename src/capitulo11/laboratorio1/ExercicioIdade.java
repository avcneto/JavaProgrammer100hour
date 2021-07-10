package capitulo11.laboratorio1;

import java.util.Scanner;

public class ExercicioIdade {
	public static void main(String[] args) {

		try {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o ano atual");
			int anoAtual = leitor.nextInt();
			System.out.print("Digite o ano de nascimento: ");
			String ano = leitor.next();
			leitor.close();
			int anoNumerico = Integer.parseInt(ano);

			int idade = anoAtual - anoNumerico;

			System.out.println("Idade " + idade);

		} catch (NumberFormatException e) {
			System.out.println("Digite apenas números inteiro");
			e.printStackTrace();

		}

	}

}
