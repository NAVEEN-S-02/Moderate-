package Udemy;
import java.util.*;

public class returnStrng
{
	public String frontBack(String str) {
		  char a = str.charAt(0);
		  int n = str.length();
		  char b = str.charAt(n-1);
		  if(n<=1)
		  {
		    return str;
		  }
		  return b + str.substring(1,n) + a;
		
		}
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		returnStrng rs = new returnStrng();
		rs.frontBack(str);
		scn.close();
	}
}
