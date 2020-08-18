package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfPairs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t=0; t<T; t++) {

            int n = scan.nextInt();
            int K = scan.nextInt();
            int[] arr = new int[n];

            for(int a=0; a<n; a++) {
                arr[a] = scan.nextInt();
            }

            boolean result = false;
            HashSet<Integer> s = new HashSet<Integer>();
            for (int i = 0; i < arr.length; ++i) {
                int temp = K - arr[i];

                // checking for condition
                if (s.contains(temp)) {
                    result = true;
                    break;
                }
                s.add(arr[i]);
            }

            if (result) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
