import java.util.*;

public class MyFirstSortingProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a >= b) System.out.print(b + " " + a + "\n");
            else System.out.print(a + " " + b + "\n");
        }
    }
}
