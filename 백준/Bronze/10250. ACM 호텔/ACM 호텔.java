import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int T = input.nextInt(); input.nextLine();
            check: for (int i=0; i < T; i++){
            String str = input.nextLine();
            String[] result = str.split(" ");
               int H = Integer.parseInt(result[0]);
               int W = Integer.parseInt(result[1]);
               int N = Integer.parseInt(result[2]);
               int num = 1;
                for (int j = 1; j <= W; j++) {
                    for (int k = 1; k <= H; k++) {
                        if(num==N){
                            System.out.println(k+(j<10?"0":"")+j);
                            continue check;
                        }
                        num++;
                    }
                }
            }
    }
}