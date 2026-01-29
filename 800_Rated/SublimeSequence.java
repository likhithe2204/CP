import java.util.*;

public class SublimeSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(findSumOfSequence(x, n));
        }
    }

    public static int findSumOfSequence(int x, int n) {
        return (n % 2 == 0) ? 0 : x;
    }
}
