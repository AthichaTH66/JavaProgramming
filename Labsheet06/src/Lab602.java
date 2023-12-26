import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("" + "Input year:"));
          
		while(!(checkyear(year))) {
			year = Integer.parseInt(JOptionPane.showInputDialog("" + "Please input year between 1000-3000,\nInput year again"));
		}
		
		JOptionPane.showMessageDialog(null,isleapyear(year)?year +" is leap Year" : year +" is not leap Year"  );
		
		/*if(isleapyear(year)) {
			JOptionPane.showMessageDialog(null,year +" is leap Year" );
		}
		else {
			JOptionPane.showMessageDialog(null,year +" is not leap Year" );
		}*/
		
	}
	public static boolean isleapyear(int year) {
		if((year%4 == 0)&&((year%100!= 0))||(year%400==0)){
			return true;
		}
		
		else return false;
	}
	public static boolean checkyear(int year) {
		
		if(year >= 1000 && year <= 3000) {
			return true;
		}
		
		else return false;
	}
	

}
