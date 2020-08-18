package hackerrank;

public class StringCheckElements {
    public static void main(String[] args) {

        String str = "120000";
        int count = 0;

        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i)=='0') {
                count++;
            } else
                break;
        }
    }
}
