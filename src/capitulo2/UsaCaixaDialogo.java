package capitulo2;

import javax.swing.JOptionPane;

public class UsaCaixaDialogo {
	public static void main(String[] args) {

		String nome, time;
		int idade;

		nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		time = JOptionPane.showInputDialog(null, "Digite seu time: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

		//		JOptionPane.showMessageDialog(null, "Nome digitado: " + nome );
		//		JOptionPane.showMessageDialog(null, "Time digitado: " + time);
		//		JOptionPane.showMessageDialog(null, "idade digitada: " + idade);

		JOptionPane.showMessageDialog(null, "\nNome digitado: " + nome +
				"\nseu time: " + time +
				"\nsua idade: " + idade );

		// int rep = JOptionPane.showConfirmDialog(null, "Deseja continuar");
		// JOptionPane.showMessageDialog(null, "Nome Digitado " + nome + "\nrep" + rep);

	}

}
