package br.com.impacta.prateleiradigital.apresentacao;

import javax.swing.JOptionPane;

import br.com.impacta.prateleiradigital.controle.FilmeController;

public class CriarFilmeConsole {
	public CriarFilmeConsole() {
	}

	public static void main(String[] args) {
		String titulo = JOptionPane.showInputDialog("Digite o Título do Filme: ");
		String diretores = JOptionPane.showInputDialog("Digite o(s) Diretores: ");
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Filme:"));
		int duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do Filme em minutos (Ex.: 180):"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano do Filme:"));
		String generos = JOptionPane.showInputDialog("Digite o Gênero do Filme:");
		int votos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos do Filme:"));
		String url = JOptionPane.showInputDialog("Digite a URL do Filme:");
		FilmeController controller = new FilmeController();
		controller.criarFilme(titulo, diretores, nota, duracao, ano, generos, votos, url);
		JOptionPane.showMessageDialog(null,
				"Filme criado com sucesso!" + "\nTítulo: " + titulo + "\nDiretor: " + diretores + "\nNota: " + nota
						+ "\nDuração: " + duracao + "\nAno: " + ano + "\nGênero: " + generos + "\nVotos: " + votos
						+ "\nURL: " + url,
				"Cadastro de Filmes", JOptionPane.INFORMATION_MESSAGE);
	}
}
