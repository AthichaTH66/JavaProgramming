import java.io.*;
import java.util.Scanner;
public class ATMChecking extends ATMData{
	
	private int money;

	ATMChecking(String accountNumber, String password,int money) {
		super(accountNumber, password);
		this.money = money;
	}
	public boolean checkBookBank()throws IOException {
		Scanner file = new Scanner(new File("d://txtFile//ATMBookBank.txt"));
		while(file.hasNext()) {
			String id = file.next();
			String pass = file.next();
			int Money = file.hashCode();
			
			if(id.equalsIgnoreCase(super.getID())) {
				return true;
			}
			else if(pass.equalsIgnoreCase(super.getPass())){
				return true;
			}
			else if(Money <= money) {
				return true;
			}
		}
		return false;
	}
	public void show() {
		
	}

}
