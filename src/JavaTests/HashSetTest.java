package JavaTests;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("London");
//        set.add("Paris");
//        set.add("New York");
//        set.add("Moscow");
//        set.add("Tokyo");
//        set.add("Barcelona");

        System.out.println(set.size());
        System.out.println(set.toString());
    }
}
