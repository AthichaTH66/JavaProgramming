import java.util.*;
import java.text.NumberFormat;
public class Practice03 {

	public static void main(String[] args) {
		final double commision_rate = 0.15;
		final int sentinel = -1;
		int sales;
		double salary;
		Scanner scan = new Scanner(System.in);
		
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
				
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end):");
			sales = scan.nextInt();
			
		if(sales == sentinel) {
			System.out.print("bye"); 
			break;
		}
		else {
			salary = (sales * commision_rate) + 1000;
			System.out.println("Salary is: " + f1.format(salary)); 
			
		}
		

	}

  }
}