package capitulo4;

import java.util.Scanner;

public class TabuadaWhile {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o número da tabuada: ");
		int numero = leitor.nextInt();

		int i = 0;
		while (i < 11) {

			int resultado = numero * i;
			System.out.println(numero + " * " + i + " : " + resultado);
			i++;

		}
	}

}
