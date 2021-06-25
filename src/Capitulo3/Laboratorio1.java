package Capitulo3;

import java.util.Scanner;

public class Laboratorio1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);

		int valor1, valor2, resultado;

		System.out.print("Digite o primeiro valor: ");
		valor1 = leitor.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = leitor.nextInt();

		resultado = valor1 + valor2;

		System.out.println("Resultado da soma: " + resultado);
	}

}
