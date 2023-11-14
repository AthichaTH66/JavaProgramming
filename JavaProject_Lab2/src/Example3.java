import java.util.*; //1.import for input Data from keyboard
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		//2.Create class Scanner for input data from keyboard
		Scanner input = new Scanner(System.in);
		//3.Display and input data
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Inpur product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt(); 
		System.out.print("Input Price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println(); // space
		
		float totalPrice = productUnit * priceperUnit ;
		System.out.println("Totla Price is "+ frm.format(totalPrice) + " baht");
		float vat = totalPrice + (totalPrice*7/100);
		System.out.println("Add VAT 7% is " + frm.format(vat) + " baht");
		
		

	}

}
