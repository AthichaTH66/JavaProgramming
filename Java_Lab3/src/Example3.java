import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height"));
		
	    height = height/100 ;
		double BMI = weight/(height * height);
		String bmiCategory;
		
		if(BMI <= 18.5) bmiCategory = "Underweight";
		else if(BMI <= 24.9) bmiCategory = "Normal-weight";
		else if(BMI <= 30) bmiCategory = "Overweight";
		else bmiCategory = "Obesity";
		
		JOptionPane.showMessageDialog(null," BMI = " + String.format("%.1f",BMI) + "\n You're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE );
		
		}
			
	}

