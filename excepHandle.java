package pracCodes;

import java.util.*;

class excep{
	
	//int length,breath;
	
	public static int area(int l,int b) throws Exception {
		
		if (l<=0 || b<=0) {
			throw new Exception("Dont be a negative value");
		}
		int ar  = l*b;
		return ar;
	}
	public void meth(int a, int b) throws Exception{
		System.out.print("Area : " + area(a,b));
		
	}
}
public class excepHandle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		try {
			excep ex = new excep();
			int a = sc.nextInt();
			int b = sc.nextInt();
			ex.meth(a, b);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
	