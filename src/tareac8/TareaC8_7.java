package tareac8;

import java.util.Scanner;

public class TareaC8_7 {
public TareaC8_7 () {
	try {
	Scanner sc = new Scanner (System.in);
	System.out.println("Inserta el valor de X :");
	int x = sc.nextInt();
	System.out.println("Inserta el valor de Y :");
	int y = sc.nextInt();
	if (x == y) {
		System.out.println("Los valores introducidos son iguales");
		}
	else if(x > y ) {
		System.out.println("El valor de X es mayor que Y ");
	}
	 else  {
		System.out.println("El valor de X es menor que Y ");
	}
	sc.close();
	}
	catch (NumberFormatException ne) {
	System.out.println(" Por favor te he dicho que metas un numero y has introducido Letras. " );
 }
	
}

}
