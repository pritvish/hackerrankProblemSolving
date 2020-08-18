import java.util.HashSet;
import java.util.Set;

public class LongestContiguosSubarray {
    public static void main(String[] args) {

        Integer arr[] = {3,4,5,6,2,3,5,7,8,6,2,4,6,8,4,5,7,8,0};
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=0; i<arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }

        for(int i : set) {
            System.out.print(i+" ");
        }

    }
}
