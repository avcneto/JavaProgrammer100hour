package capitulo9.polimorfismo;

public class ExemploInstanceOf {
	public static void main(String[] args) {

		String a = "teste";

		if (a instanceof String) {
			System.out.println(a + " -� uma variavel do tipo String");
		} else {
			System.out.println(a + " -N�o � uma variavel do tipo String");
		}
	}

}
