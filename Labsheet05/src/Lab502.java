import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          	//the cat is sleeping on the bed
          System.out.print("Input some sentence : ");
          String sentence = scan.next();
          
          while(!sentence.endsWith(".")) {
        	  System.out.print("The sentence must end with full stop point :  ");
              sentence = scan.next();
          }
          System.out.println();
          for(int i = 0; i < sentence.length();i++) {
        	  if(sentence.charAt(i)==' ') {
        		  System.out.print(sentence.substring(0,' ') + "\n");
        	  }
          }

	}

}