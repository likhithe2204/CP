import java.util.*;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int citizens = scanner.nextInt();
        int[] welfare = new int[citizens];
        for (int i = 0; i < citizens; i++) {
            welfare[i] = scanner.nextInt();
        }

        int result = findMinBurles(citizens, welfare);
        System.out.println(result);
    }

    public static int findMinBurles(int n, int[] arr) {
        int sum = 0;
        int max = findMax(arr);
        for (int i = 0; i < n; i++) {
            int change = max - arr[i];
            sum += change;
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
