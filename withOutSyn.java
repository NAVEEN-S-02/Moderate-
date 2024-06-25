package pracCodes;

//Shared Object for threads
//thread1 && thread2 shared object like having mutual exclusion(Locking/mutex) 

class myData{
	public void display(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(i + " = " + str.charAt(i));
		}
		
	}
}

class thread1 extends Thread{
	 myData data;				//for accessing shared data,we create reference for that data in this class
	 thread1 (myData data){		//Receiving ref to that shared data via constructor
		 this.data = data;      // recieved ref is assigned to current class ref
	 }
	 @Override
	 public void run() {
		 data.display("Hello World!"); // calling shared data
	 }
}

//Same as thread1 class
class thread2 extends Thread{
	 myData data;
	 thread2 (myData data){
		 this.data = data;
	 }
	 public void run() {
		 data.display("Hello Java!");
	 }
}

public class withOutSyn {
	public static void main(String[] args) {
		myData data = new myData();			
		thread1 tr = new thread1(data);
		thread2 tr2 = new thread2(data);
		
		tr.start();
		tr2.start();		
	}

}
