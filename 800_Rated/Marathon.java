import java.util.*;

public class Marathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int cnt = 0;
            int a = scanner.nextInt(); // Timur Distance.

            int b = scanner.nextInt();
            if (b > a) cnt++;
            int c = scanner.nextInt();
            if (c > a) cnt++;
            int d = scanner.nextInt();
            if (d > a) cnt++;

            System.out.println(cnt);
        }

    }
}
