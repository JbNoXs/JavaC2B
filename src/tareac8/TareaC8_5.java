package tareac8;

import javax.swing.JOptionPane;

public class TareaC8_5 {
public TareaC8_5 () {
	try {
	String valor = JOptionPane.showInputDialog(null,"Ingrese un valor",null,0);
	float resultado = Float.parseFloat(valor);
	if (resultado == 0) {
		throw new ArithmeticException(); //excepcion en caso de valores float
		
	}
	resultado = (1 / resultado) ;
	JOptionPane.showMessageDialog(null, +resultado,null, 0);
	}
	catch (ArithmeticException ae) {
		JOptionPane.showMessageDialog(null,"El valor es Nulo",null, 0);
	}

}


}
