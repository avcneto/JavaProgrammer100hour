package capitulo10;

import javax.swing.JOptionPane;

public class ExecultadoLigarTudo {
	public static void main(String args[]) {
		Eletrodomestico a, b, c, d, e, f, g;

		a = new Geladeira();
		b = new Televisao();
		c = new Televisao();
		d = new Geladeira();
		e = new Microondas();
		f = new Televisao();
		g = new Microondas();

		int aparelhoLigado = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para ligar e 0 para desligar"));
		if (aparelhoLigado == 1) {
			Eletrodomestico.ligarTudo(a, b, c, d, e, f, g);
		} else if (aparelhoLigado == 0) {
			Eletrodomestico.desligarTudo(a, b, c, d, e, f, g);
		} else {
			System.out.println("Opção invalida!!!");
		}

	}

}
