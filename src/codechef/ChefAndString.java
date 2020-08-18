package codechef;

import java.util.Scanner;

public class ChefAndString {

    public static void chefAndString(String str) {
        int pairCount = 0;
        for (int s=0; s<str.length()-1; s++ ) {
            if(str.charAt(s)=='x') {
                if (str.charAt(s+1)=='y') {
                    pairCount++;
                    s++;
                }
            } else if(str.charAt(s)=='y') {
                if (str.charAt(s+1)=='x') {
                    pairCount++;
                    s++;
                }
            }
        }
        System.out.println(pairCount);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();

        for (int t=0; t<tests; t++) {
            String str = scan.next();
            chefAndString(str);
        }

    }
}
