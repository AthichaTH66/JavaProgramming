import java.io.*;
public class Lab1203 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader File = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));

		String temp = "";
		
		int countBook = 0,i=1;
		while((temp = File.readLine()) != null) {
			String [] data = temp.split("\t");
			System.out.println(i + "." + data[0] + " (" + data[1] + "), rating " + data[2] + " publish on " + data[5] );
			countBook++;
			i++;
		}
		System.out.println("==========================");
		System.out.println("Total book = " + countBook);
		File.close();
		
		
	}

}
