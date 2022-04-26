package tareac8;

import java.util.Scanner;

public class TareaC8_9 {

public  static boolean Capicua(int num) { //Creo un metodo con una variable de un numero entero
Scanner sc = new Scanner (System.in); //creo la clase scanner
System.out.println("Introduce un número Entero cifras : "); //Pido que introduzca un numero entero
final int num1 = sc.nextInt();
String capi = String.valueOf(num1);	//Convierto el numero entero en cadena de caracteres
sc.close();
for (int x = 0, y = capi.length() - 1; x <= y; x++, --y) { //Creo un bucle con dos variables x= 0 desplaza de izq a derecha Y j = la variable de derecha a izq y compara.
if (capi.charAt(x) != capi.charAt(y)) { //Condicion si dos caracteres no son distintos son capicua
return false;
	}
	}
return true;
}
public TareaC8_9 () { //En este otro Metodo le decimos que num1 = 0
int num1 = 0;
System.out.println("¿El numero introducido es Capicua? " + Capicua(num1)); 
//Imprimimos en pantalla texto concatenado con la variante num1 del metodo Capicua
}

}


