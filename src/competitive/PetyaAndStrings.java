package competitive;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if((int)str1.charAt(i)>str2.charAt(i)) {
                count++;
                break;
            } else if (str1.charAt(i)<str2.charAt(i)) {
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}
