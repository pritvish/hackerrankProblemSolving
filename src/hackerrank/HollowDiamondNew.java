package hackerrank;

public class HollowDiamondNew {
    public static void main(String[] args) {
        int num = 5;

        int j = 0;

        for (int i = 0; i < num; i++) {
            int initcount = 0;
            if (i == 0 || i == num - 1) {
                for (j = 0; j < num; j++) {
                    if ((i == 0 && j == num / 2) || (i == num - 1 && j == num / 2)) {
                        System.out.print("*");
                        break;
                    } else
                        System.out.print(" ");
                }
            } else {
                if(i<=num/2) {
                    for (j = 0; j < num; j++) {
                        if(j==(num/2)-i || j==(num/2)+i) {
                            System.out.print("*");
                            initcount++;
                        } else
                            System.out.print(" ");

                        if(initcount == 2) {
                            break;
                        }
                    }
                } else {
                    for (j = 0; j < num; j++) {
                        if(j==i-(num/2) || j==(num-1)-(i-(num/2))) {
                            System.out.print("*");
                            initcount++;
                        } else
                            System.out.print(" ");

                        if(initcount == 2) {
                            break;
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}
