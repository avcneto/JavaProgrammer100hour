package capitulo9.polimorfismo;

public class ExemploInstanceOf {
	public static void main(String[] args) {

		String a = "teste";

		if (a instanceof String) {
			System.out.println(a + " -É uma variavel do tipo String");
		} else {
			System.out.println(a + " -Não é uma variavel do tipo String");
		}
	}

}
