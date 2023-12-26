import java.util.*;
public class Lab701 {
static int even=0;
static int odd=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[7];
		for(int i=0 ;i<nums.length;i++ ) {
			System.out.print("Input number " + (i+1) + ":");
			nums[i] = scan.nextInt();
		}
		System.out.println();
		
		 for(int _nums:nums){
	    if(_nums % 2 == 0) {
		   even++;
			}
	    else {
	    	odd++;
		}
	   }
		 System.out.println("There are " + odd + " of odd number");
	    	System.out.print("List of odd number : ");
	    	for(int _nums:nums){ {
	    		if(_nums % 2 != 0) {
	    		    	System.out.print(_nums + " ");
	    			}
	    	}
	 }
	}
}