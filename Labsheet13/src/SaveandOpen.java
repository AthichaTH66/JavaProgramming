import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {

	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		String answer;
		do {
			Header();
			System.out.print("Enter name : ");
			name = input.next();
			System.out.print("Enter department : ");
			dept = input.next();
			writeFile.print(name + "\t" + dept);
			
			System.out.print("Enter data again?: ");	
			answer = input.next();
		}while(answer.equals("y"));
		
		writeFile.close();
	}
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			int count=0,i=1;
			Header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i+")"+name);
					count++;
					i++;
					check = true;
				}
				if(check == false) {
					Header();
					System.out.println("\nSorry, no department: "+ super.getDept() + " in file.");
				}
			}
			Header();
			System.out.println("Employee in dept " + super.getDept() + " is " +count + " person.");
			
		}
		catch(IOException e) {
			System.out.println("Sorry,file not found");
		}
		
	}
}
