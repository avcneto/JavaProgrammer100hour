package capitulo9;

import javax.swing.JOptionPane;

public class CalculoAreaPoligonos {
	public static void main(String[] args) {
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado do quadrado"));
		Quadrado quadrado = new Quadrado(lado);
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do triangulo"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do triangulo"));

		Triangulo triangulo = new Triangulo(altura, base);
		quadrado.calcularArea();
		triangulo.calcularArea();

	}

}
