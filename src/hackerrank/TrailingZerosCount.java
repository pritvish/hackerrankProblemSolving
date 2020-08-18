package hackerrank;

import java.util.Scanner;

public class TrailingZerosCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int factorial = 1;
        for (int i=num; i>0; i--) {
            factorial*=num;
        }

        int temp = factorial;

        // find the length of factorial

        while(factorial!=0) {
            factorial = factorial/10;
        }

        // while finding the length check if the digit is zero, then increment the zerocount++


    }
}
