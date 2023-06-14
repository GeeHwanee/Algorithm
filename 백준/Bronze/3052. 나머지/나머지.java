import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> divArray = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int divNum = input.nextInt(); input.nextLine();
           divArray.add(divNum%42);
        }
        System.out.println(divArray.size());
    }
}