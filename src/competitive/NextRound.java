package competitive;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        int count = 0;

        if (ar[k - 1] == 0) {
            for (int i = 0; i < n; i++) {
                if (ar[i] > 0)
                    count++;
            }
        } else if (ar[k - 1] > 0) {
            for (int i = 0; i < n; i++) {
                if (ar[i] >= ar[k - 1] )
                    count++;
            }
        }


            System.out.println(count);
    }
}
