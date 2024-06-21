package pracCodes;

import java.util.*;

class negativeDim extends Exception{
	public String toString() {
		return "Dont provide negative value";
	}
}
class userexce{
	
	//int length,breath;
	
	int area(int l,int b) throws negativeDim {
		
		if (l<=0 || b<=0) {
			throw new negativeDim();
		}
		int ar  = l*b;
		return ar;
	}
	public void meth(int a, int b) throws negativeDim{
		System.out.print("Area : " + area(a,b));
		
	}
}
public class userExcep {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			userexce ex = new userexce();
			int a = sc.nextInt();
			int b = sc.nextInt();
			ex.meth(a, b);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
	}
}
	