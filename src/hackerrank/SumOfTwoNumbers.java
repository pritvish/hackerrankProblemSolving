package hackerrank;

import java.util.Scanner;

public class SumOfTwoNumbers {
    static int totalSum(int arr[], int N) {
        int arraySum = 0;
        for (int i = 0; i < N; i++) {
            arraySum = arraySum + arr[i];
        }
        return arraySum;
    }

    static int sumExcept(int currentSum, int totalSum) {
        return totalSum - currentSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            int arr[] = new int[N];
            for (int a = 0; a < N; a++) {
                arr[a] = scan.nextInt();
            }

            int totalSum = totalSum(arr, N);

            boolean result = false;

            case1:
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (arr[i]+arr[j]==sumExcept(arr[i]+arr[j],totalSum)) {
                        result = true;
                        System.out.println("Yes");
                        break case1;
                    }
                }
            }
            if(result == false) {
                System.out.println("No");
            }
        }
    }
}
