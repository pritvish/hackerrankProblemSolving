import java.util.Scanner;

public class RepeatedNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
            int x1 = 0;
            for (int i = 0; i < n; i++) {
                x1 ^= arr[i];
            }
            for (int i = 1; i <= n - 2; i++) {
                x1 ^= i;
            }
            int id = 0;
            for (int i = 0; i < 32; i++) {
                if ((x1 & 1 << i) != 0) {
                    id = i;
                    break;
                }

            }
            int x2 = 0;
            x1 = 0;
            for (int i = 0; i < n; i++) {
                if ((arr[i] & 1 << id) != 0)
                    x1 ^= arr[i];
                else
                    x2 ^= arr[i];
            }
            for (int i = 1; i <= n - 2; i++) {
                if ((i & 1 << id) != 0)
                    x1 ^= i;
                else
                    x2 ^= i;
            }
            if (x1 < x2)
                System.out.println(x1 + " " + x2);
            else
                System.out.println(x2 + " " + x1);
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
