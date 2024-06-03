package Udemy;
import java.util.*;

public class numberWords {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scn.nextInt();
		
		if (num<=0) {
			System.out.print("Please Evnter Valid number!!");
		}
		
		int rem;
		int count = 0;
		String str = "";
		while(num>0) {
			rem = num % 10;                 // rem = 1234 % 10 = 4
			//System.out.println(rem);
			str = str + rem;
			count += 1;
			num = num / 10;
		}
		System.out.println(str);
		System.out.println("Number of digits present in the entered number is: " + count);
		//scn.nextLine();
		
		char c;
		
		for (int i=str.length()-1;i>=0;i--) {
			c = str.charAt(i);
			switch(c) {
			case '0':
			{
				System.out.print("Zero");
				break;
			}
			case '1':
			{
				System.out.print("One ");
				break;
			}
			case '2':
			{
				System.out.print("Two ");
				break;
			}
			case '3':
			{
				System.out.print("Three ");
				break;
			}
			case '4':
			{
				System.out.print("Four ");
				break;
			}
			case '5':
			{
				System.out.print("Five ");
				break;
			}
			case '6':
			{
				System.out.print("Six ");
				break;
			}
			case '7':
			{
				System.out.print("Seven ");
				break;
			}
			case '8':
			{
				System.out.print("Eight ");
				break;
			}
			case '9':
			{
				System.out.print("Nine ");
				break;
			}
			}
				
		}
		scn.close();
	}

}
