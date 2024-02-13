import java.io.*;
import java.util.*;
public class AddProduct {
	public static void main(String[] args)throws IOException {
		
		Scanner input = new Scanner(System.in);
	 
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product",true));
		
		System.out.print("Product ID   : ");
		String id = input.next();
		System.out.print("Product name : ");
		String name = input.next();
		System.out.print("Product unit : ");
		int unit = input.nextInt();
		System.out.print("Product price: ");
		float price = input.nextFloat();
		
		writeFile.println(id + "," + name + "," + unit + "," + price );
		System.out.println("Write file already...");
		
		writeFile.close();
	}

}
