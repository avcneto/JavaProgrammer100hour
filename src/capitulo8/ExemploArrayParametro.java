package capitulo8;

public class ExemploArrayParametro {
	public static void main(String args[]) {
		int valoresA[] = new int[3];
		int valoresB[] = new int[3];
		int i;

		valoresA[0] = 10;
		valoresA[1] = 20;
		valoresA[2] = 30;

		System.out.println("Antes de dobrar");
		for (i = 0; i < valoresA.length; i++)
			System.out.print("valoresA[" + i + "] = " + valoresA[i] + "\t");

		valoresB = dobrarValores(valoresA);

		System.out.println("\n\nApós de dobrar");
		for (i = 0; i < valoresB.length; i++)
			System.out.print("valoresB[" + i + "] = " + valoresB[i] + "\t");
	}

	static int[] dobrarValores(int x[]) {
		int i;
		for (i = 0; i < x.length; i++)
			x[i] *= 2;
		return x;
	}

}
