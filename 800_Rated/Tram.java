import java.util.*;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tramStops = scanner.nextInt();
        int[] passengersOut = new int[tramStops];
        int[] passengersIn = new int[tramStops];
        for (int i = 0; i < tramStops; i++) {
            passengersOut[i] = scanner.nextInt();
            passengersIn[i] = scanner.nextInt();
        }

        int result = findMinCapacityOfTram(tramStops, passengersOut, passengersIn);
        System.out.println(result);
    }

    public static int findMinCapacityOfTram(int n, int[] out, int[] in) {
        int cnt = 0, minCapacity = 0;

        for (int i = 0; i < n; i++) {
            cnt -= out[i]; // track passengers exiting from tram
            cnt += in[i];  // track passengers entering into tram
            minCapacity = Math.max(minCapacity, cnt); // track the minimum possible capacity of the tram
        }

        return minCapacity;
    }
}
