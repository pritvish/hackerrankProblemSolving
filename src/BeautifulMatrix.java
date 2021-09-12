import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[][] = new int[5][5];
        int tempi = 0;
        int tempj = 0;

        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ar[i][j] = s.nextInt();
                if (ar[i][j] == 1) {
                    tempi = i;
                    tempj = j;
                    break outer;
                }
            }
        }

        System.out.println(Math.abs(tempi-2) + Math.abs(tempj-2));
    }
}
