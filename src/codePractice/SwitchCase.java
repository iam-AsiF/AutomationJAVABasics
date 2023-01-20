package codePractice;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text btn 'abc', 'def', 'ghi': ");
        String s = input.next();

        switch (s){
            case "abc":
                System.out.println("case 1");
                break;
            case "def":
                System.out.println("case 2");
                break;
            case "ghi":
                System.out.println("case 3");
                break;
            default:
                System.out.println("Default case");
        }

    }

}
