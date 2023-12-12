import java.util.*;
public final class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nichi = 0;
		System.out.print("Message : ");
		String message = scan.next();
		
		if(message.indexOf("nichi")>= 0) {
		   nichi += 1 ;
		}
        if(nichi == 0) {
        	System.out.print(message);
        }
        else {
        	System.out.print("Nichi is a sentence");
        }
        
	}

}
