import java.util.*;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            for (int i = 2; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.print(1);
            System.out.println();
        }
    }
}
