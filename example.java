import java.util.Scanner;

public class example {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
       // scn.close();
        System.out.println("Enter the Size of an array: ");

        int n = scn.nextInt();

        int[] Arr = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter the"+ (i+1) +"th Element");
            Arr[i]= scn.nextInt();
        }

        for (int x: Arr){
            System.out.println(x);
        }



        scn.close();
    }
}
