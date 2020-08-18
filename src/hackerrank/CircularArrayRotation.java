package hackerrank;

import java.util.Scanner;

public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] ar, int k, int[] queries) {
        int temp = 0;
        for (int a = 0; a < k; a++) {
            temp = ar[ar.length - 1];
            for (int i = ar.length - 2; i >= 0; i--) {
                ar[i + 1] = ar[i];
            }
            ar[0] = temp;
        }

        int ans[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = ar[queries[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt(); // size of array
        int k = inp.nextInt(); // nos rotation
        int q = inp.nextInt(); // nos queries

        int ar[] = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = inp.nextInt();
        }

        int queries[] = new int[q];

        for (int i = 0; i < q; i++) {
            queries[i] = inp.nextInt();
        }

        int ans[] = new int[q];

        ans = circularArrayRotation(ar, k, queries);

        for (int a : ans) {
            System.out.println(a);
        }

    }
}
