package br.com.impacta.prateleiradigital.apresentacao;

import javax.swing.JOptionPane;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class ConsultarFilmeConsole {
	public static void main(String args[]) {
		System.out.println("*** CONSULTA DE FILME ***");
		System.out.println("Titulo(total ou parcial)");
		String titulo = JOptionPane.showInputDialog(null, "Titulo - (total ou parcial):");
		String genero = JOptionPane.showInputDialog(null, "Genero:");
		int anoDe = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano (de):"));
		int anoAte = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano (ate):"));

		FilmeController controller = new FilmeController();
		Filme[] filmes = controller.consultarFilme(titulo, genero, anoDe, anoAte);

		System.out.println("...");
		System.out.println("Filme consultado com sucesso!");
	}

}
