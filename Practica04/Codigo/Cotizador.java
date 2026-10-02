public class Cotizador{
	public static void main (String[] args){

  	String cliente1 = "Robbie Valentino";
	int capital = 12899;
	double tasaAnual = 15;
	double plazoMeses = 21;
	// P Y R son para futuros clientes con la clasifcación de cada uno
	char clientePreferente = 'P';
	char clienteRiesgoso = 'R';
	char clienteEstandar = 'E';
	// Registra la clasificación de Robbie 
	char clasificacionCliente = clienteEstandar;
	// Se calcula en cuantos años terminara de pagar
	double tiempoEnAnios = plazoMeses / 12;
	// Es cuanto va a pagar de interes simple
	double interes = capital * (tasaAnual / 100) * tiempoEnAnios;
	// Precio final a pagar
	double total = capital + interes;
	// Cuanto se pagara mes a mes 	
	double mensualidad = total / plazoMeses;
	
	System.out.printf("El cliente :%s tiene una clasificación : %c (P = preferente, E = estandar, R = riesgoso)%n", cliente1, clasificacionCliente);	
	System.out.printf("El precio del producto es de : $%d y la Tasa Anual que pagará es de : %.0f%% %n",capital, tasaAnual);
	System.out.printf("El tiempo estimado que se tardara en pagar es de : %.0f meses es decir : %.2f en años %n", plazoMeses, tiempoEnAnios);
	System.out.printf("Esto es lo que va a pagar de interes: $%.2f%nEste sera el pago total: $%.2f%nEn esto quedarian las mensualidades: $%.2f %n", interes, total, mensualidad);
		
	}


}


   