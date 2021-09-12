package competitive;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tests = scan.nextInt();

        scan.nextLine();
        for (int i = 0; i< tests; i++) {
            String word = scan.nextLine();

            if (word.length()>10 && word.length()<=100) {
                System.out.print(word.charAt(0));
                System.out.print(word.length()-2);
                System.out.println(word.charAt(word.length()-1));
            } else {
                System.out.println(word);
            }

        }


    }
}
