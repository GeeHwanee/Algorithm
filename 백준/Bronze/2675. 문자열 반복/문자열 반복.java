import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Integer T = Integer.parseInt(str);
        String[] S = new String[T];
        for (int i = 0; i < T; i++) {
            S[i] = scanner.nextLine();
        }
        for (int i = 0; i < T; i++) {
                String[] result = S[i].split(" ");
                int R = Integer.parseInt(result[0]);
                String r = result[1];
                String P="";
                for (int j = 0; j < r.length(); j++) {
                    if(j+1!=r.length()){
                       P += r.substring(j, j + 1).repeat(R);

                    }else {
                        P += r.substring(j).repeat(R);
                    }
                }
                System.out.printf("%s\n",P);
        }
    }
}