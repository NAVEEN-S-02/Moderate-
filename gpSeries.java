package Udemy;

import java.util.Scanner;

public class gpSeries {
public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Starting number of GP Series: ");
		int a = scn.nextInt();
		System.out.println("Enter the Ratio: ");
		int r = scn.nextInt();
		System.out.println("Enter the number of terms: ");
		int n = scn.nextInt();
		
		int fn = a;
		for (int i=1;i<=n;i++) {
			System.out.print(fn + " ");
			//System.out.print(" ");
			fn *= r;
			 
		}
		scn.close();
		
	}

}
