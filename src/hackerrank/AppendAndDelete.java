package hackerrank;

import java.util.Scanner;

public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {

        int big = s.length() > t.length() ? s.length() : t.length();


        return "";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String t = input.nextLine();
        int k = input.nextInt();

        appendAndDelete(s, t, k);
    }
}
