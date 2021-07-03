package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class SortearConsole {
	public SortearConsole() {
	} // Construtor Padr�o

	public static void main(String[] args) {
		String genero = JOptionPane.showInputDialog(null, "Digite o G�nero do Filme:", "SORTEIO DE FILME", 3);// QUESTION_MESSAGE
																												// Icone
																												// de
																												// pergunta.
		String diretor = JOptionPane.showInputDialog(null, "Digite o Diretor do Filme:", "SORTEIO DE FILME", 3);
		double notaMin = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Digite a NOTA do Filme:", "SORTEIO DE FILME", 3));
		System.out.println("N�mero de votos acima de:");
		int votosMin = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o N�mero de Votos do Filme:", "SORTEIO DE FILME", 3));

		FilmeController controller = new FilmeController();
		Filme filmeSorteado = controller.sortear(genero, diretor, notaMin, votosMin);

		System.out.println("...");
//		if (filmeSorteado != null) {
//			JOptionPane.showMessageDialog(null, "Filme Sorteado:" + filmeSorteado, "SORTEIO DE FILME", 1);
//		} else {
//			System.out.printf("Filme n�o foi sorteado!");
//		}
	}

}
