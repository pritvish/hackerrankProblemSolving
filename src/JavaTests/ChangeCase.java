package JavaTests;

public class ChangeCase {

    public static char[] ranjeetkochange(String str) {

        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 90 && a[i] >= 65) { // agar capital hua

                a[i] = (char) (a[i] + 32);

            } else if(a[i] <= 122 && a[i] >= 97) { // agar small hua
                a[i] = (char) (a[i] - 32);
            }
        }

//        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        // a-97 z-122..... A-65 Z-90
        String str = "RanjEEt kuMAr";

        ranjeetkochange(str);

    }
}
