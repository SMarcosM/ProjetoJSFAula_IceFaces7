package U3S1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testSomar() {
		Calculadora c = new Calculadora();
		double res = c.somar(10, 50);
		assertEquals(60, res);
	}

	@Test
	void testSubtrair() {
		Calculadora c = new Calculadora();
		double res = c.subtrair(10, -15);
		assertEquals(25, res);
	}

	@Test
	void testDividir() {
		Calculadora c = new Calculadora();
		double res = c.dividir(10.0, 0);
		assertNotEquals(Double.isFinite(res), false);
	}

	@Test

	void testMultiplicar() {
		Calculadora c = new Calculadora();
		double res = c.multiplicar(120.115, 12.5465);
		assertEquals(1507.01, 0.5, res);
	}
}