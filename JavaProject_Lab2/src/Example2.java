import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		//2.call class DecimalFormat
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BUFFET = 299;
		int numberofCustomer = 5;
		double NetPrice = BUFFET * numberofCustomer;
		//3.apply format method to variable
		System.out.println("Buffet of "+numberofCustomer+"Customers is "+frm.format(NetPrice));
		double serviceCharge = NetPrice + (NetPrice*3/100);
		System.out.println("Add serviceCharge 3% is "+serviceCharge);
		

	}

}
