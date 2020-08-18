package hackerrank;

import java.util.Scanner;

public class MatrixRotation {

    public static void matrixRightRotation(int arr[][],int N) {

        int newArr[][] = new int[N][N];

        for (int i=0; i<N; i++) {
            int temp = N-1;
            for (int j=0; j<N; j++) {
                newArr[i][j] = arr[temp][i];
                System.out.print(newArr[i][j]+" ");
                temp--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t=0; t<T; t++) {
            int N = scan.nextInt();

            int arr[][] = new int[N][N];

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            System.out.println("Case #"+(t+1)+":");
            matrixRightRotation(arr,N);
        }
    }
}
