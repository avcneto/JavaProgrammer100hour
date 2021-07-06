package capitulo10;

public class Microondas implements Eletrodomestico {

	public void aquecer() {
		System.out.println("Aquecendo...");
	}

	public void assar() {
		System.out.println("Asando");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando Microondas..");

	}

	@Override
	public void desligar() {
		System.out.println("desligando Microondas...");

	}

}
