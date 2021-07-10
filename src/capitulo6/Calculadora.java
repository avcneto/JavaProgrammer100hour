package capitulo6;

/**
 * A classe Calculadora realiza operações de soma, subtração, divisão e
 * multiplicação
 * 
 * @author Aderson
 *
 */
public class Calculadora {

	/**
	 * O metodo somar recebe dois valores e devolve a soma deles
	 * 
	 * @param valor1
	 * @param valor2
	 * @return retornar um valor do tipo float referente a soma de dois valores
	 */
	public float somar(float valor1, float valor2) {

		return (valor1 + valor2);
	}

	/**
	 * O metodo subtrair recebe dois valores e devolve a o resultado da subtração
	 * 
	 * @param valor1
	 * @param valor2
	 * @return retorna um valor do tipo float referente a subtração de dois valor
	 */

	public float subtrair(float valor1, float valor2) {

		return (valor1 - valor2);
	}

	public float subtrair(double valor1, double valor2) {

		return (float) (valor1 - valor2);
	}

	public float subtrair(int valor1, double valor2) {

		return (float) (valor1 - valor2);
	}

	/**
	 * O metodo multiplicar recebe dois valores e devolve o resultado da
	 * multiplicação
	 * 
	 * @param valor1
	 * @param valor2
	 * @return retorna um valor do tipo float referente a multiplicação de dois
	 *         valores
	 */
	public float multiplicar(float valor1, float valor2) {

		return (valor1 * valor2);
	}

	/**
	 * O metodo dividir recebe dois valores e devolve o valor da divisão
	 * 
	 * @param valor1
	 * @param valor2
	 * @return retorna um valor do tipo float referente a divisão de dois valores
	 */

	public float dividir(float valor1, float valor2) {

		return (valor1 / valor2);
	}
}
