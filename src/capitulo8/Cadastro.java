package capitulo8;

public class Cadastro {
	public static void main(String args[]) {
		Pessoa pessoas[] = new Pessoa[2];
		pessoas[0] = new Pessoa();
		pessoas[0].altura = 1.68;
		pessoas[0].peso = 55;
		pessoas[0].nome = "Vinicios";

		pessoas[1] = new Pessoa();
		pessoas[1].altura = 1.77;
		pessoas[1].peso = 60;
		pessoas[1].nome = "Pamela";

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("id: " + i + ", Nome: " + pessoas[i].nome + ", Altura: " + pessoas[i].altura + ", Peso: "
					+ pessoas[i].peso);
		}

	}

}
