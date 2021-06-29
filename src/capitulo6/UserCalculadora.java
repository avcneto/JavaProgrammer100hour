package capitulo6;

import java.util.Scanner;

public class UserCalculadora {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int valor1 = leitor.nextInt();

		System.out.print("Digite o segundo valor: ");
		int valor2 = leitor.nextInt();
		leitor.close();

		Calculadora cal = new Calculadora();
		int resultado = cal.somar(valor1, valor2);
		System.out.println(valor1 + " + " + valor2 + " = " + resultado);
	}

}
