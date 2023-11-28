package IncomeTaxCalculator;
import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		// Declare variable
		
		int taxableIncome;
		double taxPayable;
		
		//assume input for taxable income
		taxableIncome = 85000;
		
		//compute tax payable in 4 cases
		if(taxableIncome<=20000) { //0-20,000
			taxPayable = 0;
		}
		else if(taxableIncome<=40000) {//20,000-40,000
			taxPayable = (taxableIncome-20000) * TAX_RATE_ABOVE_20K;
		}
		else if(taxableIncome<=60000) {//40,000-60,000
			taxPayable = 20000*TAX_RATE_ABOVE_20K+(taxableIncome-40000) * TAX_RATE_ABOVE_20K;
		}
		else {
			taxPayable =(20000*TAX_RATE_ABOVE_20K)+(20000*TAX_RATE_ABOVE_40K)+(taxableIncome-60000) * TAX_RATE_ABOVE_60K ;
		}
		//Print tax payable rounded to 2 decimal places
		//System.out.print("the income tax payable is : "+taxPayable);
		System.out.printf("Tshe income tax payable is : %.2f", taxPayable);
	}

}
