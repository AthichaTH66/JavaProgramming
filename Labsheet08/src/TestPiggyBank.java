import java.util.*;
public class TestPiggyBank {
static PiggyBank pb = new PiggyBank();
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
	    inputCoin();}
	/*		pb.setPiggyBank(500);
			System.out.println("Money Total : " + pb.getTotal());
			pb.addTwo (34);
			System.out.println("Add 2 Baht Money : " + 34);
			System.out.println("Money Total : " + pb.getTotal());
			pb.addTen (13);
			System.out.println("Add 10 Baht Money : " + 13);
			System.out.println("Money Total : " + pb.getTotal()); 
			pb.addFive(100);
	}
} */
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of PiggyBank: " + pb.getPiggyBank());
		MainMenu();
	}
	
	public static void MainMenu() {
		
		while(true) {
			System.out.println("==================");
			System.out.println("Menu of PiggyBank");
			System.out.println("==================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit baht.");
			System.out.println("==================");
			System.out.print("Please select menu[1-5] : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("Insert 1 baht money: ");
				int money = scan.nextInt();
				pb.addOne(money);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
				
			}else if (menu == 2) {
				System.out.print("Insert 2 baht money: ");
				int money = scan.nextInt();
				pb.addTwo(money);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
				
			}else if (menu == 3) {
				System.out.print("Insert 5 baht money: ");
				int money = scan.nextInt();
				pb.addFive(money);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
				
			}else if (menu == 4) {
				System.out.print("Insert 10 baht money: ");
				int money = scan.nextInt();
				pb.addTen(money);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
			}else if (menu == 5) {
				System.out.println("Bye bye");
				break;
			}
			
			
		}
	}
}