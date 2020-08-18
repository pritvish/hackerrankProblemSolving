package codechef;

import java.util.Scanner;

public class ChefPriceControl {

    public static void priceControl(int ar[], int N, int K) {
        int loss = 0;
        for (int n=0; n<N; n++) {
            if(ar[n]>K) {
                loss += (ar[n]-K);
            }
        }
        System.out.println(loss);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();

        for (int t=0; t<tests; t++) {

            int N = scan.nextInt();
            int K = scan.nextInt();
            int ar[] = new int[N];

            for (int n=0; n<N; n++) {
                ar[n] = scan.nextInt();
            }

            priceControl(ar,N,K);
        }

    }
}
