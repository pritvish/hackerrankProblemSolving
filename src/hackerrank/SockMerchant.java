package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nosSocks = scan.nextInt();

        int[] arrSocks = new int[nosSocks];

        for (int i = 0; i<nosSocks; i++) {
            arrSocks[i] = scan.nextInt();
        }

        Arrays.sort(arrSocks);
        int count = 0;

        for (int i = 0; i<nosSocks; i++) {

            if(i<nosSocks-1 && arrSocks[i]== arrSocks[i+1]) {
                count++;
                i++;
            }
        }

        System.out.println(count);
    }
}
