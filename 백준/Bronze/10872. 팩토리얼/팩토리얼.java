import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int N = input.nextInt();
       int result = 1;
       for (int i = 1; i <= N; i++) {
           result*=i;
       }
        System.out.println(result);
    }
}