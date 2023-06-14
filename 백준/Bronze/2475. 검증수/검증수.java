import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = str.split(" ");
        int A = Integer.parseInt(result[0]);
        int B = Integer.parseInt(result[1]);
        int C = Integer.parseInt(result[2]);
        int D = Integer.parseInt(result[3]);
        int E = Integer.parseInt(result[4]);

        System.out.println(((A*A)+(B*B)+(C*C)+(D*D)+(E*E))%10);
    }
}
