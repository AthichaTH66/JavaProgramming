import javax.swing.*;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		final int BUFFET = 299 ;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double discount,totalPrice = 0;
		totalPrice = BUFFET * numberOfCustomer ;
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice) + " baht." + "\n Do you have a member card");
		}while(member == JOptionPane.CANCEL_OPTION);
		
		if(member == JOptionPane.YES_OPTION) {
			discount = totalPrice - (totalPrice * 10/100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discount) + " baht.");
		}
		else if (member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + " baht.");
			
		}
		
		
		
		
	}

}
