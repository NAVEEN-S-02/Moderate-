package pracCodes;

class ATM{
	synchronized public void balanceCheck(String name) {
		System.out.println(name + " Balance Checking");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
	
	synchronized public void withDraw(String name,int amount) {
		System.out.println(name + " Withdraw " + amount);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}

class customer1 extends Thread{
	ATM atm;
	String name;
	int amount;
	
	customer1(ATM atm,String name,int amount){
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}
	
	public void run() {
		atm.balanceCheck(name);
		atm.withDraw(name, amount);
	}
}

class customer2 extends Thread{
	ATM atm;
	String name;
	int amount;
	
	customer2(ATM atm,String name,int amount){
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}
	
	public void run() {
		atm.balanceCheck(name);
		atm.withDraw(name, amount);
	}
}

public class exampleATM {
	public static void main(String[] ar) {
		ATM atm = new ATM();
		customer1 c1 = new customer1(atm,"Naveen",5000);
		customer2 c2 = new customer2(atm,"Thilak",10000);
		c1.start();
		c2.start();
		
	}

}
// Before Synchronization Output:

//Thilak Balance Checking
//Naveen Balance Checking
//Naveen Withdraw 5000
//Thilak Withdraw 10000

//After Synchronization Output:

//Naveen Balance Checking
//Naveen Withdraw 5000
//Thilak Balance Checking
//Thilak Withdraw 10000
