package hackerrank;

import java.util.Scanner;

public class RightAngledTriangle {

    public static void rightAngledTriangle(int N) {
        for (int i=0; i<N; i++) {
            for (int j=0; j<N-i-1; j++) {
                System.out.print(" ");
            }
            for (int k=0; k< i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t=0; t<T; t++) {
            int N = scan.nextInt();
            System.out.println("Case #"+(t+1)+":");
            rightAngledTriangle(N);
        }
    }
}
