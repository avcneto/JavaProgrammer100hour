package capitulo11;

public class usandoTryCatch {
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

		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
