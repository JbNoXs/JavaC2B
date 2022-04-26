package tareac8;

import javax.swing.JOptionPane;

public class TareaC8_1 {
	public void tareac8_1() {
	final float DOLAR = 1.09F;
	final double LIBRAS = 1.20F;
	final float EURO = 0.92F;
	final double YEN = 167.06F;
	try {
	String[] tipo =  {"Euro/Dolar", "Yen/Libras", "Dolar/Euro", "Libras/Yen"};
	
	String moneda = (String) JOptionPane.showInputDialog(null, "¿Que moneda quieres Cambiar?", null, 0, null, tipo,tipo[3]);
	
	System.out.println("Elige el tipo de moneda a Cambiar: " + moneda);

	double moneda1 = Double.parseDouble( JOptionPane.showInputDialog(null, "¿Cuanto dinero quieres casmbiar?", null,0));
	switch (moneda) {
	case "Euro/Dolar" :
		JOptionPane.showMessageDialog(null,"El cambio es:" + String.format("%.3f",moneda1 * DOLAR) +"Dolares.",null,0);// String.format %.3f visualiza 3 caracteres.
		break;
	case "Yen/Libras" :
		JOptionPane.showMessageDialog(null,"El cambio es:" +String.format("%.3f", moneda1 * LIBRAS) +"Libras.",null,0);
		break;
	case "Dolar/Euro" :
		JOptionPane.showMessageDialog(null,"El cambio es:" +String.format("%.3f", moneda1 * EURO) +"Euros.",null,0);
		break;
	case "Libras/Yen" :
		JOptionPane.showMessageDialog(null,"El cambio es:" +String.format("%.3f", moneda1 * YEN) +"Yenes.",null,0);
		break;
	}
	}
	
	catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(null,"El valor introducido no es un numero",null, 0);
	}
	} 
}
