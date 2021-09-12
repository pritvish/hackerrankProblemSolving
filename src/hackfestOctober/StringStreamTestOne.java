package hackfestOctober;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringStreamTestOne {

    static List<String> getStringList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Str");
        stringList.add("Sdsagtr");
        stringList.add("Stfdr");
        stringList.add("evsfg");
        stringList.add("ewgStr");
        stringList.add("Stethr");
        stringList.add("Svwergrtr");
        stringList.add("Sqevgtr");
        return stringList;
    }

    public static void main(String[] args) {
        List<String> stringList = getStringList();

//        stringList.stream().forEach(System::p);
//        Stream.of(stringList).forEach();
        stringList.stream().forEach(System.out::println);
    }
}
