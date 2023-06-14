import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.trim();
        if(s.length() > 0){
            String[] result = s.split(" ");
            System.out.println(result.length);
        }else {
            System.out.println(0);
        }
    }
}
