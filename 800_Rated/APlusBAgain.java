import java.util.*;

public class APlusBAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int num = scanner.nextInt();

            int sum = findSumOfDigits(num);
            System.out.println(sum);
        }
    }

    public static int findSumOfDigits(int N) {
        int sum = 0;
        while (N != 0) {
            int rem = N % 10;
            sum += rem;
            N = N / 10;
        }
        return sum;
    }
}

