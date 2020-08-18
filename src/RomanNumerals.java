import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        String str = "LIV"; // IV     LIX

        char[] ch = str.toCharArray();

        Map<Character,Integer> values = new HashMap<>();
        values.put('V',5);
        values.put('I',1);
        values.put('X',10);
        values.put('L',50);

        int sum = 0;

        for(int i=ch.length-1; i>=0; i--) {

            if(ch[i]=='I' && ch[i+1]!='I' && ch[i]!=ch.length-1) {
                sum = sum - values.get(ch[i]);
            } else {
                sum = sum + values.get(ch[i]);
            }


        }
        System.out.println(sum);




    }
}
