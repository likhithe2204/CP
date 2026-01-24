import java.util.*;

public class Advantage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] strengths = new int[n];
            for (int i = 0; i < n; i++) {
                strengths[i] = scanner.nextInt();
            }

            int[] res = findDifference(n, strengths);
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[] findDifference(int n, int[] arr) {

        int[] copy = arr.clone();
        Arrays.sort(copy);

        int maxi = copy[n - 1];
        int nextMaxi = copy[n - 2]; // works even if maxi repeats

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] == maxi) {
                res[i] = arr[i] - nextMaxi;
            } else {
                res[i] = arr[i] - maxi;
            }
        }

        return res;
    }

}
