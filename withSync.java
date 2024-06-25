package pracCodes;

class myData1{
	synchronized public void display(String str) {
		for (int i=0;i<str.length();i++) {
			System.out.println(i + " = " + str.charAt(i));
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.print("File Interupted");
			}
		}
	}
}

class thread11 extends Thread{
	myData data;
	thread11 (myData data){
		this.data = data;
	}
	
	public void run() {
		data.display("Hello World!");
		
	}
}

class thread22 extends Thread{
	myData data;
	thread22 (myData data){
		this.data = data;
	}
	

	public void run() {
		data.display("Java!");
	}
}
public class withSync {
	public static void main(String[] ar) {
		myData data = new myData();
		thread11 t1 = new thread11(data);
		thread22 t2 = new thread22(data);
		t1.start();
		t2.start();
	}
}
