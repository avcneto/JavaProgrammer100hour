package capitulo6;

/**
 * A classe Calculadora realiza opera��es de soma, subtra��o, divis�o e
 * multiplica��o
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
	 * O metodo subtrair recebe dois valores e devolve a o resultado da subtra��o
	 * 
	 * @param valor1
	 * @param valor2
	 * @return retorna um valor do tipo float referente a subtra��o de dois valor
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
	 * multiplica��o
	 * 
	 * @param valor1
	 * @param valor2
	 * @return retorna um valor do tipo float referente a multiplica��o de dois
	 *         valores
	 */
	public float multiplicar(float valor1, float valor2) {

		return (valor1 * valor2);
	}

	/**
	 * O metodo dividir recebe dois valores e devolve o valor da divis�o
	 * 
	 * @param valor1
	 * @param valor2
	 * @return retorna um valor do tipo float referente a divis�o de dois valores
	 */

	public float dividir(float valor1, float valor2) {

		return (valor1 / valor2);
	}
}
