package tareac8;

import java.util.Scanner;

public class TareaC8_10 {
	public TareaC8_10 () {
		try {
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido al conversor de Monedas. ");
		System.out.println("Pulsa 1-Euros/Dolar o Pulsa 2-Yen/Libras?");
		double moneda = sc.nextDouble ();
		//double librayen = sc.nextDouble ();
		if (moneda == 1 ) {
		System.out.println("Cuanto dinero quieres cambiar?");
		double eurodolar1 = sc.nextDouble();
		System.out.println("Por" + eurodolar1 + "al cambio son : " + String.format("%.3f",eurodolar1 * 1.08) + " Dolares");
		}
		else if (moneda == 2) {
		System.out.println("Cuanto dinero quieres cambiar?");
		double librayen1 = sc.nextDouble();
			System.out.println("Por" + librayen1 + "al cambio son : " +String.format("%.3f",librayen1 * 164.95) + " Yenes");
			
		sc.close();
		}
		}
		catch (NumberFormatException ne) {
			System.out.println(" Por favor te he dicho que metas un numero y has introducido Letras. " );
		 
		}

	}}

