package hackerrank;

import java.util.Scanner;

public class SumOfArrayElements {

    public static void sumOfArray(int ar[]) {
        long sum = 0;
        for (int n : ar) {
            sum = sum + n;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tests = s.nextInt();

        for (int t=0; t<tests; t++) {
            int N = s.nextInt();
            int ar[] = new int[N];

            for (int n=0; n<N; n++) {
                ar[n] = s.nextInt();
            }
            sumOfArray(ar);
        }

    }
}
