import java.util.*;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int house = scanner.nextInt();
        int result = findMinSteps(house);
        System.out.println(result);
    }

    public static int findMinSteps(int house) {
        return Math.ceilDiv(house, 5);
    }
}
