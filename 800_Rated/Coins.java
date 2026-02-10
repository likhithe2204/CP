import java.util.*;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();

            if (canRepresentInBurles(n, k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean canRepresentInBurles(long n, long k) {
        return ((k % 2 == 1) || (k % 2 == 0 && n % 2 == 0));
    }
}
