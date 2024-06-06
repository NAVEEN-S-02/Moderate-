package Udemy;

import java.util.Scanner;

public class constr {
	private String rollNo;
	private String name;
	private int maxMarks;
	private int markObtain;
	
	public String getrollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public int getMarkObtain() {
		return markObtain;
	}
	//public void setMaxMarks (int maxMarks) {
		//this.maxMarks = maxMarks;
	//}
	public void setMarkObtain (int markObtain) {
		this.markObtain = markObtain;
	}
	public constr() {
		rollNo = "0";
		name = "def";
		maxMarks = 100;
		markObtain = 0;
	}
	public constr(String rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public constr (int markObtain) {
		this.markObtain = markObtain;
	}
	public constr(String rollNo,String name,int markObtain) {
		this.rollNo = rollNo;
		this.name = name;
		this.markObtain = markObtain;
	}
	public int average(int ...markObtain) {
		//int[] avr = new int[markObtain.length];
		int sum = 0;
		for (int i=0;i<markObtain.length;i++) {
			sum += markObtain[i];
		}
		int avr = sum/markObtain.length;
		
		return avr;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the student Roll Number :");
		String rollNo = scn.next();
		System.out.println("Enter the student Name :");
		String name = scn.next();
		System.out.println("Enter the student Max Marks :");
		String roll = scn.next();
		scn.close();
	}
}
