import java.util.*;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(findTotalGoals(n - 1, arr));
        }
    }

    public static int findTotalGoals(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return (sum * -1);
    }
}
