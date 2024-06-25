package pracCodes;

class test extends Thread{
	public void run() {
		int i= 0;
		while(i<15) {
			System.out.println("Hi");
			i++;
		}
	}
	
}

public class myThread {
	public static void main(String[] arg) {
		test t = new test();
		t.start();
		
		int i=0;
		while(i<15) {
			System.out.println(i);
			i++;
		}
		
	}
	
}


