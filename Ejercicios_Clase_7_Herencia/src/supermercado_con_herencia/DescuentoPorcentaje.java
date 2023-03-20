package supermercado_con_herencia;

public class DescuentoPorcentaje extends Descuento {
	
	@Override
	public float precioFinal(float precioSinDescuento) {
		return precioSinDescuento - ((precioSinDescuento *this.getValorDescuento()) / 100);
	}		


}
