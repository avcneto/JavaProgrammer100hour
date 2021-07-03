package capitulo9;

public class Triangulo extends Poligono {
	private double base, altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double resultado = (base * altura) / 2;
		System.out.println("Area do triangulo: " + resultado);
		return resultado;
	}

}
