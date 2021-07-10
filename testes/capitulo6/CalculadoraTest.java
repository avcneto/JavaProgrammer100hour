package capitulo6;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora c = new Calculadora();

	@Test
	void deveriariaSomarDoisValores() {
		float valor1 = 10;
		float valor2 = 10;
		float resultado = c.somar(valor1, valor2);
		assertTrue(resultado == 20);
	}

	@Test
	void deveriaSubtrairDoisValores() {
		float valor1 = 10;
		float valor2 = 5;
		float resultado = c.subtrair(valor1, valor2);
		assertTrue(resultado == 5);
	}

	@Test
	void deveriaDividirDoisValores() {
		float valor1 = 10;
		float valor2 = 2;
		float resultado = c.dividir(valor1, valor2);
		assertTrue(resultado == 5);
	}

	@Test
	void deveriaMultiplicarDoisValores() {
		float valor1 = 5;
		float valor2 = 5;
		float resultado = c.multiplicar(valor1, valor2);
		assertTrue(resultado == 25);
	}

	@AfterAll
	static void mensagemIniciandoTestes() {
		System.out.println("Iniciando todos os testes");
	}

//	@BeforeAll
//	static void mensagemFinalizandoTestes() {
//		System.out.println("Os Testes foram executados!!");
//	}

}
