package hackerrank;

import java.util.Scanner;

public class LeftRotationArray {

    public static void leftRotationArray(int ar[],int d, int n) {
        int temp = 0;
        if (d==n) {
            for (int a : ar) {
                System.out.print(a+" ");
            }
        } else {
            for (int i=0; i<d; i++) {
                temp = ar[i];
                ar[i] = ar[n-1];
                ar[n-1] = temp;
            }
        }
        for (int a : ar) {
            System.out.print(a+" ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        leftRotationArray(a,d,n);

        scanner.close();
    }
}
