import javax.swing.*;
public class Example502 {

	public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Input your e-mail:");
         
        while(email.startsWith("@")||email.startsWith(" ")){
               email = JOptionPane.showInputDialog("Input your e-mail:");
        }
        email = email.toLowerCase();
        if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
        	JOptionPane.showMessageDialog(null, "your e-mail is " + email);
        }
        else {
        	JOptionPane.showMessageDialog(null,"Your E-mail is not hotmail or"+"Gmail dot com");
        }
	}

}
