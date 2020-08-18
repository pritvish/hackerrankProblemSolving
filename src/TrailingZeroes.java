import java.util.Scanner;

public class TrailingZeroes {


    public static void main(String[] args) {


            long num = 20;

            int count = 0;
            for (int i = 5; (num/i)>=1; i*=5) {
                count += num/i;
            }
            System.out.println(count);
    }
}
