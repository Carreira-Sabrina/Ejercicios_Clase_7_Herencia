package supermercado_con_herencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarritoTest {

	@Test
	public void test() {
		//Se prueba con un descuento fijo
		//Para testear el precio se necesitan instancias de Producto, ItemCarrito,
		//Carrito y descuento
		Producto prod1 = new Producto("manteca",200);
		ItemCarrito item1 = new ItemCarrito(prod1,1);
		Carrito carritoTest = new Carrito(item1);
				
		Descuento dtoFijo = new DescuentoFijo();
		dtoFijo.setValorDescuento(10);
				
		float totalEsperado = 190;
		float resultadoTest = carritoTest.precio(dtoFijo);
		assertEquals(totalEsperado,resultadoTest,0.01);
	}

}
