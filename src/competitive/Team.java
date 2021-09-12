package competitive;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tests = s.nextInt();
        int sum = 0;

        for (int t = 0; t < tests; t++) {
            int p = s.nextInt();
            int v = s.nextInt();
            int te = s.nextInt();

            if ((p + v + te) > 1) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
