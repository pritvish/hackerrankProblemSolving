import java.util.Arrays;

public class SameWord {

    public static void main(String[] args) {
        String s1 = "fried";
        String s2 = "fired";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        boolean result = true;

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        if(s1.length()==s2.length() ) {

            for (int i=0; i<s1.length(); i++) {
                if (ch1[i]==ch2[i]) {
                    continue;
                } else {
                    result = false;
                    break;
                }
            }

            if(result == true)
                System.out.println("Strings are same");
            else
                System.out.println("Strings are not same");


        }
    }
}
