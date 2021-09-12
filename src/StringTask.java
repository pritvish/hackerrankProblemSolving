import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        List<Character> ch = new ArrayList<>();
        int chIdx = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U' || str.charAt(i) == 'y' || str.charAt(i) == 'Y')) {
                if (!Character.isUpperCase(str.charAt(i))) {
                    ch.add('.');
                    ch.add(str.charAt(i));
                } else {
                    ch.add('.');
                    ch.add(Character.toLowerCase(str.charAt(i)));
                }
            }
        }

        for (char c : ch) {
            System.out.print(c);
        }
    }
}
