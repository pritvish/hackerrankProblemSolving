import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SweetSelection {



    // Complete the whichSweetShouldIBring function below.
    static String whichSweetShouldIBring(List<String> votes) {

        Map<String, Integer> frequency = new HashMap<String, Integer>();
        int leastCount = Integer.MAX_VALUE;

        for(String str : votes) {
            if(frequency.containsKey(str)) {
                frequency.put(str,frequency.get(str)+1);
            } else {
                frequency.put(str,1);
            }
            if(frequency.get(str) < leastCount) {
                leastCount = frequency.get(str);
            }
        }

        // we would store the duplicates values in a list
        List<String> duplicates = new ArrayList<>();

        for(String key : frequency.keySet()){
            if (leastCount == frequency.get(key)) {
                duplicates.add(key);
            }
        }

        if (duplicates.size() != 1) {
            if (duplicates.get(0).compareTo(duplicates.get(1)) > 0) {
                return duplicates.get(1);
            } else {
                return duplicates.get(0);
            }
        } else {
            String result = null;
            Set<Map.Entry<String, Integer>> entries = frequency.entrySet();
            for (Map.Entry entry : entries) {
                if(entry.getValue().equals(leastCount)) {
                    result = (String) entry.getKey();
                }
                break;
            }
            return result;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int votesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> votes = new ArrayList<>();

        IntStream.range(0, votesCount).forEach(i -> {
            try {
                votes.add(bufferedReader.readLine());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        String res = whichSweetShouldIBring(votes);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
