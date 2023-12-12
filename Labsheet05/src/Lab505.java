import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           
           System.out.print("What is your name : ");
           String fullname = scan.next();
           
           int space = fullname.trim().indexOf(" ");
           String firstname = fullname.substring(0,space);
           String middlename = fullname.substring(space+1,space);
           String lastname  = fullname.substring(space);
           
                    
           System.out.print("your name is : " + lastname);
	}

}
