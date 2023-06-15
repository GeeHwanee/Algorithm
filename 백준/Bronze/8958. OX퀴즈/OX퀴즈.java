import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(); input.nextLine();
        for (int i = 0; i < T; i++) {
            String str = input.nextLine();
            String[] result = str.split("X");
            int sum = 0;
            for (int j = 0; j < result.length; j++) {
                if(result[j].length()>0){
                    for (int k = result[j].length(); k>0; k--) {
                        sum += k;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}