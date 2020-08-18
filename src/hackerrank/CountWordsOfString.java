package hackerrank;

import java.util.Scanner;

public class CountWordsOfString {

    public static int countWordsOfString(String str) {
        int count = 1;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) <= 90 && str.charAt(i) >= 65)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        System.out.println(countWordsOfString(str));
    }
}
