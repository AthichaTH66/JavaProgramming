import java.text.*;
import java.util.*;
public class Practice01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int X ,Y;
		
		System.out.print("Input value of X :");
		X = scan.nextInt();
		while(true){
		System.out.print("Input value of Y :");
		Y = scan.nextInt();
        if( Y<X) {
        	System.out.print("Input value of Y, again :");
    		Y = scan.nextInt();
    		
        }
		
	}

  }
}