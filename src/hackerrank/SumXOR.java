package hackerrank;

import java.util.Scanner;

public class SumXOR {

    public static int sumXOR(long n) {
        int count = 0;
        for (int i=0; i<n; i++) {
            if(n+(long)i == (n^(long)i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.println(sumXOR(n));
    }
}
