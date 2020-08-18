package hackerrank;

import java.util.Scanner;

public class CountingValley {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int steps = scan.nextInt();

        String track = scan.nextLine();
        int count = 0;
        for (int i = 0; i<track.length()-1; i++) {
            if (track.charAt(i)=='D' && track.charAt(i+1)=='U') {
                count++;
            }
        }
        System.out.println(count);
    }
}
