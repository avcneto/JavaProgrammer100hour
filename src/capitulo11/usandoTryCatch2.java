package capitulo11;

public class usandoTryCatch2 {
	public static void main(String[] args) {
		int i;

		try {
			i = 1 / 0;
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		}

		i = 2;
		try {

			i = 1 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Tradando Exceção");
			e.printStackTrace();

		}
		
		System.out.println("Continuação do código");

	}

}
