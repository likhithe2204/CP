import java.util.*;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int ans = yearWithUniqueDigits(num);
        System.out.println(ans);
    }

    public static int yearWithUniqueDigits(int n) {
        for (int i = n + 1; i <= 10000; i++) {
            if (isUnique(i)) return i;
        }
        return 0;
    }

    public static boolean isUnique(int N) {
        // 1. extract the digits
        // 2. store in the hashmap
        // 3. get the length of hashmap

        int rem = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (N != 0) {
            rem = N % 10;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
            N = N / 10;
        }

        return map.size() == 4;
    }
}
