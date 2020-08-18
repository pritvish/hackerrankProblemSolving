package hackerrank;

import java.util.Scanner;

public class NosDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t=0; t<T; t++) {
            int n = scan.nextInt();
            int count =0 ;
            for (int i=1; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i)
                        count++;
                    else
                        count = count + 2;
                }
            }
            System.out.println(count);
        }
    }
}
