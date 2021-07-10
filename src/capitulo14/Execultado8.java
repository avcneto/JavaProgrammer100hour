package capitulo14;

public class Execultado8 {
	public static void main(String args[]) {
		OperacaoAritimetica funcao = FinancialUtils::calculaJuros;

		System.out.println("Valor final " + funcao.execute(1200, 8.3));
	}

}
