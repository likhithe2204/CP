import java.util.*;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            if (isFair(a, b, c, d)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isFair(int a, int b, int c, int d) {
        int maxi = findMaxi(a, b, c, d);
        int secMaxi = findSecondMaxi(a, b, c, d);

        if (a == maxi && b == secMaxi || a == secMaxi && b == maxi ||
                c == maxi && d == secMaxi || c == secMaxi && d == maxi) return false;
        else return true;
    }

    public static int findMaxi(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int findSecondMaxi(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        return arr[2];
    }
}
