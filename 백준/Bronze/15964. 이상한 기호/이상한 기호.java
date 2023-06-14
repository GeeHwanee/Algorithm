import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = str.split(" ");
        Long A = Long.parseLong(result[0]);
        Long B = Long.parseLong(result[1]);
        System.out.println((A+B)*(A-B));
    }
}
