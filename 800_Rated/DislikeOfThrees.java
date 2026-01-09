import java.util.*;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();

            int cnt = 0, num = 0;
            while (cnt < k) {
                num++;
                if (num % 3 != 0 && num % 10 != 3) cnt++;
            }

            System.out.println(num);
        }
    }
}
