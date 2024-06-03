package Udemy;
import java.util.*;

public class oddEven {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		if (N%2!=0)
            System.out.println("Weird");
		
        if(N%2 == 0) {
            if (N>1 && N<6) {
                System.out.println("Not Weird");
            }
            else if(N>5 && N<21) {
                System.out.println("Weird");
            }
            else 
                System.out.println("Not Weird");
        }
        scn.close();
		
	}

}
