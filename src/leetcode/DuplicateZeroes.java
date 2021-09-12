package leetcode;

public class DuplicateZeroes {

    public static void main(String[] args) {
        int ar[] = {1,0,2,3,0,4,5,0};

        for (int i=0; i<ar.length-1; i++) {
            if (ar[i] == 0) {
                for (int index = ar.length-1; index > i+1; index--) {
                    ar[index] = ar[index-1];
                }
                ar[i+1] = 0;
                i++;
            }
        }

        for (int i : ar) {
            System.out.print(i+" ");
        }
    }
}
