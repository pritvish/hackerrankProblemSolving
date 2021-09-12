import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LifeAndEverything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int num=sc.nextInt();
            if(num!=42)
                System.out.println(num);
            else
                break;

        }
    }
}
