import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); sc.nextLine();
        String str = sc.nextLine();
        String[] result = str.split("");
        int num = 0;
        for (int i = 0; i < N; i++) {
            num += Integer.parseInt(result[i]);
        }
        System.out.println(num);
    }
}
