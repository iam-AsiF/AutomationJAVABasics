package codePractice;

public class PrimeNumber {

    static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        /*
        Here, we took m = n/2 for code optimization. if a number is not divisible
        half of that number it won't be divisible with rest of the number. for
        example, n=11, m=11/2 ~ 5. Now, if 11 is not divisible by 2 to 5 it won't be
        divisible with for than 5.
         */
        if (n < 0) {
            System.out.println("Please enter a positive number");
        } else {
            if (n == 0 || n == 1) {
                System.out.println(n + " is not a prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not a prime number");
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }

    }

    // what if we want to consider negative numbers also?
    static void checkPrime1(int n) {
        int i, m, flag = 0;
        m = n / 2;

        if (n == 0 || n == 1 || n == -1) {
            System.out.println(n + " is not a prime number.");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % 2 == 0) {
                    System.out.println(n + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            for (i = -2; i >= m; i--) {
                if (n % -2 == 0) {
                    System.out.println(n + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(n + " is a prime number.");
        }
    }

    public static void main(String[] args) {
        checkPrime(11);
        checkPrime(-10);
        checkPrime(2);
        checkPrime(3);
        System.out.println("------------------------------------------");
        checkPrime1(-11);
        checkPrime1(-6);
        checkPrime1(-120);
        checkPrime1(-17);
    }

}
