package capitulo14;

import javax.swing.JOptionPane;

public class Execultado2Grau {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));

		Operacao2Grau x1 = (valorA, valorB, valorC) -> (-b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
		Operacao2Grau x2 = (valorA, valorB, valorC) -> (-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
		double r1 = x1.executar(a, b, c); // x2 -4x -5 = 0
		double r2 = x2.executar(a, b, c); // x2 -4x -5 = 0
		System.out.println("x1 = " + r1 + "\nx2 = " + r2);
	}
}
