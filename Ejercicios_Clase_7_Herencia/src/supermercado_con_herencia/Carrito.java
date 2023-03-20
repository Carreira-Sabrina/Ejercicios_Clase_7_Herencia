package supermercado_con_herencia;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
	private ItemCarrito item1;
	private ItemCarrito item2;
	private ItemCarrito item3;
	private int cantItems = 0;
	//Es inviable usar array porque no puedo declarar una array con un numero 
	//variable de de elementos, y si alguien compra, por ejemplo, un solo 
	//producto y la array se creó para 3?
	private List <ItemCarrito> itemsCarrito = new ArrayList<ItemCarrito>();
	
	
	//Constructores para aceptar 1,2 ó 3 items (no se pueden usar varargs?)
	public Carrito(ItemCarrito item1, ItemCarrito item2, ItemCarrito item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		//Se guardan los items en arrayList
		this.itemsCarrito.add(item1);
		this.itemsCarrito.add(item2);
		this.itemsCarrito.add(item3);
	}
	
	public Carrito(ItemCarrito item1, ItemCarrito item2) {
		this.item1 = item1;
		this.item2 = item2;
		//Se guardan los items en arrayList
		this.itemsCarrito.add(item1);
		this.itemsCarrito.add(item2);
	}
	
	public Carrito(ItemCarrito item1) {
		this.item1 = item1;
		//Se guardan los items en array
		this.itemsCarrito.add(item1);
	}
	

	public float getPrecioSinDto() {
		float precioSinDto = 0;
		//Sumo todos los precios de los ItemCarrito
		for(ItemCarrito articulo : this.itemsCarrito) {
			precioSinDto = precioSinDto + articulo.getSubtotal();
		}
		return precioSinDto;
	}

	//El descuento se instancia en la clase Supermercado (su tipo se acuerda 
	//mediante un parámetro. El valor del descuento se inicia con el setter. 
	//Esa instancia se pasa a este método
	public float precio(Descuento descuento) {
		float precioFinal = 0; //esto es lo que se devuelve
		precioFinal = descuento.precioFinal(getPrecioSinDto());
		return precioFinal;
	}
	
	//Se sobrecarga el método para aplicar un descuento para cuando ya hay otro
	public float precio(float precioActual,Descuento descuento) {
		float precioFinal = 0; //esto es lo que se devuelve
		precioFinal = descuento.precioFinal(precioActual);
		return precioFinal;
	}
		
	
	public int getCantItems() {
		for(ItemCarrito item :this.itemsCarrito) {
			this.cantItems=+1;
		}
		return cantItems;
				
	}
	

	public List<ItemCarrito> getItemsCarrito() {
		return this.itemsCarrito;
	}
		
}//end of class
