import java.util.*;

public class GrabTheCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            if (canMihaiWIN(n, arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean canMihaiWIN(int n, int[] arr) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) evenSum += arr[i];
            else oddSum += arr[i];
        }

        return (evenSum > oddSum);
    }
}
