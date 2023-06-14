import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
            while (true) {
                String str = sc.nextLine();
                String[] result = str.split(" ");
                int A = Integer.parseInt(result[0]);
                int B = Integer.parseInt(result[1]);
                int C = Integer.parseInt(result[2]);
                if (A == 0 && B == 0 && C == 0) {
                    break;
                }
                if ((A * A) + (B * B) == (C * C)) {
                    list.add("right");
                }else if((A * A)+(C * C)==(B * B)){
                    list.add("right");
                 }else if((B * B)+(C * C)==(A * A)){
                    list.add("right");
                 }else {
                    list.add("wrong");
                }
            }
            list.forEach(a->System.out.println(a));
    }
}


