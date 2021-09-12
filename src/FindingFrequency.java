import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingFrequency {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arsize = scan.nextInt();
        int[] ar = new int[arsize];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<arsize; i++) {
            ar[i] = scan.nextInt();
            // if element not present then put else increment value by 1
            if(map.containsKey(ar[i])) {
                map.put(ar[i],map.get(ar[i])+1);
            } else {
                map.put(ar[i],1);
            }
        }

        int querySize = scan.nextInt();
        int[] queryAr = new int[querySize];

        for (int i=0; i<querySize; i++) {
            queryAr[i]=scan.nextInt();

            if(map.containsKey(queryAr[i]))
                System.out.println(map.get(queryAr[i]));
            else
                System.out.println(0);
        }
    }
}
