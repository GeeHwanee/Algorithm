import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int T = input.nextInt(); input.nextLine();
       int[] result = new int[T];
       for (int i = 0; i < T; i++) {
           String str = input.nextLine();
           String[] AB = str.split(" ");
           int A = Integer.parseInt(AB[0]);
           int B = Integer.parseInt(AB[1]);
           result[i] = A+B;
       }
       for (int i = 0; i < T; i++) {
           System.out.println(result[i]);
       }
    }
}