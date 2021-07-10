package capitulo14;

public class Execultando4 {

	public static void main(String args[]) {

		ExemploFuncional1 funcao = (n, i, s) -> {
			String nomeMaiusculo = n.toUpperCase();
			if (i < 18) {
				System.out.println("funcionario não pode ser menor de idade");
			} else {
				System.out.println("Funcionario " + nomeMaiusculo + " recebe salario " + s);
			}
		};
		funcao.exibeDados("Manuel", 45, 5500.15);
	}

}
