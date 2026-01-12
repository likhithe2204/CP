import java.util.*;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int next = scanner.nextInt();

        boolean ans = isNextPrime(start, next);
        if (ans) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean isNextPrime(int start, int next) {
        int nextPrime = 0;
        for (int i = start + 1; i <= 50; i++) {
            if (isPrime(i)) {
                nextPrime = i;
                break;
            }
        }
        return (next == nextPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
