import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Input your name : ");
		String fullname = scan.nextLine();
		
		int space = fullname.trim().indexOf(" ");
		String firstname = fullname.substring(0,space);
		String lastname = fullname.substring(space);
		
		if(space == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			System.out.println("First Name: " + firstname.toUpperCase());
			System.out.print("Last Name: " + lastname);
		} 	
		
		
		

	}

}
