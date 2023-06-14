import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); sc.nextLine();
        String str = sc.nextLine();
        String[] result = str.split(" ");
        int max = Integer.parseInt(result[0]);
        int min = Integer.parseInt(result[0]);
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(result[i]);
            if(num>= max)
                max = num;
            if(num<=min)
                min = num;
        }
        System.out.println(min+" "+max);
    }
}
