package capitulo8;

public class ExemploAcessoInvalido {
	public static void main(String args[]) {
		int numero[] = new int[6];
		numero[6] = 3;

		int valores[] = new int[6];
		int indice = -5;
		valores[indice] = 3;

	}

}
