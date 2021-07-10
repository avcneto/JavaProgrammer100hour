package capitulo11;

public class Teste {
	public static void main(String args[]) throws Exception {
		try {
			metodo1();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void metodo1() throws Exception {
		try {
			metodo2();
		} catch (Exception e) {
			throw new Exception("Exce��o enviada no metodo1", e);
		}
	}

	public static void metodo2() throws Exception {
		throw new Exception("Exce��o enviada no metodo2");
	}

}
