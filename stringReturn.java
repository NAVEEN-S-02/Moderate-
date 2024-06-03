package Udemy;
import java.util.*;

public class stringReturn {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int n = scn.nextInt();
		/**everyNth en = new everyNth(str,n);
		for (int i = 0;i<str.length();i++)
		{
			System.out.println(str.charAt(i + n));
		}**/
		String result = "";
		  
		  
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  System.out.println(result);
		scn.close();
	}

}
