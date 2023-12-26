import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		
         inputEmail();
	}
		
          public static void inputEmail() {
        	  String Email = JOptionPane.showInputDialog("Input your e-mail:");
              
              while(Email.startsWith("@")||Email.startsWith(" ")) {
             	 Email = JOptionPane.showInputDialog("Input your e-mail,again");
              }
              
              boolean validateEmail = checkEmail(Email);
               
               if(validateEmail == true) {
             	  JOptionPane.showMessageDialog(null, "Your e-mail is "+ Email.toLowerCase());
               }
               else {
             	  JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com ");
               }
          
	}
	public static boolean checkEmail(String Email) {
		if(Email.endsWith("hotmail.com")||Email.endsWith("gmail.com")){
				return true;
	}
	            else return false;
	}

}
