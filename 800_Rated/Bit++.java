import java.util.*;

public class Bitplusplus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Total # operations
        scanner.nextLine();
        ArrayList<String> operations = new ArrayList<>();
        for(int i = 0; i < t; i++){
            operations.add(scanner.nextLine());
        }
        int result = findValue(operations);
        System.out.println(result);
    }
    public static int findValue(ArrayList<String> operations){
        int X = 0;
        for(String op : operations){
            if(op.contains("++")){
                X++;
            }
            else{
                X--;
            }
        }
        return X;
    }
}
