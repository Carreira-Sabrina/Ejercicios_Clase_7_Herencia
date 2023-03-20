package supermercado_con_herencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescuentoPorcentajeConTopeTest {

	@Test
	public void test() {
		//El tope son $2000, para obtener el dto, el carrito debe valer menos
		Descuento dtoPorcentTope = new DescuentoPorcentajeConTope(2000);
		//Se descuenta un 5%
		dtoPorcentTope.setValorDescuento(5);
		
		float precioSinDto = 2500;
		float resultadoEsperado = 2500;
		float precioConDescuento = dtoPorcentTope.precioFinal(precioSinDto);
		//Como el precio sin descuento es mayor al tope, no hay dto
		assertEquals(resultadoEsperado,precioConDescuento,0.01);
	}

}
