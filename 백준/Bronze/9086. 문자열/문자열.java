import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            String s1 = str.substring(0,1);
            String s2 = str.substring(str.length()-1,str.length());
            System.out.println(s1 + s2);
        }
    }
}
