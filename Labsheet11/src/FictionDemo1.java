import java.util.*;
public class FictionDemo1 {

	 static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Input book name : ");
		String title = scan.nextLine();
				
		System.out.print("Input book year : ");
		int publicYear = scan.nextInt();
		
		FictionBook ath = new FictionBook(title,publicYear);
		
		System.out.print("Input Firstname-Lastname : ");
		String name = scan.nextLine();
		ath.setAuthorName(name);
		
		System.out.print("Input email : ");
		String email = scan.nextLine();
		
		ath.setEmail(email);
	}

}
