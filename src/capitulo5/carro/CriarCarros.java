package capitulo5.carro;

import javax.swing.JOptionPane;

public class CriarCarros {
	public static void main(String[] args) {
		int resp = 0;
		do {
			Garagem g = new Garagem();
			int escolha = Integer
					.parseInt(JOptionPane.showInputDialog("Digite 1 para carro passeio ou 2 para  utilitário: "));
			if (escolha == 1) {
				g.carroPasseio = new Carro();
				g.carroPasseio.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
				g.carroPasseio.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
				g.carroPasseio.setPotenciaMotor(
						Double.parseDouble(JOptionPane.showInputDialog("Digite a potência do carro: ")));
				System.out.println("Carro de Passeio: ");
				System.out.println("Cor: " + g.carroPasseio.getCor());
				System.out.println("Modelo: " + g.carroPasseio.getModelo());
				System.out.println("Potência: " + g.carroPasseio.getPotenciaMotor());
				System.out.println("---------------------------------------");
			} else if (escolha == 2) {
				g.carroUtilitario = new Carro();
				g.carroUtilitario.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
				g.carroUtilitario.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
				g.carroUtilitario.setPotenciaMotor(
						Double.parseDouble(JOptionPane.showInputDialog("Digite a potência do carro: ")));

				System.out.println("Carro Utilitário: ");
				System.out.println("Cor: " + g.carroUtilitario.getCor());
				System.out.println("Modelo: " + g.carroUtilitario.getModelo());
				System.out.println("Potência: " + g.carroUtilitario.getPotenciaMotor());
				System.out.println("---------------------------------------");
			}
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		} while (resp == 0);
	}
}