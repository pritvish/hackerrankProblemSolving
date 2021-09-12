package competitive;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonDivisibleSubset {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int num = scan.nextInt();

        int[] ar = new int[size];

        for (int t=0; t<size; t++) {
            ar[t]=scan.nextInt();
        }

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<size-1; i++) {
            for (int j=i+1; j<size; j++) {

                if ((ar[i]+ar[j])%num != 0) {
                    set.add(ar[i]);
                    set.add(ar[j]);
                }
            }
        }

        System.out.println(set.size());

    }
}
