package _20230613;

import java.util.Scanner;

public class BJ9498 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();

        if (result>=90){
            System.out.println("A");
        }else if(result >=80){
            System.out.println("B");
        }else if(result >=70){
            System.out.println("C");
        }else if(result >=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}