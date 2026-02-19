import java.util.*;

public class OddSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = scanner.nextInt();
            }

            if (isOddSumSplit(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isOddSumSplit(int[] arr) {
        int evenCnt = 0, oddCnt = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCnt++;
            else oddCnt++;
        }
        return evenCnt == oddCnt;
    }
}
