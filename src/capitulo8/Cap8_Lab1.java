package capitulo8;

public class Cap8_Lab1 {
	public static void main(String args[]) {

		int numero[] = { 1, 3, 7, 10, 2, 5 };

		System.out.println(maiorNumero(numero));

	}

	public static int maiorNumero(int array[]) {
		int maiorNumero = 0;
		for (int i : array) {
			if (i > maiorNumero) {
				maiorNumero = i;
			}
		}

		return maiorNumero;
	}

}
