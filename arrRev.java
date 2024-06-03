package Udemy;
import java.util.*;

public class arrRev {
	public int[] rev(int[] arr){
		int[] brr = new int[arr.length];
		for (int i=arr.length-1,j=0;i>=0;i--,j++){
			brr[j]=arr[i];
		}
		return brr;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++)
			arr[i] = scn.nextInt();
		arrRev obj = new arrRev();
		int[] ar = obj.rev(arr);
		for (int x:ar)
			System.out.println(x);
		
		scn.close();
	}

}
