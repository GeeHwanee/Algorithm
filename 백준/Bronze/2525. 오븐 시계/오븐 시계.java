import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        int time = input.nextInt();
        String[] r = result.split(" ");
        int H = Integer.parseInt(r[0]);
        int M = Integer.parseInt(r[1]);
        M+=time;
        if(M>=60){
            H+=M/60;
            M=M%60;
            if(H>=24){
                H-=24;
            }
        }
        System.out.println(H+" "+M);
    }
}