package hackerrank;

public class SampleStringEvidence {
    public static void main(String[] args) {

        int[] ar = {1 ,2, 5, 6, 7};

        for (int i=0; i<ar.length-1; i++) {
            System.out.println(ar[i+1]+" "+ar[i]);
        }
    }
}
