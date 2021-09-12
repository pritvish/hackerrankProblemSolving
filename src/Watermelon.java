import java.util.*;
import java.lang.*;
import java.io.*;

public  class Watermelon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w  = scan.nextInt();

        if(w%2==0&& w>=4 && w<=100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
