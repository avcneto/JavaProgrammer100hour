package capitulo11;

public class ContaCorrente extends Conta {
	double saldo;

	public void debitarTarifa(double d) {
		saldo -= d;

	}

}
