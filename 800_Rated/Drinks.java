import java.util.*;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int drinks = scanner.nextInt();
        int[] fractionalVol = new int[drinks];
        for (int i = 0; i < drinks; i++) {
            fractionalVol[i] = scanner.nextInt();
        }

        double finalDrink = findOrangeJuiceVol(drinks, fractionalVol);
        System.out.println(finalDrink);
    }

    public static double findOrangeJuiceVol(int n, int[] vol) {
        // Step1 : Take (X/100) common for each drink in vol[] ~ eg: x/100(50 50 100) = 2*X
        // Step2 : Take equal proportions of n drinks = (n * x)
        // Step3 : Obtain the result of (1)/(2) & multiply by 100.

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vol[i];
        }
        double numerator = sum / 100;
        
        return (numerator / n) * 100;
    }
}
