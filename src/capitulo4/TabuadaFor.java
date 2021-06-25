package capitulo4;

import java.util.Scanner;

public class TabuadaFor {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor: ");
		int numero = leitor.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(numero + " X " + i + ": " + i * numero);
			System.out.println("----------");
		}
	}
}
