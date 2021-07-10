package capitulo14;

public class Execultado9 {
	public static void main(String args[]) {
		Produto produto = new Produto("Sapato social", 42);

		OperacaoAritimetica funcao = produto::aumentarPreco;

		System.out.println("Valor final " + funcao.execute(65.5, 8.5));
	}

}
