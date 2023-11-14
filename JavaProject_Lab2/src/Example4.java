import javax.swing.*; //1. import library for input data from dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		
	/*	String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		int productUnit = Integer.parseInt(strUnit); */
		
		//input and convert data from dialog box
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		float totalPrice = productUnit * pricePerUnit;
		
		float vat = totalPrice + (totalPrice*7/100);
		System.out.println("Add VAT 7% is " + frm.format(vat) + " baht");
		
		JOptionPane.showMessageDialog(null, "Total Price is "
				+ frm.format(totalPrice) + " baht" + "\n" 
				+ "Add VAt 7% is "
			    + frm.format(vat) + " baht" );
				
				
				
	}

}
