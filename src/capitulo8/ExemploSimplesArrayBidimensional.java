package capitulo8;

public class ExemploSimplesArrayBidimensional {
	public static void main(String args[]) {
		int elementos[][] = { { 0, 1, 2 }, { 3, 5, 8, 13 }, { 21, 34 } };

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos.length; j++) {
				System.out.println(elementos[i][j]);
			}

		}
	}

}
