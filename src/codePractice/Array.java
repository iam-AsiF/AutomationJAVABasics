package codePractice;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] num = new int[10];
        num[0] = 1;
        num[3] = 100;
        System.out.println(num[0]);

        // take array size from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        int size = input.nextInt();
        System.out.println(size);

        int arr[] = new int[size];
        for (int i=0; i<arr.length; i++){
            int x = input.nextInt();
            arr[i] = x;

            // now take input from and print like an array
//            for (int j=0; j<arr.length; )

        }
    }
}
