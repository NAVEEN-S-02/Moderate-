package Udemy;
import java.util.*;


public class arrayEx {
	int count = 0,sums = 0,maxs = 0;
	public int sum (int arr[]) {
		//int sums = 0;
		for (int i=0;i<arr.length;i++) {
			sums += arr[i];
		}
		return sums;
	}
	public int returns(int[] arr,int n) {
		//int count = 0;
		for (int i=0;i<arr.length;i++) {
			if ( arr[i] == n) {
				return i; 
			}
		}
		return 0;
	}
	public int max(int[] ber) {
		for (int i=0;i<ber.length;i++) {
			if (ber[i] > maxs) {
				maxs = ber[i];
			}
		}
		return maxs;
		}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Value :");
			arr[i]= scn.nextInt();
		}
		for (int x:arr) {
			System.out.println("The Elemnt is : "+ x);
		}
		arrayEx obj = new arrayEx();
		System.out.println(obj.sum(arr));
		System.out.println(obj.returns(arr,5));
		System.out.println(obj.max(arr));
		scn.close();
	}

}
