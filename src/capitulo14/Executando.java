package capitulo14;

public class Executando {
	public static void main(String args[]) {
		OperacaoAritimetica soma = new Soma();
		OperacaoAritimetica subtracao = new Subtracao();
		OperacaoAritimetica multiplicacao = new Multiplicacao();
		OperacaoAritimetica divisao = new Divisao();

		double resultadoSoma = soma.execute(15.8, 8.3);
		double resultadoSubtracao = subtracao.execute(15.8, 8.3);
		double resultadoMultiplicacao = multiplicacao.execute(15.8, 8.3);
		double resultadoDivisao = divisao.execute(15.8, 8.3);

		System.out.println("Resultado da soma: " + resultadoSoma);
		System.out.println("Resultado da subtração: " + resultadoSubtracao);
		System.out.println("Resultado da multiplicacao: " + resultadoMultiplicacao);
		System.out.println("Resultado da divisão: " + resultadoDivisao);

	}

}
