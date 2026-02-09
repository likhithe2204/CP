import java.util.*;

public class XAxis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int x3 = scanner.nextInt();

            System.out.println(findSmallestPossibleDistance(x1, x2, x3));
        }
    }

    public static int findSmallestPossibleDistance(int x1, int x2, int x3) {
        int[] arr = {x1, x2, x3};
        Arrays.sort(arr);
        int mid = arr[1];
        return Math.abs(x1 - mid) + Math.abs(x2 - mid) + Math.abs(x3 - mid);
    }
}
