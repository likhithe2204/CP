import java.util.*;

public class Horseshoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] colors = new long[4];
        for (int i = 0; i < 4; i++) {
            colors[i] = scanner.nextLong();
        }

        int result = minShoesToBuy(colors);
        System.out.println(result);
    }

    public static int minShoesToBuy(long[] arr) {
        Arrays.sort(arr); // cuz there might be mixed order of duplicates.
        int n = arr.length, cnt = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) cnt++;
        }
        return cnt;
    }
}
