package Udemy;

import java.util.*;

public class fibb {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = scn.nextInt();
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for (int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		scn.close();
		
	}

}
