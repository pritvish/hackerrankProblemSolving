package pattern.print;

public class InvertHalfPyramid {
    public static void main(String[] args) {

        for (int i=6; i>0; i--) {
            for (int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
