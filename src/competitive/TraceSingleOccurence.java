package competitive;

public class TraceSingleOccurence {
    public static void main(String[] args) {

        int[] ar = {-3,-3,4,4,5,5,9,7,7};
        int res = ar[0];
        for (int i = 1; i<ar.length; i++) {
            res = res^ar[i];
        }
        System.out.println(res);
    }
}
