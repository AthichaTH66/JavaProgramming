import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{

		Header();
		Level(null);
		

	}
	public static String Level(String id)throws IOException {
		
		Scanner file = new Scanner(new File("d://txtFile//student.txt"));
		while(file.hasNext()) {
			
			String ID = file.next();
			file.next();
			String fname = file.next().substring(0,1);
			String lname = file.next();
			int grade = file.nextInt();
			file.next();
			String fullname = fname + "."+ lname;
			int i = 1;
			if(ID.substring(0, 2) == "18") {
				return "4th";
			}
			else if(ID.substring(0, 2) == "19") {
				return "3th";
			}
			i++;
			
			System.out.println(i + "." + ID + "\t" + fullname + "\t"+ grade  + " "+ Status(grade) );
			
		}
		file.close();
		return null;
	}
	public static String Status(double grade1) {
		if(grade1 >= 2.00) {
			return "Pass";
		}else if(grade1 <= 1.00 || grade1 >= 2.00)
			return "Critical";
		else if(grade1 < 1.00) {
			return "retired";
		}
		return null;
	}
	public static String Header() {
		return "No" + "\t" + "ID" + "\t" + "Level" +"\t"+ "Name" +"\t"+ "Status";
	}

}
