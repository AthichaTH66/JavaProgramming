import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = {78,36,58,41,25,92,75};
		System.out.print("Input index of array : ");
		int input = scan.nextInt();
		
		while(true) {
			System.out.print("Input index of array, again : ");
			 input = scan.nextInt();
			 if(input>=0 && input <= 7)
				 break;
			 }
		System.out.println("Value in current index is " + nums[input]);
		System.out.println("Value in next index is " + nums[input+1]);
		}
	}

