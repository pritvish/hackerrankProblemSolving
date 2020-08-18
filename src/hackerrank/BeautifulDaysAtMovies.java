package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulDaysAtMovies {

    static public int size(int n) {
        int size = 0;
        while (n!=0) {
            n /= 10;
            size++;
        }
        return size;
    }

    static int reverse(int n) {
        int size = size(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<size; i++) {
            if(n%10 !=0) {
                sb = sb.append(n%10);
            }
            n /= 10;
        }
        int num = Integer.parseInt(sb.toString());
        return num;
    }

    static public int getBeautifulDaysAtMovies(int i, int j, int k) {
        int diff = 0;
        int count = 0;
        for (int x = i; x<j; x++) {
            diff = x-reverse(x);
            if (diff%k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        int j = s.nextInt();
        int k = s.nextInt();
        getBeautifulDaysAtMovies(i,j,k);
    }
}
