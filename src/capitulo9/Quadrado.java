package capitulo9;

public class Quadrado extends Poligono {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double resultado = lado * lado;
		System.out.println("Area do quadrado: " + resultado);

		return resultado;
	}

}
