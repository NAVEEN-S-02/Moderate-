package pracCodes;

import java.util.Scanner;
import java.io.File;


public class fileRead {
	public static void main(String[] srg) {
		
		try {
		File f = new File("C:\\Users\\Naveen\\Moderate\\Example.txt");
		if (f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.length());
		}
		try (Scanner reader = new Scanner(f)) {		//for closing opened resources i used try with resources
			while(reader.hasNextLine()) {			// it checks whether the file contains next line or not
				System.out.println(reader.nextLine());//it reads the string value and prints
			}
		}
		}
		catch(Exception e) {
			System.out.print("Please provide the valid file Location");
		}
		
		
	}

}