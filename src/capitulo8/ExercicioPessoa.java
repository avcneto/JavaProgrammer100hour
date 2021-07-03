package capitulo8;

import javax.swing.JOptionPane;

public class ExercicioPessoa {
	public static void main(String args[]) {

		int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("quantidade: "));
		Pessoa pessoas[] = new Pessoa[tamanhoVetor];

		for (int i = 0; i < pessoas.length; i++) {

			pessoas[i] = new Pessoa();
			pessoas[i].nome = JOptionPane.showInputDialog("Digite o nome: ");

			pessoas[i].nome = JOptionPane.showInputDialog("Digite altura:: ");

			pessoas[i].nome = JOptionPane.showInputDialog("Digite o peso: ");

		}

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i]);
		}

	}

}
