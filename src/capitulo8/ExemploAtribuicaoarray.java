package capitulo8;

public class ExemploAtribuicaoarray {
	public static void main(String args[]) {
		int arrayNumeros[];

		arrayNumeros = new int[10];

		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = i;
			System.out.println(arrayNumeros[i]);
		}
	}

}
