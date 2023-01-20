package codePractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = reader.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}