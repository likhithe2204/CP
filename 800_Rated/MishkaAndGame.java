import java.util.*;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }

        int result = findWinner(n, m, c);
        if (result == 0) System.out.println("Mishka");
        else if (result == 1) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }

    public static int findWinner(int n, int[] m, int[] c) {
        int mishka = 0, chris = 0;
        for (int i = 0; i < n; i++) {
            if (m[i] > c[i]) mishka++;
            else if (m[i] < c[i]) chris++;
        }

        if (mishka > chris) return 0;
        else if (mishka < chris) return 1;
        else return 2;
    }
}
