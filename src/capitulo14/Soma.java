package capitulo14;

public class Soma implements OperacaoAritimetica {

	@Override
	public double execute(double value1, double value2) {
		return (value1 + value2);
	}

}
