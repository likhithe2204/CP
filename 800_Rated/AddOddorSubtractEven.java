import java.util.*;

public class AddOddorSubtractEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int miniMovesRequired = toObtainBfromA(a, b);
            System.out.println(miniMovesRequired);
        }
    }

    public static int toObtainBfromA(int a, int b) {
        int cnt = 0;
        if (a > b) {
            int x = Math.abs(a - b);
            if (x % 2 == 0) cnt += 1;
            else cnt += 2;
        } else if (a < b) {
            int y = Math.abs(a - b);
            if (y % 2 == 0) cnt += 2;
            else cnt += 1;
        }

        return cnt; // if both a & b are equal -> cnt returns 0
    }
}
