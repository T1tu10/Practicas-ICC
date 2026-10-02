public class ProgramaNuevo{	
	public static void main(String[] args) {
	
	String producto = "Laptop para la carrera";
	int precio = 15000;
	int descuento = 3000;
	double meses = 18.0;

	System.out.println("=== Ficha de compra ===");
	// Un solo printf imprime lo que imprimia 4 println cada % se remplaza por los valores que tenia (string,int,double) en orden el %n se utilizo para hacer un salto de linea y el %.1 o 2f se utilizo para elegir cuantos decimales imprimir 
	System.out.printf("-Producto : %s%n-Precio con descuento : %d%n-Plazo de pago en anios: %.1f%n-Pago mensual : %.2f%n",producto, (precio-descuento), (meses / 12.0), ((precio-descuento) / meses));
	System.out.println("=== Fin de la ficha ===");

	}
}