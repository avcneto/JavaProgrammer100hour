package capitulo11;

public class ExemploNumberFormat {
	public static void main(String[] args) {
		try {
			String texto = "10xpt23";
			int idade = Integer.parseInt(texto);

		} catch (NumberFormatException e) {
			System.out.println("Número invalido");
			e.printStackTrace();

		}

	}

}
