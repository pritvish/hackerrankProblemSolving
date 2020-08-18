package bitwise;

public class BitPrint {
    public static void main(String[] args) {
        int count = 0;

        for (int i=421; i>=1; i=i/2) {
            if (i%2==1) {
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
