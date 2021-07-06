package capitulo10;

public class Televisao implements Eletrodomestico {
	private int canal = 2;
	private int valume = 10;

	public Televisao() {

	}

	public Televisao(int canal, int valume) {

		this.canal = canal;
		this.valume = valume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getValume() {
		return valume;
	}

	public void setValume(int valume) {
		this.valume = valume;
	}

	@Override
	public void ligar() {
		System.out.println("Ligando televisão...");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando televisão...");

	}

	@Override
	public String toString() {
		return "Televisao [canal=" + canal + ", valume=" + valume + "]";
	}

}
