package JavaTests;

public class StringTest {
    public static void main(String[] args) {

        String s1 = new String("str");
        String s2 = s1.intern();
        String s3 = "str";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3 );

    }
}
