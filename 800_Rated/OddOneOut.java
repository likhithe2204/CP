import java.util.*;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int ans = findOddOne(a, b, c);
            System.out.println(ans);
        }
    }

    public static int findOddOne(int a, int b, int c) {
        return a ^ b ^ c;
    }
}
