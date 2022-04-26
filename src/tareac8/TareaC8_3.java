package tareac8;

import javax.swing.JOptionPane;

public class TareaC8_3 {
	public TareaC8_3() {
		try {
		
		// Variable de num 1 = Convierte una cadena de texto en un número entero. y pide que ingreses un numero entero.
		int Num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor de 5 digitos",null, 0));
		String numero = String.valueOf(Num1); //devuelve el valor primitivo de un objeto String como un tipo de dato cadena.
		char[] separar = numero.toCharArray(); //Convierte una cadena en un array(bucle) de caracteres.
		String valores = "";
		for(int i = 0; i < separar.length; i++) { //for(Realiza un bucle pidiendo el valor 0 el primer valor introducido e incrementa en 1 el valor de caracteres) 
		valores += separar[i] + ", ";
       

		} 
		JOptionPane.showMessageDialog(null,"los valores son : "+ valores,null,0);;
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"El valor introducido no es numerico. ",null, 0);
		}
		

	}
	}