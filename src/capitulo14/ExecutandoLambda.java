package capitulo14;

public class ExecutandoLambda {
	public static void main(String[] args) {

		OperacaoAritimetica operacao = (x, y) -> x + y;
		double resultado = operacao.execute(15.8, 8.3);
		System.out.println(resultado);
	}

}
