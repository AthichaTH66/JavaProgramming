import java.util.*;
public class Lab603 {
	
static Scanner input = new Scanner(System.in);
static String fullname,firstname,lastname;
	public static void main(String[] args) {
		
		
           System.out.print("Please enter your name, seperated  by a space.\n:");
            fullname = input.next();
            for(int i=0; i<=fullname.length();i++) {
    			if(fullname.charAt(i) == ' ');
                   firstname = fullname.trim();
                   System.out.println(firstname + lastname);
            }
	}
	public static void abbreviatName(String fullname) {
		int i;
		for(i=0; i<=fullname.length();i++); {
			if(fullname.charAt(i) == ' '); {
				 lastname = fullname.indexOf(0);
			}
			
		}
	}

}
