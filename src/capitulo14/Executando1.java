package capitulo14;

public class Executando1 {

	public static void main(String args[]) {
		ExemploFuncional1 funcao = (n, i, s) -> System.out.println(
				"Parab�ns " + n.toUpperCase() +
				" pelos seus " + i + 
				" anos de vida. seu novo salario �: " + s);

		funcao.exibeDados("Manuel", 45, 5500.15);
	}

}
