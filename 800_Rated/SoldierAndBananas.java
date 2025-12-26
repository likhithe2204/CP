import java.util.*;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int costOfFirstBanana = scanner.nextInt();
        int initialDollars = scanner.nextInt();
        int reqBananas = scanner.nextInt();

        int ans = extraAmtRequired(costOfFirstBanana, initialDollars, reqBananas);
        System.out.println(ans);
    }

    public static int extraAmtRequired(int k, int n, int w) {
        long totalCost = 0;

        // calculate the total cost
        for (int i = 1; i <= w; i++) {
            totalCost += (long) i * k;
        }

        // check if borrow is required
        if (totalCost > n) {
            return (int) (totalCost - n);
        }

        return 0;
    }
}
