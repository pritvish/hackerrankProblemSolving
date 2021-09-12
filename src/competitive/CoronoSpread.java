package competitive;

import java.util.Scanner;

public class CoronoSpread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int size = scanner.nextInt();
            int[] ar = new int[size];

            for (int i = 0; i < size; i++) {
                ar[i] = scanner.nextInt();
            }

            boolean bestcase = true;
            int bestcount = 1;

            // best case
            for (int i = 0; i < size - 1; i++) {
                if (ar[i + 1] - ar[i] < 3) {
                    bestcount++;
                } else {
                    bestcase = false;
                    break;
                }

            }
            System.out.print(bestcount + " ");

            int worstcount = 1;

            //worst case
            for (int i = 0; i < size - 1; i++) {
                if (ar[i + 1] - ar[i] < 3) {
                    worstcount++;
                }
            }
            if (size == 2) {
                System.out.print(worstcount + " ");
            } else if(bestcase == true) {
                System.out.print(bestcount + " ");
            }
            else {
                System.out.print(bestcount + 1 + " ");
            }
            System.out.println();
        }
    }
}
