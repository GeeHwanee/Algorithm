import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = str.split(" ");
        int A = Integer.parseInt(result[0]);
        int B = Integer.parseInt(result[1]);
        System.out.println((A+B)*(A-B));
    }
}
