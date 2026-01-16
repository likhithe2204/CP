import java.util.*;

public class GoodKid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = findMaxProductArr(n, arr);
            System.out.println(result);
        }
    }

    public static int findMaxProductArr(int n, int[] arr) {
        int mini = findMin(arr, n);
        for (int i = 0; i < n; i++) {
            if (arr[i] == mini) {
                arr[i]++;
                break;
            }
        }

        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= arr[i];
        }
        return prod;
    }

    public static int findMin(int[] arr, int n) {
        int mini = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }
}
