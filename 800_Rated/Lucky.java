import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String input = scanner.next();
            if (isLucky(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isLucky(String s) {
        int num = Integer.parseInt(s);
        int sum1 = 0, sum2 = 0, cnt = 0;
        while (num != 0) {
            int rem = num % 10;
            cnt++;
            if (cnt <= 3) {
                sum2 += rem;
            } else {
                sum1 += rem;
            }
            num = num / 10;
        }
        return sum1 == sum2;
    }
}
