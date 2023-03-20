package supermercado_con_herencia;

public class Supermercado {

	public static void main(String[] args) {
			
		String tipoDeDto = args[0];//Opciones: FIJO/PORCENTAJE
		float valorDescuento = Float.parseFloat(args[1]);//valor en 2do parametro
		
		//tendrá la instancia de la clase Descuento correspondiente
		Descuento dto1 = null; 
		
		float totalAPagar; //tendrá el precio del carrito total con descuentos
		
		//Instancias de la clase producto
		Producto prod1 = new Producto("Jabón Limpito",100);
		Producto prod2 = new Producto("Arroz Blancura",200);
		Producto prod3 = new Producto("Harina La Susana",300);
		
		//Instancias de ItemCarrito
		ItemCarrito item1 = new ItemCarrito(prod3,5);
		ItemCarrito item2 = new ItemCarrito(prod2,4);
		ItemCarrito item3 = new ItemCarrito(prod1,2);
		
		//Instancia de Carrito
		Carrito carrito1 = new Carrito(item1);
		
		//Mostrar en pantalla articulos, por ahora, sin descuento
		ticketDeCompra(carrito1);
		
		//El descuento se instancia acá, su valor se pasa con el setter
		switch (tipoDeDto) {
			case "FIJO":
				dto1 = new DescuentoFijo();
				break;
			case "PORCENTAJE":
				dto1 = new DescuentoPorcentaje();
				break;
		}
		dto1.setValorDescuento(valorDescuento); 
		
		//Ya con el descuento instanciado se puede calcular el precio del carrito
		totalAPagar = carrito1.precio(dto1);
		
		//Mostrar por pantalla el primer descuento
		System.out.println("		* Se aplicará un descuento de tipo " + tipoDeDto 
							+ " de valor " + dto1.getValorDescuento() );
		System.out.println("		 * Total con primer descuento " + totalAPagar);
		
		System.out.println("		- Se aplicará un descuento de tipo PORCENTAJE CON TOPE");
		System.out.println("		Si la compra es de hasta $1600 se aplica un 5% de dto");
		// Ahora se aplica la nueva clase DescuentoPorcentajeConTope	
		//Si la compra es de hasta $1600 se aplica un 5% de dto
		
		Descuento dtoConTope = new DescuentoPorcentajeConTope(1600);
		dtoConTope.setValorDescuento(5);
		
		//Se vuelve a calcular el valor del carrito incluyendo el nuevo descuento
		//Se invoca la versión recargada del método
		totalAPagar = carrito1.precio(totalAPagar,dtoConTope);
		
		System.out.println("		 * Total con segundo descuento " + totalAPagar);
			

	}//end of main
	
	public static void ticketDeCompra(Carrito carrito) {
		//Imprime en pantalla el detalle de la compra
		System.out.println("***********************************************");
		System.out.println("***SUPERMERCADO DE DESCUENTO TODOS CONTENTOS***");
		System.out.println("***********************************************");
		System.out.println("************ DETALLE DE SU COMPRA *************");
		System.out.println("***********************************************");
		System.out.println("\n");
		//Se imprimen los articulos comprados
		for (ItemCarrito art : carrito.getItemsCarrito()) {
			System.out.println(art.getNombreItem() + "     " 
							   + "precio unitario: $" + art.getPrecioUnitario()
							   + "  cantidad: " + art.getCantidad()
							   + "  subtotal: $" + art.getSubtotal());
			
		}
		System.out.println();
		System.out.println("		* Total sin descuento " + carrito.getPrecioSinDto());
	
		
	}
	
}//end of class
