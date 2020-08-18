package hackerrank;

import java.util.Scanner;

public class CheckSubSequence {

    public static boolean isSubsequencePresent(String s1, String s2, int s1len, int s2len) {
        int j = 0;

        for (int i = 0; i < s2len && j < s1len; i++)
            if (s1.charAt(j) == s2.charAt(i))
                j++;

        return (j == s1len);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int tests = s.nextInt();

        for (int t=0; t<tests; t++) {
            String s1 = s.next();
            String s2 = s.next();
            int s1len = s1.length();
            int s2len = s2.length();

            boolean result = isSubsequencePresent(s1,s2,s1len,s2len);

            if(result==true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
