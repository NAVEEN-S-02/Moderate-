package Udemy;

import java.util.*;
/**
public class helloWorld {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		System.out.println("Hello World!");
		System.out.println(a);
		scanner.close();
	}

}**/
public class helloWorld {
public String lastChars(String a, String b) {
	  int n = a.length();
	  int m = b.length();
	  if (n>0 && m>0){
	    return a.substring(0,1) + b.substring(m-1);
	  }
	  if (n==0 && m>0)
	  {
	    return '@' + b.substring(m-1);
	  }
	  if (n>0 && m==0)
	  {
	    return a.substring(0,1) + '@';
	  }
	  
	  return "@@";
	}
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	String a = scn.next();
	String b = scn.next();
	helloWorld hw = new helloWorld();
	hw.lastChars(a,b);
	scn.close();
}
}
