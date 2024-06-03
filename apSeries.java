package Udemy;

import java.util.*;

public class apSeries {
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Starting number of AP Series: ");
		int a = scn.nextInt();
		System.out.println("Enter the common difference: ");
		int d = scn.nextInt();
		System.out.println("Enter the number of terms: ");
		int n = scn.nextInt();
		
		int fn = a;
		for (int i=1;i<=n;i++) {
			System.out.print(fn + " ");
			//System.out.print(" ");
			fn += d;
			 
		}
		scn.close();
	}
}
