package hackfestOctober;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollectIntegers {

    public static List<Integer> getIntegerList() {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(1);
        arr.add(1);
        arr.add(4);
//        arr.add(5);
        return arr;
    }

    public static void main(String[] args) {

        List<Integer> arr  = getIntegerList();

//        int sum1 = arr.stream()
//                .filter(a -> a % 2 == 0)
//                .mapToInt(a -> a)
//                .sum();
//
//        int sum2 = arr.stream()
//                .filter(a -> a % 2 != 0)
//                .mapToInt(a -> a)
//                .sum();
//
//        System.out.println(sum1 +" "+ sum2);
//        int result = 0;
//
//        if (sum1 > sum2) {
//            result = 2*sum2;
//        } else {
//            result = 2*sum1;
//        }
//        System.out.println(result);

        int sum1 = 0;
        int sum2 = 0;
        int result = 0;
        int count = 0;

        for(Integer i : arr) {
            if(count%2 ==0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
            count++;
        }

        if (sum1 > sum2) {
            result = 2*sum2;
        } else {
            result = 2*sum1;
        }
        System.out.println(result);
    }
}
