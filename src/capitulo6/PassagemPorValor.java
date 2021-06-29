package capitulo6;

public class PassagemPorValor {
	public static void main(String args[]) {

		int valor = 1500;
		// tentativa de alterar o valor
		System.out.println("Antes da chamada do método alterarValor o valor é " + valor);
		alterarValor(valor);
		System.out.println("Depois da chamada do método alterarValor o valor é " + valor);
		System.out.println();

		Pessoa maria = new Pessoa();
		maria.setSexo('f');
		maria.setNome("Maria");
		maria.setIdade(50);

		// tentativa de alterar a referencia do objeto
		System.out.println("Valores antes da chamada do método alterarReferenciaObjeto:");
		maria.exibirDados();
		alterarReferenciaObjeto(maria);
		System.out.println("Valores depois da chamada do método alterarReferenciaObjeto:");
		maria.exibirDados();
		System.out.println();

		// alterando o CONTEUDO do objeto
		System.out.println("Valores antes da chamada do método alterarConteudoObjeto:");
		maria.exibirDados();
		alterarConteudoObjeto(maria);
		System.out.println("Valores depois da chamada do método alterarConteudoObjeto:");
		maria.exibirDados();
	}

	static void alterarValor(int valor) {
		// alterando o valor
		valor = 137;
	}

	static void alterarReferenciaObjeto(Pessoa p) {
		Pessoa ana = new Pessoa();
		ana.setSexo('f');
		ana.setNome("Ana");
		ana.setIdade(18);
		p = ana; // alterando o valor de p

	}

	static void alterarConteudoObjeto(Pessoa p) {
		// alterando o conteudo do objeto referenciado por p
		p.setSexo('m');
		p.setNome("João");
		p.setIdade(33);
	}

}
