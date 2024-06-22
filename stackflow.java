package pracCodes;

import java.util.*;

class negaArr extends Exception{
	
	public negaArr(String mes) {
		super(mes);
	}
	/**@Override
	public String toString() {
		return "Size should not be Negative";
	}
	**/
}

class stackOverFlow extends Exception{
	@Override
	public String toString() {
		return "Size of an Storage Elements Increased";
	}
}


class stackUnderFlow extends Exception{
	@Override
	public String toString() {
		return "No elements is present to delete";
	}
}

class stack{
	private int size;
	private int[] S;
	private int top =-1;	// for the ref of element index
	
	public void Stack(int n)throws negaArr {
		if (n<0) {
			throw new negaArr("Size must be positive");
		}
		size = n;
		
		S = new int[size];
	}
	
	public void push(int x)throws stackOverFlow {
		if(top == size-1) {
			throw new stackOverFlow();   // if index value is equal to top throw exception
		}
		top++;						// else add elements
		S[top]=x;
		for (int a: S) {
			System.out.println(a);
		}
	}
	
	public int pop() throws stackUnderFlow {
		int x = -1;				// for temp storing purpose
		if (top == -1 ) {
			throw new stackUnderFlow();  // if no element in the stack means throw exception
		}
		
		x=S[top];				// assinging index(top) value to x
		top--;					// reducing top value  
		return x;	
	}
}
public class stackflow {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int size = sc.nextInt();
			stack s = new stack();
			s.Stack(size);
			
			s.push(9);
			s.push(9);
			s.push(9);
			s.push(9);
			s.push(9);
			s.pop();
		}
		catch (stackOverFlow e) {
			System.out.println(e);
		}
		catch (stackUnderFlow e) {
			System.out.println(e);
		}
		catch (negaArr e) {
			System.out.println(e);
		}
	}
	

}
