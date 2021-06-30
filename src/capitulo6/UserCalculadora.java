package capitulo6;

import java.util.Scanner;

public class UserCalculadora {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		float valor1 = leitor.nextFloat();

		System.out.print("Digite o segundo valor: ");
		float valor2 = leitor.nextFloat();

		Calculadora cal = new Calculadora();

		System.out.println("Digite a opção do operador: \n1 - soma\n2- subtrair\n3- multiplicar\n4 - dividir");
		int operacao = leitor.nextInt();
		leitor.close();

		switch (operacao) {
		case 1:
			System.out.println(valor1 + " + " + valor2 + " = " + cal.somar(valor1, valor2));
			break;
		case 2:
			System.out.println(valor1 + " - " + valor2 + " = " + cal.subtrair(valor1, valor2));
			break;
		case 3:
			System.out.println(valor1 + " x " + valor2 + " = " + cal.multiplicar(valor1, valor2));
			break;
		case 4:
			System.out.println(valor1 + " / " + valor2 + " = " + cal.dividir(valor1, valor2));
			break;
		default:
			System.out.println("Operação invalida");
		}

	}

}
