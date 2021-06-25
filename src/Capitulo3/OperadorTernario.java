package capitulo3;

public class OperadorTernario {
	public static void main(String[] args) {
		int a = 2, b = 4;
		String operadorTernario = a + b > b - a ? "Sim" : "Não";

		System.out.println(operadorTernario);
	}

}
