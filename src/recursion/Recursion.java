package recursion;

import java.util.Scanner;

public class Recursion {
    static int sumOfFirstNDesc(int num) {
        if(num == 0) return 0;
        return num + sumOfFirstNDesc(num - 1);
    }

    static void sumOfFirstNAsc(int num,
                               int counter,
                               int sum) {
        if(counter == num) {
            sum += counter;
            System.out.println(sum);
            return;
        }
        sum += counter;
        sumOfFirstNAsc(num, counter + 1, sum);
    }

    static int printFact(int num) {
        if(num == 0 || num == 1) return 1;
        return num * printFact(num - 1);
    }

    static void printExtraFibonacci(int a,
                                    int b,
                                    int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(a + b + " ");
        printExtraFibonacci(b, a + b, n - 1);
    }

    static int xPowerN(int x,
                       int n) {
        if(x == 0) return 0;
        if(n == 1) return x;
        return x * xPowerN(x, n - 1);
    }

    static int xPowerNLogN(int x,
                           int n) { // creates a memory stack of logN
        if(x == 0) return 0;
        if(n == 1) return x;
        if(n % 2 == 0) return xPowerNLogN(x, n/2) * xPowerNLogN(x, n/2);
        else return xPowerNLogN(x, (n-1)/2) * xPowerNLogN(x, (n-1)/2) * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfFirstNDesc(10));
        sumOfFirstNAsc(10, 1, 0);
        System.out.println(printFact(5));
        printExtraFibonacci(0, 1, 5);
        System.out.println(xPowerN(10, 4));
        System.out.println(xPowerNLogN(10, 4));
    }
}
