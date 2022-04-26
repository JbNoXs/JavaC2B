package tareac8;

import javax.swing.JOptionPane;

public class TareaC8_6 {
// El programa  devuelve el valor absoluto de un entero insertado por teclado por el usuario
	public TareaC8_6 () { 
	try {
	String valor = JOptionPane.showInputDialog(null,"Ingrese un valor",null,0);// Pide un valor en una cadena de caracteres
	//int resultado = Integer.parseInt(valor); //Convierte el valor introducido en un numero entero.
	double resultado = Double.parseDouble(valor); // Convierte el valor introducido en un numero con decimales. 
	if (resultado == 0) {
		JOptionPane.showMessageDialog(null, "El numero es nulo",null,0);
	}
	else 
		JOptionPane.showMessageDialog(null, Math.abs(resultado),null,0);//Math.abs "Método que nos permite calcular el valor absoluto de un número."
	
	
	}
	catch (NumberFormatException e) {	//Esto sirve por si envez de metes una letra 
		JOptionPane.showMessageDialog(null, "Introduce un valor valido",null,1);
	}
	}}
