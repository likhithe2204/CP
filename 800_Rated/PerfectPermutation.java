import java.util.*;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generatePerfectPermutations(n);
    }

    public static void generatePerfectPermutations(int n) {
        if (n % 2 != 0) {
            System.out.println("-1");
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            System.out.print((i + 1) + " " + i + " ");
        }
    }
}
