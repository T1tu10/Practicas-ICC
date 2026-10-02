public class Programa{	
	public static void main(String[] args) {
	// representa lo que estamos evaluando
	String producto = "Laptop para la carrera";
	// el valor esta en pesos mexicanos y es antes del descuento
	int precio = 15000;
	// esta en pesos mexicanos y es un monto fijo  
	int descuento = 3000;
	//se utilizo double para que el pago mensual nos de con decimales
	double meses = 18.0;
    // === los signos son solo decoracion
	System.out.println("=== Ficha de compra ===");
	// muestra el producto que estamos evaluando
	System.out.println("- Producto : " + producto);
	// se utilizo los parentesis para que se realizara primero la operación y luego se concatenara	
	System.out.println("- Precio con descuento : " + (precio - descuento));
	// convertimos el plazo de meses a anios 
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
	// se calcula cuanto se pagara mensualmente y es el precio con descuento entre los meses y sin intereses
	System.out.println("- Pago mensual : " + ((precio - descuento) / meses));
	// aclaramos el final de la información
	System.out.println("=== Fin de la ficha ===");

	}
}