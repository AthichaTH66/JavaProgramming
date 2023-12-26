import java.util.*;
public class Lab604 {
	
static Scanner input = new Scanner(System.in);
static String  studentId,subId;
static int subjectId;
boolean stdIT,subIT;

	public static void main(String[] args) {
		
		inputStudent();
		//isLength();
		//isITStudent();
		//isITsubject();
		//displayData();
	}
		
	public static void inputStudent() {
      do {
		System.out.print("Enter student ID : ");
		studentId = input.next();
		System.out.print("Enter subject ID : ");
		subjectId = input.nextInt();
		subId = subjectId + "";
		
      }while(!isLength(studentId,subId));
      System.out.println();
      //displayData();
	}
	public static boolean isLength(String sid,String subId) {
		if(sid.length()==10 && subId.length()==7){
			return true;
		}
		 return false;
	}
	public static boolean isITStudent(String sid) {
		if(sid.substring(0,3).equals("211") && sid.substring(3,6).equals("311")) {
			return true;
		}
		return false;
	}
	public static boolean isITSubject(String sid) {
		if(sid.substring(0,2).equals("21") && sid.substring(4,5).equals("1")) {
			return true;
		}
		return false;
	}
	public static void displayData(boolean stdIT,boolean subIT ) {
		if(stdIT) {
			System.out.println("Student id: "+ studentId + " 1st year student in IT");
		}
		else System.out.println("Student id: "+ studentId + " is not 1st year student in IT");
	
	if(subIT) {
		System.out.println("Enroll in courses for year 1");
	}
	else System.out.println("not Enroll in courses for year 1");
   }
}
