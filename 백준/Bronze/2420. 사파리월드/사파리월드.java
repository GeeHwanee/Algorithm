import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String str = input.nextLine();
       String[] result = str.split(" ");
       long N = Long.parseLong(result[0]);
       long M = Long.parseLong(result[1]);

       System.out.println(Math.abs(N-M));
    }
}