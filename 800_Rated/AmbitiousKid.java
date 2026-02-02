import java.util.*;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(minOperations(n, arr));
    }

    public static int minOperations(int n, int[] arr) {
        // convert all negative integers -> positive integers
        // find minimum
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) arr[i] = arr[i] * -1;
            mini = Math.min(mini, arr[i]);
        }

        return mini;
    }
}

