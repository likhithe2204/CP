import java.util.*;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limak = scanner.nextInt();
        int bob = scanner.nextInt();
        int ans = countYears(limak, bob);
        System.out.println(ans);
    }

    public static int countYears(int a, int b) {
        int cnt = 0;
        while (a <= b) {
            cnt++;
            a *= 3;
            b *= 2;
        }
        return cnt;
    }
}
