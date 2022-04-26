package tareac8;

import java.util.Scanner;

public class TareaC8_8 {
public TareaC8_8 ( ) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Inserta el valor de X :");
	int x = sc.nextInt();
	System.out.println("Inserta el valor de Y :");
	int y = sc.nextInt();
	int suma = (x += y);
	int resta = (x -= y);
	int producto = (x *= y);
	int div = (x /= y);
	int mod = (x %= y);
	System.out.println("La suma de X + Y es : " + suma);
	System.out.println("La resta de X - Y es : " + resta);
	System.out.println("El producto de X * Y es : " + producto);
	System.out.println("La division de X / Y es : " + div);
	System.out.println("El modulo entre X % Y es:" + mod);
	sc.close();
}
	
	
}
