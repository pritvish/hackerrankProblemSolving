package strings;

public class EqualityTest {

    public static void main(String[] args) {

        String s1 = "str";
        String s2 = "str";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("str");

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        String s4 = new String("str");

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
