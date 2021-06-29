package capitulo5.carro;

public class CriarCarros2 {
	public static void main(String[] args) {

		Garagem g = new Garagem();

		g.carroPasseio = new Carro();
		g.carroPasseio.setCor("vermelho");
		g.carroPasseio.setModelo("VW Jetta");
		g.carroPasseio.setPotenciaMotor(2.3);

		g.carroUtilitario = new Carro();
		g.carroUtilitario.setCor("branco");
		g.carroUtilitario.setModelo("Renault Boxer");
		g.carroUtilitario.setPotenciaMotor(3.8);

		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.carroPasseio.getCor());
		System.out.println("Modelo: " + g.carroPasseio.getModelo());
		System.out.println("Potência: " + g.carroPasseio.getPotenciaMotor());

		System.out.println("---------------------------------------");

		System.out.println("Carro Utilitário: ");
		System.out.println("Cor: " + g.carroUtilitario.getCor());
		System.out.println("Modelo: " + g.carroUtilitario.getModelo());
		System.out.println("Potência: " + g.carroUtilitario.getPotenciaMotor());
	}
}