import java.util.*;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		
		Scanner File = new Scanner(new File("d://txtFile//MemberLogin.txt"));

		while(File.hasNext()) {
			String fname = File.next();
			File.next(); //Lastname
			File.next(); //password
			String email = File.next().toUpperCase();
			System.out.println(fname + " " +"("+ email + ")");
		}
		//close file
		File.close();
		
	}

}
