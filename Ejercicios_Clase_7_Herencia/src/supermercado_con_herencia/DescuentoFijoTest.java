package supermercado_con_herencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescuentoFijoTest {

	@Test
	public void test() {
		
		float precioSinDescuentos = 1000;
		
		Descuento dtoFijoTest = new DescuentoFijo();
		dtoFijoTest.setValorDescuento(100);
		
		float resultadoEsperado = 900;
		
		assertEquals(resultadoEsperado, dtoFijoTest.precioFinal(precioSinDescuentos),0.01);
	}

}
