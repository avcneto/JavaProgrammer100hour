package capitulo6;

public class Calculadora {
	public float somar(float valor1, float valor2) {

		return (valor1 + valor2);
	}

	public float subtrair(float valor1, float valor2) {

		return (valor1 - valor2);
	}

	public float subtrair(double valor1, double valor2) {

		return (float) (valor1 - valor2);
	}

	public float subtrair(int valor1, double valor2) {

		return (float) (valor1 - valor2);
	}

	public float multiplicar(float valor1, float valor2) {

		return (valor1 * valor2);
	}

	public float dividir(float valor1, float valor2) {

		return (valor1 / valor2);
	}
}
