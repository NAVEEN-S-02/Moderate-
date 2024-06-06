import java.util.Scanner;

public class arrays  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "th Element: ");
            arr[i] = scn.nextInt();
        }

        System.out.println("Array elements:");
        for (int x : arr) {
            System.out.println(x);
        }

        // Close the scanner after using it
        scn.close();
    }
}
