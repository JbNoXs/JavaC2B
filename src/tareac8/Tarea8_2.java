package tareac8;

import javax.swing.JOptionPane;

public class Tarea8_2 {
	public  Tarea8_2() { //Crear funcion al principio del programa
int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor del a�o"));
try { 

if (valor %4 == 0 && valor %100 == 0 && valor %400 == 0) {
	 JOptionPane.showMessageDialog(null, "El a�o es bisiesto",null, 1);
 }
	 else {
		 JOptionPane.showMessageDialog(null, "El año no es bisiesto",null, 1);
	 }
}
catch (NumberFormatException e) {	//Esto sirve por si envez de meter un numero metes una palabra 
	JOptionPane.showMessageDialog(null, "Introduce un valor valido",null,1);
}
}
	}
	
