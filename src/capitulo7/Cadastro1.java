package capitulo7;

import javax.swing.JOptionPane;

public class Cadastro1 {
	private static final String CONTINUAR = "s";

	public static void main(String args[]) {

		String continuar = "n";
		do {
			String valores[] = { "Nome + Sobrenome", "Nome + Sobrenome + Idade", "Nenhum" };
			Object escolha = JOptionPane.showInputDialog(null, "O que deseja cadastrar: ", "Escolha a Operação",
					JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

			switch (escolha.toString()) {
			case "Nenhum":
				new Cadastro().mostrar();
				break;
			case "Nome + Sobrenome":
				Cadastro cad2 = new Cadastro(JOptionPane.showInputDialog(null, "Digite o nome:"),
						JOptionPane.showInputDialog(null, "Digite o sobrenome:"));
				cad2.mostrar();
				break;
			case "Nome + Sobrenome + Idade":
				Cadastro cad3 = new Cadastro(JOptionPane.showInputDialog(null, "Digite o nome:"),
						JOptionPane.showInputDialog(null, "Digite o sobrenome:"),
						Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade:")));

				cad3.mostrar();
				break;
			default:
				System.out.println("Opcao invalida");

			}

			continuar = JOptionPane.showInputDialog(null, "Para continuar digite: s");

		} while (CONTINUAR.equalsIgnoreCase(continuar));

	}

}
