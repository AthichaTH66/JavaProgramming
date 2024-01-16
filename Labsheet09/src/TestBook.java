import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			Book b = new Book();
			
			System.out.print("Input book title : ");
			String title = scan.nextLine();
			
			System.out.print("Input book price : ");
			float price = scan.nextFloat();
			
			System.out.print("Input publish year : ");
			int year= scan.nextInt();
			
			b.setPrice(price);
			b.setPublishyear(year);
			b.setTitle(title);
			
			System.out.println();
			System.out.println(b);
		}
		

	}

}
