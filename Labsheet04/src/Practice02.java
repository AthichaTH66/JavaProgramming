import java.util.*;
import java.text.NumberFormat;
public class Practice02 {

	public static void main(String[] args) {
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		double employeeContribution , employerContribution , totalContribution ;
		int salary , age ;
		
		System.out.print("Enter the monthly salary : ");
	    salary = scan.nextInt();
		System.out.print("Enter the age : ");
	    age = scan.nextInt();
	    
	    int contributableSalary = Math.min(salary, SALARY_CEILING);
	    
		if(age <= 55) {
			employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
			totalContribution = employeeContribution + employerContribution ;
		}
		else if (age <= 60) {
			employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = salary * EMPLOYER_RATE_55_TO_60;
		}
		else if (age <= 65) {
			employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = salary * EMPLOYER_RATE_60_TO_65;
		}
		else {
			employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = salary * EMPLOYEE_RATE_65_ABOVE;
		}
		totalContribution = employeeContribution + employerContribution;
		System.out.println("The employee's contribution is: "+f1.format(employeeContribution));
		System.out.println("The employer's contribution is: "+f1.format(employerContribution));
		System.out.printf("The total contribution is: "+f1.format(totalContribution));

	}

}
