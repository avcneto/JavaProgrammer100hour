package capitulo10;

public interface Eletrodomestico {
	void ligar();

	void desligar();

	static void ligarTudo(Eletrodomestico... eletroArray) {
		for (Eletrodomestico eletro : eletroArray) {
			eletro.ligar();
		}
	}

	static void desligarTudo(Eletrodomestico... eletroArray) {
		for (Eletrodomestico eletro : eletroArray) {
			eletro.desligar();
		}

	}

	default void acionarTimer(int minutos) {

		try {
			Thread.sleep(minutos * 1000);
		} catch (Exception e) {
			System.out.println("Ocorreu um problemas " + e.getMessage());

		}
		desligar();
	}

}
