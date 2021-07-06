package capitulo10;

public class Geladeira implements Eletrodomestico {
	private int temperatura = -10;

	public void descongelar() {
		if (temperatura > 0) {
			System.out.println("descongelando...");
		} else {
			System.out.println("congelando...");
		}
	}

	@Override
	public String toString() {
		return "Geladeira [temperatura=" + temperatura + "]";
	}

	public Geladeira() {

	}

	public Geladeira(int temperatura) {
		super();
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public void temperatura() {
		System.out.println("Temperatura atual " + temperatura);
	}

	@Override
	public void ligar() {
		System.out.println("ligando geladeira...");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando geladeira...");

	}

}
