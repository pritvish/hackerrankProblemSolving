package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStrings {

    public static void main(String[] args) {

        String q1 = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";


        Pattern p = Pattern.compile(" (\\csv+or\\csv+) ");   // the pattern to search for
        Matcher m = p.matcher(q1);

        if (m.find())
        {
            // we're only looking for one group, so get it
            String theGroup = m.group(1);

            // print the group out for verification
            System.out.format("'%s'\n", theGroup);
        }
    }
}
