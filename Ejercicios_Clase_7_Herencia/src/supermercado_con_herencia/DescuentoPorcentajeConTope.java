package supermercado_con_herencia;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
	//Se asume que el porcentaje de descuento se aplica hasta x monto de 
	//precio del carrito
	
	private float topeFijo;
	
	public DescuentoPorcentajeConTope(float topeFijo) {
		this.topeFijo = topeFijo;
	}


	@Override
	public float precioFinal(float precioSinDescuento) {
		//El descuento se aplica sólo si el precio base no excede el tope
		float valorADescontar = 0;
		if (precioSinDescuento < this.topeFijo) {
			valorADescontar = (precioSinDescuento *this.getValorDescuento()) / 100;
		}
		return precioSinDescuento - valorADescontar;
	}

}
