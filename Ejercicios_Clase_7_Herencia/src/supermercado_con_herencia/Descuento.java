package supermercado_con_herencia;

public abstract class Descuento {
	private float valorDescuento;
	
	public void setValorDescuento(float valor) {
		this.valorDescuento = valor;
	}
	
	public float getValorDescuento() {
		return this.valorDescuento;
	}
	
	//Metodo abstracto para sobre-escribir
	public abstract float precioFinal(float precioSinDescuento);			

}
