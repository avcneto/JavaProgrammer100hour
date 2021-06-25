package Capitulo3;

import java.util.Scanner;

public class Laboratorio2 {
	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();

		boolean numeroPar = (valor % 2) == 0 ? true : false;

		System.out.println("Número par: " + numeroPar);
	}

}
