package supermercado_con_herencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescuentoPorcentajeTest {

	@Test
	public void testPrecioFinal() {
		float precioSinDescuentos = 600;
		
		Descuento dtoPorcentTest = new DescuentoPorcentaje();
		dtoPorcentTest.setValorDescuento(10);
		
		float resultadoEsperado = 540;
		
		assertEquals(resultadoEsperado, dtoPorcentTest.precioFinal(precioSinDescuentos),0.01);
	}

}
