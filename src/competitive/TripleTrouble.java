package competitive;

import java.util.Scanner;

public class TripleTrouble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int low = 0, high = n - 1;
            mergesort(arr, low, high);

            int ones = 0, twos = 0;
            int common_bit;

            for(int i=0; i<n; i++ )
            {
                twos = twos | (ones & arr[i]);

                ones = ones ^ arr[i];

                common_bit = ~(ones & twos);

                ones &= common_bit;

                twos &= common_bit;
            }

            System.out.println(ones);
        }


    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low == high)
            return;
        int mid = (high + low) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);


    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int p1 = low;
        int p2 = mid + 1;
        int tem[] = new int[high - low + 1];
        int k = 0;
        while (p1 <= mid && p2 <= high) {
            if (arr[p1] < arr[p2])
                tem[k++] = arr[p1++];
            else
                tem[k++] = arr[p2++];
        }
        while (p1 <= mid)
            tem[k++] = arr[p1++];
        while (p2 <= high)
            tem[k++] = arr[p2++];
        for (int i = low; i <= high; i++)
            arr[i] = tem[i - low];
    }
}
