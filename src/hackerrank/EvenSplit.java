package hackerrank;

import java.util.Scanner;

public class EvenSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t=0; t<T; t++) {
            long n = scan.nextLong();

            if(n%2==0 && (n/2)%2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
