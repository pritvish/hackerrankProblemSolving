package hackerrank;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tests = scan.nextInt();

        for (int t=0; t<tests; t++) {

            int num = scan.nextInt();

            for (int i=0; i<num; i++) {
                for (int j=0; j<num; j++) {

                    if(i==0 || i==num-1) {
                        if (i==0&&j==num/2) {
                            System.out.print("*");
                            break;
                        } else if(i==num-1 && j==0) {
                            System.out.print("*");
                            break;
                        } else {
                            System.out.print(" ");
                        }
                    } else if(i<=num/2) {
                        if(j==(num/2)-i) {
                            System.out.print("*");
                        } else if(j==(num/2)+i) {
                            System.out.print("*");
                            break;
                        } else {
                            System.out.print(" ");
                        }
                    } else if (i>num/2) {
                        if(j==i-(num/2)) {
                            System.out.print("*");
                        } else if(j==num-1+(num/2)-1) {
                            System.out.print("*");
                            break;
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }

        }

    }
}
