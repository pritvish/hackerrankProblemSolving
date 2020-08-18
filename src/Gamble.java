import hackerrank.SampleStringEvidence;

import java.util.Scanner;

public class Gamble {

    static int sum = 0;

    public static int solution(int N, int K) {
        if (N == 1) {
            return sum;
        }

        if (N > 1 && K > 0 && N % 2 == 0) {
            sum++;
            return solution(N / 2, K - 1);
        } else {
            sum++;
            return solution(N - 1, K);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();

        System.out.println(solution(N, K));

    }
}
