package hackerrank;

public class Factorial {
    public static void main(String[] args) {
        int num  = 20;
        int fact = num;
        for (int i=1; i<num-1; i++ ) {

            fact = fact*(num-i);

        }
        System.out.println(fact);
    }
}
