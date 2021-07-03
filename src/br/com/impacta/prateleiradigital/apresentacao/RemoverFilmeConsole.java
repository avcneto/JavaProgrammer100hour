package br.com.impacta.prateleiradigital.apresentacao;

import javax.swing.JOptionPane;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class RemoverFilmeConsole {
	RemoverFilmeConsole() {
	}

	public static void main(String[] args) {

		String titulo = JOptionPane.showInputDialog(null, "Digite o Título do Filme:", "REMOÇÃO DE FILME", 3);// QUESTION_MESSAGE
																												// Icone
																												// de
																												// pergunta.
		Filme filme = new Filme();
		filme.setTitulo(titulo);
		FilmeController controller = new FilmeController();
		controller.remover(filme);
		JOptionPane.showMessageDialog(null, "Filme " + titulo + " removido com sucesso:", "REMOÇÃO DE FILME", 1);
	}
}
