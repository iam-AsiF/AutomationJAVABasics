package codePractice;

import java.util.Scanner;

public class OOP {

    public void test() {
        System.out.println("too cold");
    }

    // void -- expect nothing in return.
    // return -- expect specific param to return

//    public int add(int x, int y) {
//        int sum = x + y;
//        return sum;
//    }

//    public int min(int x, int y) {
//        int sub = x - y;
//        return sub;
//    }

    // using switch case to ask user 3 inputs - 2 numbers and the action to perform
    public int cal(int x, int y, String action) {
        int sum;
        switch (action) {
            case "sum":
                sum = x + y;
                break;
            case "sub":
                sum = x - y;
                break;
            default:
                System.out.println("please provide a valid action, should be 'sum' or 'sub'.");
                sum = 0;
        }
        return sum;
    }

    public static void main(String[] args) {

        OOP oopClass = new OOP();
        oopClass.test();

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("pleas enter first integer: ");
        int m = input.nextInt();
        System.out.println("pleas enter second integer: ");
        int n = input.nextInt();

        int a = oop.add(m, n);
        int b = oop.min(m, n);

        System.out.println(a);
        System.out.println(b);

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = input.nextInt();
        System.out.println("Please enter second number: ");
        int b = input.nextInt();
        System.out.println("Please enter an action to perform: 'sum' or 'sub': ");
        String c = input.next();

        int d = oopClass.cal(a, b, c);
        System.out.println(d);

    }

}
