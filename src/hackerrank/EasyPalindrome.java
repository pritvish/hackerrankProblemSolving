package hackerrank;

import java.util.Scanner;

public class EasyPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t=0; t<T; t++) {

            int N = scan.nextInt();

            char str[] = new char[N];


                str = scan.next().toCharArray();

            boolean result = true;
            for (int i=0; i<N/2; i++) {
                if (str[i]!=str[N-i-1]) {
                    result = false;
                    System.out.println("No");
                    break;
                }
            }
            if(result == true) {
                System.out.println("Yes");
            }
        }
    }
}
