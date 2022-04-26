package tareac8;

import javax.swing.JOptionPane;

public class TareaC8_4 {
	public TareaC8_4() {
		try { //Try comienza antes del valor introducido.
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, " Mete el valor del Grado obtenido ", null, 0));
		
		if (valor < 0) {
			JOptionPane.showMessageDialog(null, "El valor introducido tiene que ser entre 0 y 100", null, 0);
		}
		else if (valor <= 49) {
	JOptionPane.showMessageDialog(null, "El Grado obtenido es E ", null,0);
		}
		else if (valor <= 69) {
	JOptionPane.showMessageDialog(null, "El Grado obtenito es D ", null, 0);
		}
		else if (valor <= 79) {
	JOptionPane.showMessageDialog(null, "El grado obtenido es C ", null, 0);
	}
	    else if (valor <= 89) {
	JOptionPane.showMessageDialog(null, "El grado obtenido es B ", null, 0);
	    }
	    else if (valor <= 100) {
	JOptionPane.showMessageDialog(null, "El grado obtenido es A ", null, 0);
	    }
	}
	catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null,"El valor introducido no es numerico. ",null, 0);
	
	}
	}
}
