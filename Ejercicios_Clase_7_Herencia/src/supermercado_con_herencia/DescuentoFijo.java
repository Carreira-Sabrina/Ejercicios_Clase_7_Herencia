package supermercado_con_herencia;

public class DescuentoFijo extends Descuento {

	@Override
	public float precioFinal(float precioSinDescuento) {
		return precioSinDescuento - this.getValorDescuento();
	}

}
