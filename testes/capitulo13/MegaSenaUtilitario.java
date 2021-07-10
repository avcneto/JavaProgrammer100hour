package capitulo13;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class MegaSenaUtilitario {

	@Test
	void geracaoDeNumeroPositivo() {
		int numeroMaiorQueZero = MegaSenaUltilitario.sortearNumero();
		assertTrue(numeroMaiorQueZero > 0);
	}

	@Test
	void geracaoDeNumeroMenorOuIgualASessenta() {
		int numeroMenorIgualSessent = MegaSenaUltilitario.sortearNumero();
		assertTrue(numeroMenorIgualSessent < 61);
	}

}
