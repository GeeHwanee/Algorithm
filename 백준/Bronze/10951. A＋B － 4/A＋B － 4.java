import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        while (input.hasNext()){
                String str = input.nextLine();
                String[] AB = str.split(" ");
               int A = Integer.parseInt(AB[0]);
               int B = Integer.parseInt(AB[1]);
                int sum = A + B;
        System.out.println(sum);
        }
    }
}