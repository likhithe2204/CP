import java.util.*;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = wrongSubtraction(num, k);
        System.out.println(ans);
    }

    public static int wrongSubtraction(int num, int k) {
        while (k != 0) {
            int rem = num % 10;

            if (rem == 0) {
                num = num / 10;
            } else {
                num = num - 1;
            }

            k--;
        }
        return num;
    }
}
