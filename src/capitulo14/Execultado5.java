package capitulo14;

public class Execultado5 {
	public static void main(String args[]) {
		ExemploFuncional1 funcao = (n, i, s) -> System.out.println("Funcionario " + n + " recebe salario " + s);
		funcao.exibeDados("Manuel", 45, 5500.15);
	}

}
