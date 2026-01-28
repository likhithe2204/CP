import java.util.*;

public class HardProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long m = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            System.out.println(placeMaxMonkeys(m, a, b, c));
        }
    }

    public static long placeMaxMonkeys(long m, long a, long b, long c) {
        long row1 = Math.min(a, m);
        long row2 = Math.min(b, m);

        long free = (m - row1) + (m - row2);

        long extra = Math.min(c, free);

        return row1 + row2 + extra;
    }
}
