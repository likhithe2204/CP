import java.util.*;
public class Watermelon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        String result = isPositiveWeight(w);
        System.out.println(result);
    }
    public static String isPositiveWeight(int input){
        // edge case : if input = 2, we cannot divide with even numbers -> {1, 1}
        if(input % 2 == 0 && input >= 4) return "YES";
        return "NO";
    }
}