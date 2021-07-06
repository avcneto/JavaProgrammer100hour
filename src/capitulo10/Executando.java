package capitulo10;

public class Executando {
	public static void main(String[] args) {

		Eletrodomestico aparelho;

		aparelho = new Microondas();

		if (aparelho instanceof Microondas) {
			System.out.println("teste");

		}

		aparelho.ligar();

		aparelho = new Televisao();
		aparelho.ligar();

		aparelho = new Geladeira();
		aparelho.ligar();

		Microondas m = new Microondas();
		m.aquecer();

		Eletrodomestico tv = new Televisao();
		tv = new Televisao();
		tv.ligar();
		tv.acionarTimer(2);

	}

}
