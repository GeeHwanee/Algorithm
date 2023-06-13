package _20230613;

import java.util.Scanner;

public class BJ2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        String[] r = result.split(" ");
        int H = Integer.parseInt(r[0]);
        int M = Integer.parseInt(r[1]);
            M -= 45;
        if(M<0){
            M = 60-Math.abs(M);
            H-=1;
            if(H<0){
                H=23;
            }
        }
        System.out.println(H+" "+M);
    }
}