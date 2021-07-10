package capitulo14;

public class Execultando2 {
	public static void main(String args[]) {
		String mensagem = "O mundo é redondo";

		Exemplofuncional2 funcao = () -> System.out.println(mensagem);
		funcao.exibeDados();
	}

}
