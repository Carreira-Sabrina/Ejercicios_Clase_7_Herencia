package supermercado_con_herencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarritoTest2 {

	@Test
	public void precioTest() {
		//Se prueba con un descuento con porcentaje
		//Para testear el precio se necesitan instancias de Producto, ItemCarrito,
		//Carrito y descuento
			
		Producto prod1 = new Producto("galletitas saladas",100);
		ItemCarrito item1 = new ItemCarrito(prod1,2);
		Carrito carritoTest = new Carrito(item1);
		
		Descuento dtoPorcentaje = new DescuentoPorcentaje();
		dtoPorcentaje.setValorDescuento(10);
		
		float totalEsperado = 200;
		float resultadoTest = carritoTest.precio(dtoPorcentaje);
		assertNotEquals(totalEsperado,resultadoTest,0.01);
	}
	
}
