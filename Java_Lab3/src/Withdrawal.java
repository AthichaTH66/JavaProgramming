import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
     
	   DecimalFormat frm = new DecimalFormat("#,###.00");
	   Random rand = new Random();
	   int balance = rand.nextInt(9) * 100000;
	   
	   int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your Balance : " + frm.format(balance)
	                     + "\nInput money to withdraw: "));
	   if(withdrawMoney > 20000) JOptionPane.showMessageDialog(null,"ERROR : Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
	   else if(withdrawMoney > balance) JOptionPane.showMessageDialog(null,"ERROR : Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
	   else if(withdrawMoney % 100 != 0) JOptionPane.showMessageDialog(null,"ERROR : Cannot withdraw ","ERROR",JOptionPane.ERROR_MESSAGE);
	   else {
		   JOptionPane.showMessageDialog(null,"You withdraw " + withdrawMoney + "\n1000 =" +withdrawMoney/1000 +"\n500 =" +(withdrawMoney%1000)/500 + 
	                                   "\n100 = " +((withdrawMoney%1000)%500)/100);
		   
		   
	   }
	   
	  
	}

}
