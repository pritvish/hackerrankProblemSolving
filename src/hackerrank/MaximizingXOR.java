package hackerrank;

import java.util.Scanner;

public class MaximizingXOR {

    public static int maximizingXOR(int l, int r) {
        int max = 0;
        for(int i = l; i<=r; i++) {
            for (int j = l; j<=r; j++) {
                if((i^j) > max) {
                    max = i^j;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        System.out.println(maximizingXOR(l,r));

    }
}
