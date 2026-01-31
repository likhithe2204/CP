import java.util.*;

public class TwoElevators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // logic
            int elevator1 = Math.abs(a - 1);
            int elevator2 = Math.abs(b - c) + Math.abs(c - 1);

            if (elevator1 < elevator2) System.out.println("1");
            else if (elevator2 < elevator1) System.out.println("2");
            else System.out.println("3"); // both elevators take's same time.
        }
    }
}
