package codePractice;

import java.util.Scanner;

public class BubbleSort_1 {

    static Scanner sc = new Scanner(System.in);

    public void sort1(int[] array) {
        // bubble sort min to max
        // (n-1) for arrayIndex ; (n-1-i) for last box getting fixed with every iteration
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }

    public void sort2(int[] array) {
        // bubble sort max to min
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.print("Please enter five numbers you want to sort: ");
        for (int a = 0; a < array.length; a++) {
            array[a] = sc.nextInt();
        }

        BubbleSort_1 finalSort = new BubbleSort_1();
        finalSort.sort1(array);
        System.out.println("---------------------------------------------");
        finalSort.sort2(array);

    }

}